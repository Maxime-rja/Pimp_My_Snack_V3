#!/bin/bash

guard_comment='# == my custom scheduler =='

sudo crontab -l >mycron

grep -qF "$guard_comment" mycron && exit 0

# echo new cron into cron file
echo "$guard_comment" >>mycron

#echo "*/1 * * * * echo "Test du crontab" >>mycron
echo "*/30 * * * * bash /usr/bin/backup/backup.sh" >>mycron #schedule the delete script
echo "*/30 * * * * sudo mysqldump --databases phpmyadmin > /vagrant/backup/dump/latest-save.sql" >>mycron

# install new cron file
crontab mycron
rm mycron