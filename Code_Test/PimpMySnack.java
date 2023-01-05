public class PimpMySnack
{
    
	public static void main ( String [] args )
	{
        Inventaire stockage = new Inventaire();
        stockage.afficherListeIngredient();
        stockage.tomate.ajouterQuantiteIngredient(40);
        stockage.afficherListeIngredient();
        stockage.tomate.retirerQuantiteIngredient(30);
        stockage.afficherListeIngredient();


        /* 
        tomate.ajouterQuantiteIngredient(15);
        System.out.println(tomate.toString());

        tomate.retirerQuantiteIngredient(10);
        System.out.println(tomate.toString());
        */

    }
}
