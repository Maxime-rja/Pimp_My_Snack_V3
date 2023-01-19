#!/bin/bash

sudo mysqldump --databases phpmyadmin > /vagrant/backup/dump/sauvegarde-$(date +%Y%m%d%H%M%S).sql
sudo mysqldump --databases phpmyadmin > /vagrant/backup/dump/latest-save.sql

sudo cp /vagrant/backup/dump/latest-save.sql /vagrant/files/create_tables.sql