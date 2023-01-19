#!/bin/bash

sudo a2enmod proxy_http
sudo a2enmod proxy
sudo a2enmod proxy_balancer
sudo a2enmod proxy_ajp
sudo a2enmod lbmethod_byrequests

systemctl restart apache2 

cp /vagrant/proxy/srv-web.conf /etc/apache2/sites-available/srv-web.conf

a2ensite srv-web.conf
a2dissite 000-default.conf

systemctl restart apache2
