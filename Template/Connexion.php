<?php 
include 'core/core.php';

    $_TITRE_PAGE = 'Connexion';
    
    
    if(isset($_POST['connexion_submit']) && $_POST['connexion_submit'] == 1)
    {
        $mail_escaped = $mysqli->real_escape_string(trim($_POST['Email']));
        $password_escaped = $mysqli->real_escape_string(trim($_POST['Mdp']));
        $sql = "SELECT id
        FROM Profils
        WHERE Email = '".$mail_escaped."'
        AND Mdp = '".$password_escaped."'";
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


?>
