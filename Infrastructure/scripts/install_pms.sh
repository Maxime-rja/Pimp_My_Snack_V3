#!/bin/bash

IP=$(hostname -I | awk '{print $2}')
APT_OPT="-o Dpkg::Progress-Fancy="0" -q -y"

# ADD INSTALL DE GIT + LOG 
echo "=> [1]: Updating and installing Git..."
apt-get update $APT_OPT \
sleep 3
sudo apt-get -y install git



# Upgrade le script pour fichiers existants
echo "START - Configuration Website  - "$IP
cd /var/www/html
#Deleting old files 
files=`ls -1 *.html 2>/dev/null` 
if [ -n "$files" ]; then
  rm -f $files
  sleep 3
  sudo rm -r css/ img/ js/ mail/ lib/ mail/ Pimp_My_Snack_V3/
  echo "Fichiers .html supprimés avec succès"
else
  echo "Aucun fichier .html trouvé dans le dossier courant"
fi

#Cloning the git repertory 
sudo git clone --branch Dev https://github.com/Maxime-rja/Pimp_My_Snack_V3.git
sleep 3

#Copying the files to the right path 
sudo cp -r /var/www/html/Pimp_My_Snack_V3/Template/* /var/www/html/


echo "Restarting Apache..."
service apache2 restart
