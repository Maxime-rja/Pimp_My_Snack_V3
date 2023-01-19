#!/bin/bash

#Utilisation de mysqldump pour la sauvegarde de la base de données à l'emplacement /vagrant/backup/dump/sauvegarde... 
#Toutes les sauvegardes ont un nom différent, cela permet d'avoir toutes les versions en cas de sauvegarde corrompue
sudo mysqldump --databases phpmyadmin > /vagrant/backup/dump/sauvegarde-$(date +%Y%m%d%H%M%S).sql

#Utilisation de la même commande pour la sauvegarde de la bdd sous un nom unique
#Le fichier sauvegardé va donc écraser le précédent
sudo mysqldump --databases phpmyadmin > /vagrant/backup/dump/latest-save.sql

#Utilisation du fichier "latest-save.sql" que collons à l'emplacement /vagrant/files/create_tables.sql 
#afin de remplacer le fichier dékà existant utilisé pour la création de la bdd lors du déploiement des machines 
sudo cp /vagrant/backup/dump/latest-save.sql /vagrant/files/create_tables.sql