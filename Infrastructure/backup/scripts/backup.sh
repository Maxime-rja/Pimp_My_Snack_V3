#!/bin/bash
sudo mysqldump --databases phpmyadmin > /vagrant/backup/dump/sauvegarde-$(date +%Y%m%d%H%M%S).sql