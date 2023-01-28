#!/bin/bash

sudo cp /vagrant/ssl/certificats/certificate.pimpmysnack.local+3.pem /etc/ssl/certs
sudo cp /vagrant/ssl/certificats/certificate.pimpmysnack.local+3-key.pem /etc/ssl/private

sudo cp /vagrant/ssl/default-ssl.conf /etc/apache2/sites-available/default-ssl.conf

sudo a2ensite default-ssl.conf
sudo a2enmod ssl

sudo systemctl restart apache2