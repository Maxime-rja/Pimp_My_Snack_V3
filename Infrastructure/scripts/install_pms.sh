#!/bin/bash

IP=$(hostname -I | awk '{print $2}')
APT_OPT="-o Dpkg::Progress-Fancy="0" -q -y"
LOG_FILE="/vagrant/logs/install_pms.log"
DEBIAN_FRONTEND="noninteractive"

echo "START - Configuration Website  - "$IP
cd /var/www/html
sleep 3

sudo git clone --branch Dev https://github.com/Maxime-rja/Pimp_My_Snack_V3.git
sleep 3

sudo cp -r /var/www/html/Pimp_My_Snack_V3/Template/* /var/www/html/


echo "Restarting Apache..."
service apache2 restart
