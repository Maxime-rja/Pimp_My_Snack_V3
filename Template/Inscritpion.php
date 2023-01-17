<?php 
include 'core/core.php';

    $_TITRE_PAGE = 'Inscription';

    
    if(isset($_POST['inscription_submit']) && $_POST['inscription_submit'] == 1)
    {
    

        //realescapestring -> que string
        $inscription_NOM_escaped = $mysqli->real_escape_string(trim($_POST['Nom']));
        $inscription_Prenom_escaped = $mysqli->real_escape_string(trim($_POST['Prenom']));
        $inscription_mail_escaped = $mysqli->real_escape_string(trim($_POST['Email']));
        $inscription_motDePasse_escaped = $mysqli->real_escape_string(trim($_POST['Mdp']));
        $inscription_VerifMotDePasse_escaped = $mysqli->real_escape_string(trim($_POST['CMdp']));

       /* $sql = "INSERT INTO Etudiant(nom,prenom, anneeScolaire, email, motDePasse)
        VALUES ('".$inscription_NOM_escaped."', '".$inscription_Prenom_escaped."',
        ".$inscription_Annee_escaped.", '".$inscription_mail_escaped."','".$inscription_motDePasse_escaped."' )
        ";*/
        
        echo $sql;

        //query f° a partir sqli d'exrcuter le param

        $result = $mysqli->query($sql);

        if (!$result) 
        {
            exit($mysqli->error);
        }
}
?>