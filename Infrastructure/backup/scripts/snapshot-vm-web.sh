#!/bin/bash

vagrant halt srv-web
Start-Sleep -Seconds 5 

vagrant snapshot save srv-web snapshot-web-$(date +%Y%m%d%H%M%S)

Start-Sleep -Seconds 5

vagrant up srv-web