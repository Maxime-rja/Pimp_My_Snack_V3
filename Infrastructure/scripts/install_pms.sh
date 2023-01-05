#!/bin/bash

IP=$(hostname -I | awk '{print $2}')
APT_OPT="-o Dpkg::Progress-Fancy="0" -q -y"
LOG_FILE="/vagrant/logs/install_pms.log"
DEBIAN_FRONTEND="noninteractive"

echo "START - Configuration Website  - "$IP
cd /var/www/html
sleep 3

sudo rm index.html
sleep 3

echo "dl de test.html"
#BURGER HTML
wget 'https://raw.githubusercontent.com/Maxime-rja/Pimp_My_Snack/Dev/Dev/Template/burger.html?token=GHSAT0AAAAAAB5DJF2OIJCM6DM4LSKTHH4QY5W7KDA'
sudo cp 'burger.html?token=GHSAT0AAAAAAB5DJF2OIJCM6DM4LSKTHH4QY5W7KDA' burger.html
sudo rm 'burger.html?token=GHSAT0AAAAAAB5DJF2OIJCM6DM4LSKTHH4QY5W7KDA'



#CONTACT
wget 'https://raw.githubusercontent.com/Maxime-rja/Pimp_My_Snack/Dev/Dev/Template/contact.html?token=GHSAT0AAAAAAB5DJF2PUWTDZ4M5HFGXYD5AY5W7CEA'
sudo cp 'contact.html?token=GHSAT0AAAAAAB5DJF2PUWTDZ4M5HFGXYD5AY5W7CEA' contact.html
sudo rm 'contact.html?token=GHSAT0AAAAAAB5DJF2PUWTDZ4M5HFGXYD5AY5W7CEA'

#HOME PAGE
wget 'https://raw.githubusercontent.com/Maxime-rja/Pimp_My_Snack/Dev/Dev/Template/index.html?token=GHSAT0AAAAAAB5DJF2PB2EMO4WXRGL5VHNYY5W7C5Q'
sudo cp 'index.html?token=GHSAT0AAAAAAB5DJF2PB2EMO4WXRGL5VHNYY5W7C5Q' index.html
sudo rm 'index.html?token=GHSAT0AAAAAAB5DJF2PB2EMO4WXRGL5VHNYY5W7C5Q'

#BURGER CSS
mkdir css
cd css/
wget 'https://raw.githubusercontent.com/Maxime-rja/Pimp_My_Snack/Dev/Dev/Template/css/style.css?token=GHSAT0AAAAAAB5DJF2ODSREFF2IXGUZCZ6GY5W7ONA'
sudo cp 'style.css?token=GHSAT0AAAAAAB5DJF2ODSREFF2IXGUZCZ6GY5W7ONA' style.css
sudo rm 'style.css?token=GHSAT0AAAAAAB5DJF2ODSREFF2IXGUZCZ6GY5W7ONA'



echo "Restarting Apache..."
service apache2 restart
