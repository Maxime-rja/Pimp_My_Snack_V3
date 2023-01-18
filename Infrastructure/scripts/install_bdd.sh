#!/bin/bash

## install Mariadb server (ex Mysql))

IP=$(hostname -I | awk '{print $2}')
APT_OPT="-o Dpkg::Progress-Fancy="0" -q -y"
LOG_FILE="/vagrant/logs/install_bdd.log"
DEBIAN_FRONTEND="noninteractive"

#Utilisateur a créer (si un vide alors pas de création)
DBNAME="moodle"
DBUSER="moodle_user"
DBPASSWD="network"
#Fichier sql à injecter (présent dans un sous répertoire)
DBFILE="files/backup/dump/latest-save.sql"

echo "START - install MariaDB - "$IP

echo "=> [1]: Install required packages ..."
DEBIAN_FRONTEND=noninteractive
apt-get update
apt-get install -o Dpkg::Progress-Fancy="0" -q -y \
	mariadb-server \
	mariadb-client \
  vim \
   >> $LOG_FILE 2>&1

echo "=> [2]: Configuration du service"
if [ -n "$DBNAME" ] && [ -n "$DBUSER" ] && [ -n "$DBPASSWD" ] ;then
  mysql -e "CREATE DATABASE $DBNAME" \
  >> $LOG_FILE 2>&1
  mysql -e "grant all privileges on $DBNAME.* to '$DBUSER'@'%' identified by '$DBPASSWD'" \
  >> $LOG_FILE 2>&1
fi

echo "=> [3]: Configuration de BDD"
if [ -f "$DBFILE" ] ;then
  mysql < /vagrant/$DBFILE \
  >> $LOG_FILE 2>&1
fi


echo "Changing localhost to 0.0.0.0"
sed -i 's/127.0.0.1/0.0.0.0/g' /etc/mysql/mariadb.conf.d/50-server.cnf

sudo mkdir /usr/bin/backup
sudo cp /vagrant/backup/scripts/backup.sh /usr/bin/backup/backup.sh
apt install dos2unix
dos2unix /usr/bin/backup/backup.sh

systemctl restart mariadb


echo "END - install MariaDB"
