import java.util.ArrayList;

public class Inventaire {
    private ArrayList<Ingredients> listeIngredients;
    Ingredients pain;
    Ingredients tomate;
    Ingredients steak;
    Ingredients oignon;
    Ingredients champignon;
    Ingredients fromage;
    Ingredients cornichon;
    Ingredients salade;
    Ingredients poulet;
    Ingredients bacon;

    // Constructeur de l'inventaire
    // Création des différents ingrédients et leur ajout dans la liste d'ingrédients
    public Inventaire()
	{
        this.pain = new Ingredients("Pain", 0.5, 20);
        this.tomate = new Ingredients("Tomate", 0.5, 10);
        this.steak = new Ingredients("Steak", 1.5, 10);
        this.oignon = new Ingredients("Oignon", 0.5, 10);
        this.champignon = new Ingredients("Champignon", 0.5, 10);
        this.fromage = new Ingredients("Fromage", 0.5, 10);
        this.cornichon = new Ingredients("Cornichon", 0.5, 10);
        this.salade = new Ingredients("Salade", 1.2, 10);
        this.poulet = new Ingredients("Poulet", 1.5, 10);
        this.bacon = new Ingredients("Bacon", 1.0, 10);
		listeIngredients = new ArrayList<Ingredients>();
        this.ajouterIngredient(pain);
        this.ajouterIngredient(tomate);
        this.ajouterIngredient(steak);
        this.ajouterIngredient(oignon);
        this.ajouterIngredient(champignon);
        this.ajouterIngredient(fromage);
        this.ajouterIngredient(cornichon);
        this.ajouterIngredient(salade);
        this.ajouterIngredient(poulet);
        this.ajouterIngredient(bacon);
	}

    // Ajouter un ingrédient dans la liste d'ingrédient de l'inventaire
    public void ajouterIngredient(Ingredients ingredient)
	{
		listeIngredients.add(ingredient);
	}

    // Afficher la liste des ingrédients dans l'inventaire
    public void afficherListeIngredientInventaire()
	{
		for(int i=0; i<listeIngredients.size(); i++)
		{
			System.out.println(listeIngredients.get(i).toString());
		}
	}

    public Ingredients getIngredientByName(String ingredient)
    {
        Ingredients ingredientCherche = new Ingredients();
        boolean check = false;
        for(int i=0; i<listeIngredients.size(); i++)
		{
			if(listeIngredients.get(i).getNomIngredient() == ingredient)
            {
                ingredientCherche = listeIngredients.get(i);
                check = true;

            }
		}
        
        if(check)
        {
            return ingredientCherche;
        }
        else{
            // ERROR
            return null;
        }
    }
}
