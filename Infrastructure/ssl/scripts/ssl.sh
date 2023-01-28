#!/bin/bash 

sudo apt install -y git
sudo apt install -y curl git
sudo apt install dos2unix

git clone https://github.com/asdf-vm/asdf.git ~/.asdf --branch v0.11.1

dos2unix .bashrc
cp /vagrant/ssl/.bashrc /root/