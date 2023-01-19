<?php 
//instructions de gestion de l'affichage des erreurs
    error_reporting(E_ALL);
    ini_set('display_errors', 'On');
    ini_set('display_startup_errors', 'On');

    $_SESSION['compte'] = false;
   //instruction de démarrage de connexion
    session_start();

    //varible qui permet de faire des requetes sur bdd
    $infoBdd = ['server' => 'srv-bdd',
    'login' => 'pma',
    'password' => 'pmapass',
    'db_name' => 'PimpMySnack', ];

    $mysqli = new mysqli($infoBdd['server'], $infoBdd['login'],
    $infoBdd['password'],$infoBdd['db_name']);
    if ($mysqli->connect_errno) {
        exit('Problème de connexion à la BDD');
    }

    

    //deconnexion
    if(isset($_GET['logout']) && $_GET['logout'] == 1) {
        unset($_SESSION['compte']);
        header("Location: ./");
        $mysqli->close();
    }
?>

