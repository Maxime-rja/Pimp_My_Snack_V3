create table Profils (
	id int,
    Nom char,
	Prenom char,
	Mdp char,
	Email char,
	Points int,
	Telephone char,
    PRIMARY KEY (id)
);

create table Commandes (
	id int,
	Profil int,
	Menu int,
	TempsPrep int,
	PointsGagne int,
	Prix int,
	Fait boolean,
	PRIMARY KEY (id),
	FOREIGN KEY (Profil) REFERENCES Profils (id),
	FOREIGN KEY (Menu) REFERENCES Commandes-Menus (Commande) 
); 

create table Menus (
	id int,
	Nom char,
	prix int,	
	PRIMARY KEY (id)
);


create table Commande-Menus (
	Menu int,
	Commande int,
	FOREIGN KEY (Commande) REFERENCES Commandes (id),
	FOREIGN KEY (Menu) REFERENCES Menus (id) 
);


create table Ingredients (
	id int,
	Nom char,	
	Quantite int,
	Prix int,
	PRIMARY KEY (id)
);

create table Menus-Ingredients (
	Menu int,
	Ingredient int,
	FOREIGN KEY (Menu) REFERENCES Menus (id),
	FOREIGN KEY (Ingredient) REFERENCES Ingredients (id)
);

create table Inventaire (
	id int,
	Nom char,	
	Quantite int,
	PRIMARY KEY (id)
); 	 	