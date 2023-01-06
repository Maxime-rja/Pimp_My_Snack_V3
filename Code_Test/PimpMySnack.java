public class PimpMySnack
{
    
	public static void main ( String [] args )
	{

        ///// TEST V0
        /**
        Inventaire stockage = new Inventaire();
        stockage.afficherListeIngredientInventaire();
        stockage.tomate.ajouterQuantiteIngredient(40);
        stockage.afficherListeIngredientInventaire();
        stockage.tomate.retirerQuantiteIngredient(30);
        stockage.afficherListeIngredientInventaire();
        **/

        Inventaire stockage = new Inventaire();
        stockage.afficherListeIngredientInventaire();
        Menus burger = new Menus(stockage, "Burger");
        /*
        burger.ajouterIngredientMenu(stockage.pain);
        burger.ajouterIngredientMenu(stockage.steak);
        burger.afficherListeIngredientMenu();
        stockage.afficherListeIngredientInventaire();
        burger.retirerIngredientMenu(stockage.steak);
        burger.afficherListeIngredientMenu();
        stockage.afficherListeIngredientInventaire();
        */
    
        burger.ajouterIngredientMenu(stockage.steak);
        burger.ajouterIngredientMenu(stockage.steak);
        burger.ajouterIngredientMenu(stockage.fromage);
        burger.ajouterIngredientMenu(stockage.fromage);
        burger.ajouterIngredientMenu(stockage.oignon);
        burger.ajouterIngredientMenu(stockage.tomate);
        burger.ajouterIngredientMenu(stockage.pain);
        burger.ajouterIngredientMenu(stockage.pain);
        burger.ajouterIngredientMenu(stockage.salade);
        burger.afficherListeIngredientMenu();
        stockage.afficherListeIngredientInventaire();


        


    }
}
