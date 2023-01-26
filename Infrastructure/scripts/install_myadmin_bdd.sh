#!/bin/bash

## install PhpMyAdmin-BDD Application

#Récupération et modification du fichier install_myadmin pour l'installation de myadmin sur la base de données 

IP=$(hostname -I | awk '{print $2}')

APT_OPT="-o Dpkg::Progress-Fancy="0" -q -y"
LOG_FILE="/vagrant/logs/install_myadmin_bdd.log"
DEBIAN_FRONTEND="noninteractive"
MYADMIN_VERSION="5.1.1"

##Méthode utilisée :

#Nous avons télécharger le fichier zip depuis le lien ci-dessous présent dans le fichier install_myadmin
#https://files.phpmyadmin.net/phpMyAdmin/5.1.1/phpMyAdmin-5.1.1-all-languages.zip
#Puis nous avons copier le fichier create-tables.sql dans le dossier sql et l'avons collé dans nos fichiers locaux dans le dossier /files
#Et nous précisons le chemin vers ce fichier pour la création de la bdd ci-dessous

mysql -e "CREATE DATABASE phpmyadmin" \
>> $LOG_FILE 2>&1
  mysql -e "GRANT ALL PRIVILEGES ON phpmyadmin.* TO 'pma'@'%' IDENTIFIED BY 'pmapass'"
  mysql < /vagrant/files/create_tables.sql
>> $LOG_FILE 2>&1




