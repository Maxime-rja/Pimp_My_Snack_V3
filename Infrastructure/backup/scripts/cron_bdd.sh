#!/bin/bash

#Ce code revient à utiliser la commande crontab -e et à modifier le fichier proposé en suivant
#Cela permet d'automatiser de manière récurrente l'éxécution du script backup.sh placé dans le /usr/bin/backup/backup.sh

guard_comment='# == my custom scheduler =='

sudo crontab -l >mycron

grep -qF "$guard_comment" mycron && exit 0

# echo new cron into cron file
echo "$guard_comment" >>mycron

#echo "*/1 * * * * echo "Test du crontab" >>mycron
echo "*/720 * * * * bash /usr/bin/backup/backup.sh" >>mycron #schedule the delete script

# install new cron file
crontab mycron
rm mycron