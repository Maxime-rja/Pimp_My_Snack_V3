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

#Ajout de apt-get update car durant le projet problème d'installation 
#de maria-db à cause de cela ou du moins résolu grâce à cela
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

##2.3 : Dissocation de la base de données

#Ouverture du port 3306 pour la communication entre le serveur web et le serveur base de données
#utilisation de la commande sed -i pour modifier une adresse en une autre dans un fichier précis

echo "Changing localhost to 0.0.0.0"
sed -i 's/127.0.0.1/0.0.0.0/g' /etc/mysql/mariadb.conf.d/50-server.cnf

#On redémarre mariadb pour rendre les changements effectifs
systemctl restart mariadb

## 3.2 & 3.3 
#Création du dossier à l'emplacement /usr/bin/backup dans lequel on copie un fichier que nous avons préalablement modifié localement 
#et qui comprend la commande de sauvegarde de la base de données 

sudo mkdir /usr/bin/backup
sudo cp /vagrant/backup/scripts/backup.sh /usr/bin/backup/backup.sh


#On reconditionne le format du script backup.sh au cas où il se serait transformé 
#en fichier windows à l'aide commande dos2unix que nous installons préalablement

apt install dos2unix
dos2unix /usr/bin/backup/backup.sh

#On redémarre mariadb pour rendre les changements effectifs
systemctl restart mariadb


echo "END - install MariaDB"
