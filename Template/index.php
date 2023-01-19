<?php 
include 'core/core.php';

    $_TITRE_PAGE = 'Accueil projet RS ESEO';
    
    
    if(isset($_POST['connexion_submit']) && $_POST['connexion_submit'] == 1)
    {
        
            /*
            //msql va contenir la requete sql quen je evux execiuer
            $sql = "SELECT id
            FROM Etudiant
            WHERE email = '".trim($_POST['mail'])."'
            AND motDePasse = '".trim($_POST['password'])."'";
            */

            //realescapestring -> que string
            $mail_escaped = $mysqli->real_escape_string(trim($_POST['Email']));
            $password_escaped = $mysqli->real_escape_string(trim($_POST['Mdp']));
            $sql = "SELECT id
            FROM Etudiant
            WHERE email = '".$mail_escaped."'
            AND motDePasse = '".$password_escaped."'";
            echo $sql;
            //query f° a partir sqli d'exrcuter le param
            $result = $mysqli->query($sql);

            if (!$result) 
            {
                exit($mysqli->error);
            }

            $nb = $result -> num_rows;
            if($nb)
            {
                //récupérationde l'id de l'étudiant 
                $row = $result->fetch_assoc();
                $_SESSION['compte'] = $row['id'];
            }
    }

    //INSCRIPTION
	if(isset($_POST['inscription_submit']) && $_POST['inscription_submit'] == 1)
    {
        

            //realescapestring -> que string
            $inscription_NOM_escaped = $mysqli->real_escape_string(trim($_POST['Nom']));
            $inscription_Prenom_escaped = $mysqli->real_escape_string(trim($_POST['Prenom']));
			$inscription_mail_escaped = $mysqli->real_escape_string(trim($_POST['Email2']));
			$inscription_Annee_escaped = $mysqli->real_escape_string(trim($_POST['annee']));
			$inscription_motDePasse_escaped = $mysqli->real_escape_string(trim($_POST['Mdp2']));
			$inscription_VerifMotDePasse_escaped = $mysqli->real_escape_string(trim($_POST['CMdp']));

            $sql = "INSERT INTO Etudiant(nom,prenom, anneeScolaire, email, motDePasse)
            VALUES ('".$inscription_NOM_escaped."', '".$inscription_Prenom_escaped."',
			".$inscription_Annee_escaped.", '".$inscription_mail_escaped."','".$inscription_motDePasse_escaped."' )
            ";
			
            echo $sql;

            //query f° a partir sqli d'exrcuter le param

			$result = $mysqli->query($sql);

            if (!$result) 
            {
                exit($mysqli->error);
            }
    }

