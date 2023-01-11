#!/bin/bash

sudo mysqldump --database phpmyadmin > /vagrant/backup/dump/sauvegarde-$(date +%Y%m%d).sql

