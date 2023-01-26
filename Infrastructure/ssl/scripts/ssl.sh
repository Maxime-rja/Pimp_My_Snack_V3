#!/bin/bash

sudo apt install -y git
sudo apt install -y curl git

git clone https://github.com/asdf-vm/asdf.git ~/.asdf --branch v0.11.1

cp /vagrant/ssl/.bashrc /root/


asdf plugin add mkcert https://github.com/salasrod/asdf-mkcert.git
asdf install mkcert latest
asdf global mkcert latest

mkcert -install

cd /root/.local/share/mkcert && mkcert 'certificate.pimpmysnack.local' localhost 127.0.0.1 ::1

cd /root/.local/share/mkcert && cp certificate.pimpmysnack.local+3.pem /etc/ssl/certs
cd /root/.local/share/mkcert && cp certificate.pimpmysnack.local+3-key.pem /etc/ssl/private

sudo cp /vagrant/ssl/default-ssl.conf /etc/apache2/sites-available/default-ssl.conf
a2ensite default-ssl.conf

a2enmod ssl

systemctl restart apache2