#!/bin/bash

## install PhpMyAdmin Application

IP=$(hostname -I | awk '{print $2}')

APT_OPT="-o Dpkg::Progress-Fancy="0" -q -y"
LOG_FILE="/vagrant/logs/install_myadmin_bdd.log"
DEBIAN_FRONTEND="noninteractive"
MYADMIN_VERSION="5.1.1"

mysql -e "CREATE DATABASE phpmyadmin" \
>> $LOG_FILE 2>&1
  mysql -e "GRANT ALL PRIVILEGES ON phpmyadmin.* TO 'pma'@'%' IDENTIFIED BY 'pmapass'"
  mysql < /vagrant/files/create_tables.sql
>> $LOG_FILE 2>&1

