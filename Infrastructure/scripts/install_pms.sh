#!/bin/bash

IP=$(hostname -I | awk '{print $2}')
APT_OPT="-o Dpkg::Progress-Fancy="0" -q -y"

#Installation de GIT pour pouvoir télécharger les fichiers de dev présent sur le GitHub commun 
echo "=> [1]: Updating and installing Git..."
apt-get update $APT_OPT \
sleep 3
sudo apt-get -y install git



# Affichage pour l'éxecution du script 
echo "START - Configuration Website  - "$IP

#Déplacement dans le fichier /var/www/html
cd /var/www/html

#Recherche de fichier en .html 
#Si il existe des fichiers .html -> on supprime (pour eviter les conflits) sinon rien 
#Si il existe des repertoires de la version du site déployé précedemment -> on supprime (pour eviter les conflits) 
files=`ls -1 *.html 2>/Main-Infra-Dev/null` 
if [ -n "$files" ]; then
  rm -f $files
  sleep 3
  sudo rm -r css/ img/ js/ mail/ lib/ mail/ Pimp_My_Snack_V3/
  echo "Fichiers .html supprimés avec succès"
else
  echo "Aucun fichier .html trouvé dans le dossier courant"
fi

#Utilisation de la commande GIT pour cloner le repertoire dev dans le repertoire /var/www/html
sudo git clone --branch Main-Infra-Dev https://github.com/Maxime-rja/Pimp_My_Snack_V3.git
sleep 3

#Copie du dossier Template dans /var/www/html pour que le serveur web pointe directement vers notre index.html
sudo cp -r /var/www/html/Pimp_My_Snack_V3/Template/* /var/www/html/

#Reboot du serveur web
echo "Restarting Apache..."
service apache2 restart
