import java.util.ArrayList;

public class Menus {

    String nomMenu;
    private ArrayList<Ingredients> listeIngredientsMenu;
    Inventaire stock;
    double prix;

    public Menus(Inventaire stockage, String name)
    {
        this.stock = stockage;
        nomMenu = name;
        listeIngredientsMenu = new ArrayList<Ingredients>();
        prix = 0;
    }

    public void ajouterIngredientMenu(Ingredients ingredient)
	{
		listeIngredientsMenu.add(ingredient);
        ingredient.retirerQuantiteIngredient(1);
        this.prix += ingredient.getPrixIngredient();
	}

    public void retirerIngredientMenu(Ingredients ingredient)
	{
		listeIngredientsMenu.remove(ingredient);
        ingredient.ajouterQuantiteIngredient(1);
        this.prix -= ingredient.getPrixIngredient();
	}

    public void afficherListeIngredientMenu()
	{
        System.out.print("Voici la composition de votre Menu " + this.nomMenu + " : ");
		for(int i=0; i<listeIngredientsMenu.size(); i++)
		{
			System.out.print(listeIngredientsMenu.get(i).getNomIngredient() + ", ");
		}
        System.out.println("");
        System.out.println("Prix du Menu = " + this.prix);
	}

}
