import javax.swing.AbstractAction;

public class GetAction extends AbstractAction
{
    IHMStockIngredient ihm_ingredient;
    private Ingredients ingredient;
    String text;

    public GetAction(IHMStockIngredient ihm, Ingredients ingredient, String text){
 
        super(text);
        this.text = text;
        this.ihm_ingredient = ihm;
        this.ingredient = ingredient;
	}

    /// Permet d'actualiser les ingrédients
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // TODO Auto-generated method stub
        if(text == "+")
        {
            ingredient.ajouterQuantiteIngredient(1);
        }
        
        if(text == "-")
        {
            ingredient.retirerQuantiteIngredient(1);
        }
        
        ihm_ingredient.label_stock_ingredient.setText(ingredient.toString());
    }
}
