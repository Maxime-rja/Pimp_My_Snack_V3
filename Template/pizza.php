<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>PMS - Pymp My Snack</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">

    <!-- Favicon test -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    
    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
   <!-- Topbar Start -->
   <div class="container-fluid bg-primary py-3 d-none d-md-block">
        <div class="container">
            <div class="row">
                <div class="col-md-6 text-center text-lg-left mb-2 mb-lg-0">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-white pr-3" href="">FAQs</a>
                        <span class="text-white">|</span>
                        <a class="text-white px-3" href="">Help</a>
                        <span class="text-white">|</span>
                        <a class="text-white px-3" href="profil.php">Profil</a>
                        <span class="text-white">|</span>
                        <a class="text-white px-3" href="contact.html">Contact</a>
                        <span class="text-white">|</span>
                        <a class="text-white px-3" href="connexion.php">Connexion</a>
                        <span class="text-white">|</span>
                        <a class="text-white px-3" href="inscription.php">Inscription</a>
                        
                    </div>
                </div>
                <div class="col-md-6 text-center text-lg-right">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-white px-3" href="">
                            <i class="fab fa-facebook-f"></i>
                        </a>
                        <a class="text-white px-3" href="">
                            <i class="fab fa-twitter"></i>
                        </a>
                        <a class="text-white px-3" href="">
                            <i class="fab fa-linkedin-in"></i>
                        </a>
                        <a class="text-white px-3" href="">
                            <i class="fab fa-instagram"></i>
                        </a>
                        <a class="text-white px-3" href="">
                            <i class="fab fa-youtube"></i>
                        </a>
                        <a class="text-white pl-3" href="panier.php">                            
                            <img class="rounded" src="img/shopping-basket.png" style="width: 30px; height: 30px;">                            
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Topbar End -->


    <!-- Navbar Start -->
    <div class="container-fluid position-relative nav-bar p-0">
        <div class="container-lg position-relative p-0 px-lg-3" style="z-index: 9;">
            <nav class="navbar navbar-expand-lg bg-white navbar-light shadow p-lg-0">
                
                <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                    <div class="navbar-nav ml-auto py-0">
                        
                        <a href="burger.php" class="nav-item nav-link">Burger</a>
                        <a href="pizza.php" class="nav-item nav-link">Pizza</a>
                    </div>
                    <a href="index.html" class="navbar-brand mx-5 d-none d-lg-block">
                        <h1 class="m-0 display-4 text-primary"><span class="text-secondary">Pymp</span> My Snack</h1>
                    </a>
                    <div class="navbar-nav mr-auto py-0">
                        <a href="wok.php" class="nav-item nav-link">Wok</a>
                        <a href="sandwich.php" class="nav-item nav-link">Sandwich</a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <!-- Navbar End -->

    <!-- Header Start -->
    <div class="jumbotron jumbotron-fluid page-header" style="margin-bottom: 90px;">
        <div class="container text-center py-5">
            <h1 class="text-white display-3 mt-lg-5">Pizza</h1>
            <div class="d-inline-flex align-items-center text-white">
                <p class="m-0"><a class="text-white" href="">Home</a></p>
                <i class="fa fa-circle px-3"></i>
                <p class="m-0">Pizza</p>
            </div>
        </div>
    </div>
    <!-- Header End -->


    <!-- Products Start -->
    <div class="container-fluid py-5">
        <div class="container py-5">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <h1 class="section-title position-relative text-center mb-5">Menu</h1>
                </div>
            </div>                  
           
            <div class="row">
                <div class="col"> 
                    <div class="row">
                        <div class="col">  
                        <div class="product-item d-flex align-items-center text-center bg-light rounded py-5 px-3">
                            <div class="bg-primary " style="width: 80px;">
                                <h4 class="font-weight-bold text-white mb-0">0,5???</h4> <!-- afficher le bon prix -->
                            </div>                            
                            <h5 class="font-weight-bold pl-3 pr-3">Oignon</h5>
                            
                            <a href="" class="btn btn-sm btn-secondary">-</a>
                            <a href="" class="btn btn-sm btn-secondary">+</a>
                        </div>
                        </div> 
                    </div>
                    <div class="row">
                        <div class="col">  
                        <div class="product-item d-flex align-items-center text-center bg-light rounded py-5 px-3">
                            <div class="bg-primary " style="width: 80px;">
                                <h4 class="font-weight-bold text-white mb-0">1???</h4> <!-- afficher le bon prix -->
                            </div>                            
                            <h5 class="font-weight-bold pl-3 pr-3">Cheddar</h5>
                            <a href="" class="btn btn-sm btn-secondary">-</a>
                            <a href="" class="btn btn-sm btn-secondary">+</a>
                        </div>
                        </div> 
                    </div>
                    <div class="row">
                        <div class="col">  
                        <div class="product-item d-flex align-items-center text-center bg-light rounded py-5 px-3">
                            <div class="bg-primary " style="width: 80px;">
                                <h4 class="font-weight-bold text-white mb-0">2.5???</h4> <!-- afficher le bon prix -->
                            </div>                             
                            <h5 class="font-weight-bold pl-3 pr-3">Steak</h5>
                            <a href="" class="btn btn-sm btn-secondary">-</a>
                            <a href="" class="btn btn-sm btn-secondary">+</a>
                        </div>
                        </div> 
                    </div>
                    <div class="row">
                        <div class="col">  
                        <div class="product-item d-flex align-items-center text-center bg-light rounded py-5 px-3">
                            <div class="bg-primary " style="width: 80px;">
                                <h4 class="font-weight-bold text-white mb-0">0.5???</h4> <!-- afficher le bon prix -->
                            </div>                              
                            <h5 class="font-weight-bold pl-3 pr-3">Cornichon</h5>
                            <a href="" class="btn btn-sm btn-secondary">-</a>
                            <a href="" class="btn btn-sm btn-secondary">+</a>
                        </div>
                        </div> 
                    </div>
                    <div class="row">
                        <div class="col">  
                        <div class="product-item d-flex align-items-center text-center bg-light rounded py-5 px-3">
                            <div class="bg-primary " style="width: 80px;">
                                <h4 class="font-weight-bold text-white mb-0">0.5???</h4> <!-- afficher le bon prix -->
                            </div>                              
                            <h5 class="font-weight-bold pl-3 pr-3">Laitue</h5>
                            <a href="" class="btn btn-sm btn-secondary">-</a>
                            <a href="" class="btn btn-sm btn-secondary">+</a>
                        </div>
                        </div> 
                    </div>
                </div>

                <div class="col"> 
                    <div class="col">
                        <div class="text-center">
                        <img src="img/Pain_sup.png" >        
                        </div>                  
                    </div>  
                    <div class="col">
                        <div class="text-center">
                        <img  src="img/oignon.png" >   <!-- image a afficher autant de fois qu'il y a d'ingredients -->                    
                        </div>
                    </div>
                    <div class="col">
                        <div class="text-center">
                        <img src="img/Cheddar.png"> <!-- image a afficher autant de fois qu'il y a d'ingredients -->  
                        </div>                           
                    </div>  
                    <div class="col">
                        <div class="text-center">
                        <img src="img/Steak.png">  <!-- image a afficher autant de fois qu'il y a d'ingredients -->  
                        </div>                          
                    </div> 
                    <div class="col">                    
                        <div class="text-center">        
                        <img  src="img/Cornichons.png" >   <!-- image a afficher autant de fois qu'il y a d'ingredients -->                         
                        </div>                         
                    </div> 
                    <div class="col"> 
                        <div class="text-center">
                        <img  src="img/laitue.png" >  <!-- image a afficher autant de fois qu'il y a d'ingredients -->                        
                        </div> 
                    </div> 
                    <div class="col"> 
                        <div class="text-center">
                        <img  src="img/Pain_inf.png" > 
                        </div>    
                  </div>               
                </div>
            </div>  


            <!-- Boissons Start -->
            <div class="row">
                <h1 class=" position-relative text-center mb-5">Boissons</h1>
            </div>
            <div class="row">
                <div class="col-lg-3 col-md-6 mb-4 pb-2">  
                    <div class="product-item d-flex align-items-center text-center bg-light rounded py-5 px-3">
                        <div class="bg-primary " style="width: 80px;">
                            <h4 class="font-weight-bold text-white mb-0">99???</h4> <!-- afficher le bon prix -->
                        </div>                           
                        <h5 class="font-weight-bold pl-3 pr-3">Coca</h5>
                        <a href="" class="btn btn-sm btn-secondary">+</a> <!-- modifier "+" par "X" pour indiquer que l'element est selectionn?? -->  
                    </div>
                </div>  
                <div class="col-lg-3 col-md-6 mb-4 pb-2">  
                    <div class="product-item d-flex align-items-center text-center bg-light rounded py-5 px-3">
                        <div class="bg-primary " style="width: 80px;">
                            <h4 class="font-weight-bold text-white mb-0">99???</h4> <!-- afficher le bon prix -->
                        </div>                            
                        <h5 class="font-weight-bold pl-3 pr-3">Fanta</h5>
                        <a href="" class="btn btn-sm btn-secondary">+</a> <!-- modifier "+" par "X" pour indiquer que l'element est selectionn?? --> 
                    </div>
                </div>  
            </div>
            <!-- Boissons End -->

            <!-- Accompagnement start -->
            <div class="row">
                <h1 class=" position-relative text-center mb-5">Accompagnement</h1>
            </div>
            <div class="row">
                <div class="col-lg-3 col-md-6 mb-4 pb-2">  
                    <div class="product-item d-flex align-items-center text-center bg-light rounded py-5 px-3">
                        <div class="bg-primary " style="width: 80px;">
                            <h4 class="font-weight-bold text-white mb-0">99???</h4> <!-- afficher le bon prix -->
                        </div>                            
                        <h5 class="font-weight-bold pl-3 pr-3">Frites</h5>
                        <a href="" class="btn btn-sm btn-secondary">+</a> <!-- modifier "+" par "X" pour indiquer que l'element est selectionn?? -->                        
                    </div>
                </div> 
                <div class="col-lg-3 col-md-6 mb-4 pb-2">  
                    <div class="product-item d-flex align-items-center text-center bg-light rounded py-5 px-3">
                        <div class="bg-primary " style="width: 80px;">
                            <h4 class="font-weight-bold text-white mb-0">99???</h4> <!-- afficher le bon prix -->
                        </div>                           
                        <h5 class="font-weight-bold pl-3 pr-3">oignons rings</h5>
                        <a href="" class="btn btn-sm btn-secondary">+</a> <!-- modifier "+" par "X" pour indiquer que l'element est selectionn?? --> 
                    </div>
                </div>                          
            </div>
            <!-- Accompagnement End -->

            <!-- recap start -->
            <div class="product-item d-flex align-items-center text-center bg-light rounded px-3">
                <h1 class=" position-relative text-center mb-5">R??capitulatif du menu :</h1>     
            </div>         
            <div class="product-item d-flex align-items-center text-center bg-light rounded px-3">                              
                <h5 class="font-weight-bold pl-3 pr-3"> Total Burger : </h5>                        
                <h4 class="font-weight-bold bg-primary text-white mb-0">5???</h4> <!-- afficher la somme des prix des ingredients pour le burger -->
             </div>  
             <div class="product-item d-flex align-items-center text-center bg-light rounded px-3">                              
                <h5 class="font-weight-bold pl-3 pr-3"> Boisson : </h5>                        
                <h4 class="font-weight-bold bg-primary text-white mb-0">1???</h4> <!-- afficher le prix de l'ingredient boisson selectionn?? -->
            </div>  
            <div class="product-item d-flex align-items-center text-center bg-light rounded px-3">                              
                <h5 class="font-weight-bold pl-3 pr-3"> Accompagnement : </h5>                        
                <h4 class="font-weight-bold bg-primary text-white mb-0">1???</h4> <!-- afficher le prix de l'ingredient accompagnement selectionn?? -->
            </div>
            
            <div class="product-item d-flex align-items-center text-center bg-light rounded px-3">                              
                <h3 class="font-weight-bold pl-3 pr-3"> Total : </h3>                        
                <h3 class="font-weight-bold bg-primary text-white mb-0">7???</h3> <!-- afficher la somme des prix des ingredients -->
            </div>

            <div class="product-item d-flex align-items-center text-center bg-light rounded px-3"> 
                <a href="panier.html" class="btn btn-sm btn-secondary"> Valider 
                    <img class="rounded " src="img/shopping-basket.png" style="width: 40px; height: 40px;">                            
                </a>
            </div>
            <!-- recap end -->
        </div> 
    </div>    
    <!-- Products End -->

    <!-- Footer Start -->
    <div class="container-fluid footer bg-light py-5" style="margin-top: 90px;">
        <div class="container text-center py-5">
            <div class="row">
                <div class="col-12 mb-4">
                    <a href="index.html" class="navbar-brand m-0">
                        <h1 class="m-0 mt-n2 display-4 text-primary"><span class="text-secondary">Pymp</span> My Snack</h1>
                    </a>
                </div>
                <div class="col-12 mb-4">
                    <a class="btn btn-outline-secondary btn-social mr-2" href="#"><i class="fab fa-twitter"></i></a>
                    <a class="btn btn-outline-secondary btn-social mr-2" href="#"><i class="fab fa-facebook-f"></i></a>
                    <a class="btn btn-outline-secondary btn-social mr-2" href="#"><i class="fab fa-linkedin-in"></i></a>
                    <a class="btn btn-outline-secondary btn-social" href="#"><i class="fab fa-instagram"></i></a>
                </div>
                <div class="col-12 mt-2 mb-4">
                    <div class="row">
                        <div class="col-sm-6 text-center text-sm-right border-right mb-3 mb-sm-0">
                            <h5 class="font-weight-bold mb-2">Contactez Nous</h5>
                            <p class="mb-2">10 Bd Jean Jeanneteau, 49100 Angers, FR</p>
                            <p class="mb-0">02 41 86 67 67</p>
                        </div>
                        <div class="col-sm-6 text-center text-sm-left">
                            <h5 class="font-weight-bold mb-2">Heures d'ouvertures</h5>
                            <p class="mb-2">Lundi ??? Samedi, 8h ??? 23h</p>
                            <p class="mb-0">Dimanche: Ferm??</p>
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <p class="m-0">&copy; <a href="#">Domain</a>. All Rights Reserved. Designed by <a href="https://htmlcodex.com">HTML Codex</a>
                    </p>
                </div>
            </div>
        </div>
    </div>
    <!-- Footer End -->

    <!-- Back to Top -->
    <a href="#" class="btn btn-secondary px-2 back-to-top"><i class="fa fa-angle-double-up"></i></a>

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="lib/isotope/isotope.pkgd.min.js"></script>
    <script src="lib/lightbox/js/lightbox.min.js"></script>

    <!-- Contact Javascript File -->
    <script src="mail/jqBootstrapValidation.min.js"></script>
    <script src="mail/contact.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
</body>
</html>