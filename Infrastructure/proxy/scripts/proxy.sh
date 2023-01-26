#!/bin/bash

#On active les différents modules nécéssaires pour le reverse proxy et load balancer
sudo a2enmod proxy_http
sudo a2enmod proxy
sudo a2enmod proxy_balancer
sudo a2enmod proxy_ajp
sudo a2enmod lbmethod_byrequests
sudo a2enmod headers

#On redémarre apache2
systemctl restart apache2 


#On colle le script "srv-web.conf" rédigé en local à l'emplacement /etc/apache2/sites-available/srv-web.conf
cp /vagrant/proxy/srv-web.conf /etc/apache2/sites-available/srv-web.conf

#On active le site
a2ensite srv-web.conf

#On désactive le site par défaut qui est lui aussi sur le port 80
a2dissite 000-default.conf

#On redémarre apache2
systemctl restart apache2
