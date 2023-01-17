#!/bin/bash

a2enmod proxy_http

systemctl restart apache2 

cp /vagrant/proxy/srv-web.conf /etc/apache2/sites-available/srv-web.conf

a2ensite srv-web