?>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta http-equiv="x-ua-compatible" content="ie=edge" />
    <title>PWND</title>
    <!-- MDB icon -->
    <link rel="icon" href="img/mdb-favicon.ico" type="image/x-icon" />
    <!-- Font Awesome -->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
    />
    <!-- Google Fonts Roboto -->
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap"
    />
    <!-- MDB -->
    <link rel="stylesheet" href="css/mdb.min.css" />

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">

       
    <link rel="stylesheet" href="./style.css">
    

    <script defer src="https://friconix.com/cdn/friconix.js"> </script>
    <script src= https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js></script>
    
  </head>
  <body class="body" >

		<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #245C7D;">
      <div class="container-fluid">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <a class="navbar-brand mt-2 mt-lg-0" href="#" style="margin-right: 40px;">
            <img src="logo_eseo.png" height="50" alt="" class="d-inline-block align-middle">
          </a>
      
          <ul class="navbar-nav me-auto">
            <li class="nav-item boutonAcceuil">
              <a class="nav-link text-blue " href="./">Accueil</a>
            </li>
            
            <li class="nav-item boutonEtudiant">
              <a class="nav-link text-white " href="#">Etudiants</a>
            </li>

            <li class="nav-item boutonEtudiant">
              <a class="nav-link text-white " href="./actualite.php">Actualite</a>
            </li>

          </ul>

        </div>
      </div>    
    </nav>

    <h1 class="text-center h3 title text-secondary nav-link text-white">Bienvenue sur RS ESEO</h1>
    <?php
    if(!$_SESSION['compte'])
    {
        ?>
    <div class="container">
      <div class="row justify-content-md-center marge">
        <div class="col mx-1" style="max-width: 525px;">
              <!-- Start your project here-->
              <!-- Pills navs -->
          <ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
            <li class="nav-item" role="presentation">
              <a
                class="nav-link active"
                id="ex3-tab-1"
                data-mdb-toggle="pill"
                href="#ex3-pills-1"
                role="tab"
                aria-controls="ex3-pills-1"
                aria-selected="true"
                >Connexion</a
              >
            </li>
            <li class="nav-item" role="presentation">
              <a
                class="nav-link"
                id="ex3-tab-2"
                data-mdb-toggle="pill"
                href="#ex3-pills-2"
                role="tab"
                aria-controls="ex3-pills-2"
                aria-selected="false"
                >Inscription</a
              >
            </li>
          </ul>
          <!-- Pills navs -->

          <!-- Pills content -->
          <div class="tab-content" id="ex2-content">
            <div
              class="tab-pane fade show active"
              id="ex3-pills-1"
              role="tabpanel"
              aria-labelledby="ex3-tab-1"
            >
            <div class="connexionBouton">
            <h5 class="text-center mx-auto text-white" style="font-family: 'Open Sans', sans-serif;">Connexion</h5>
            <form  method = "post">
            <div class="form-group entreForm">
                <input type="email" class="form-control entreForm" id="Email" name = "Email" placeholder="Email">
            </div>
            <div class="form-group entreForm">
                <input type="password" class="form-control entreForm" id="Mdp" name = "Mdp" placeholder="Mot de passe" >
            </div>
                <button type="submit" class="btn btn-secondary btn-block text-whites entreForm w-100" name="connexion_submit" style="border-radius: 10px;" value="1">CONNEXION</button>
            <div class="text-center" style="margin-top: 20px;">
                <a class="text-white" href="#" style="text-decoration: none;" >
                <i class="fi-xnsuxl-key-alt-solid text-white"></i>Mot de passe perdu
                </a>
            </div>

            </form>
            </div>
            </div>
            <div
              class="tab-pane fade"
              id="ex3-pills-2"
              role="tabpanel"
              aria-labelledby="ex3-tab-2"
            >
            <div class="inscriptionBouton text-center">
            <h5 class="text-center mx-auto text-white" style="font-family: 'Open Sans', sans-serif;">Inscription</h5>
            <form  method = "post">
            <div class="form-group">
                <input type="text" class="form-control entreForm" name="Nom" placeholder="Nom">
            </div>
            <div class="form-group">
                <input type="text" class="form-control entreForm" name="Prenom" placeholder="Prenom">
            </div>
            <div class="form-group">
                <select class="form-control entreForm" name="annee">
                    <option value="1">P1</option>
                    <option value="2">P2</option>
                    <option value="3">E3e</option>
                    <option value="4">E4e</option>
                    <option value="5">E5e</option>
                    <option value="13">E3a</option>
                    <option value="14">E4a</option>
                    <option value="15">E5a</option>
                    <option value="21">B1</option>
                    <option value="22">B2</option>
                    <option value="23">B3</option>
                </select>
            </div>
            <div class="form-group">
                <input type="email" class="form-control entreForm" name="Email2" aria-describedby="emailHelp" placeholder="Email">
            </div>
            <div class="form-group">
                <input type="password" class="form-control entreForm" name="Mdp2" placeholder="Mot de passe">
            </div>
            <div class="form-group">
                <input type="password" class="form-control entreForm" name="CMdp" placeholder="Confirmer votre mot de passe">
            </div>
            <button type="submit" class="btn btn-secondary btn-block text-white entreForm w-100" name="inscription_submit" value="1">INSCRIPTION</button>
            </form>
        </div>
            </div>
            
          </div>
          <!-- Pills content -->
        </div>
       
      </div>
    </div>
    <?php
    }
    else
    {
        ?>
        <div>
        <h2>Vous êtes connecté !</h2>
        <a href="http://192.168.56.80/pwnd?logout=1">Se déconnecter</a>
        </div>
        <?php
    }
    ?>
     <footer class="footer">
      <div class="container">
      <p class="m-0 text-center text-white">© 2022 - Projet WEB - by Paul et ses compagnons - Tous droits réservés</p>
      </div>
    </footer>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <!-- End your project here-->

    <!-- MDB -->
    <script type="text/javascript" src="js/mdb.min.js"></script>
    <!-- Custom scripts -->
    <script type="text/javascript"></script>
  </body>
</html>