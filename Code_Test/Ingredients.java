public class Ingredients {
    // champs ou attributs de la classe
    private String nom;
    private double prix;
    private int quantité;
  
    // constructeur de la classe
    public Ingredients() {
      nom = "";
      prix = 0.0;
      quantité = 0;
    }

    // constructeur de la classe avec attributs
    public Ingredients(String name, double price, int quantity) {
        nom = name;
        prix = price;
        quantité = quantity;
      }
  
    // Nom de l'ingrédient
    public String getNomIngredient () {
      // code de la méthode
      return this.nom;
    }

    // Prix de l'ingrédient
    public double getPrixIngredeient () {
        // code de la méthode
        return this.prix;
    }

      // Quantite de l'ingrédient
    public int getQuantiteIngredient () {
        // code de la méthode
        return this.quantité;
    }

    // Ajouter des ingrédients dans le stock
    public int ajouterQuantiteIngredient(int nombre)
    {
        System.out.println("Ajout de " + nombre + " " + this.getNomIngredient() + " dans la reserve.");
        return this.quantité += nombre;
    }

     // Ajouter des ingrédients dans le stock
     public int retirerQuantiteIngredient(int nombre)
     {
         System.out.println("Retrait de " + nombre + " " + this.getNomIngredient() + " dans la reserve.");
         return this.quantité -= nombre;
     }

    public String toString()
    {
        return "Il reste " + this.getQuantiteIngredient() + " " + this.getNomIngredient() + " dans la réserve.";
    }
  }