CREATE DATABASE IF NOT EXISTS `phpmyadmin`
  DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE phpmyadmin;


create table Profils (
	id INTEGER,
    Nom CHAR,
	Prenom CHAR,
	Mdp CHAR,
	Email CHAR,
	Points INTEGER,
	Telephone CHAR,
    PRIMARY KEY (id)
);

create table Commandes (
	id INTEGER,
	Profil INTEGER,
	Menu INTEGER,
	TempsPrep INTEGER,
	PointsGagne INTEGER,
	Prix INTEGER,
	Fait BOOLEAN,
	PRIMARY KEY (id),
	FOREIGN KEY (Profil) REFERENCES Profils (id),
	FOREIGN KEY (Menu) REFERENCES Commandes_Menus (Commande) 
); 

create table Menus (
	id INTEGER,
	Nom CHAR,
	prix INTEGER,	
	PRIMARY KEY (id)
);


create table Commande_Menus (
	Menu INTEGER,
	Commande INTEGER,
	FOREIGN KEY (Commande) REFERENCES Commandes (id),
	FOREIGN KEY (Menu) REFERENCES Menus (id) 
);


create table Ingredients (
	id INTEGER,
	Nom CHAR,	
	Quantite INTEGER,
	Prix INTEGER,
	PRIMARY KEY (id)
);

create table Menus_Ingredients (
	Menu INTEGER,
	Ingredient INTEGER,
	FOREIGN KEY (Menu) REFERENCES Menus (id),
	FOREIGN KEY (Ingredient) REFERENCES Ingredients (id)
);

create table Inventaire (
	id INTEGER,
	Nom CHAR,	
	Quantite INTEGER,
	PRIMARY KEY (id)
);