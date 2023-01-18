#!/bin/bash

guard_comment='# == my custom scheduler =='

sudo crontab -l >mycron

grep -qF "$guard_comment" mycron && exit 0

# echo new cron into cron file
echo "$guard_comment" >>mycron
echo "*/30 * * * * bash /usr/bin/backup/backup.sh" >>mycron #schedule the delete script

# install new cron file
crontab mycron
rm mycron