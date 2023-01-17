#!/bin/bash

vagrant halt srv-bdd
Start-Sleep -Seconds 5 

vagrant snapshot save srv-bdd snapshot-bdd-$(date +%Y%m%d%H%M%S)

Start-Sleep -Seconds 5

vagrant up srv-bdd