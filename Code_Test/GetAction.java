import javax.swing.AbstractAction;

public class GetAction extends AbstractAction
{
    private PimpMySnack fenetre;
    private Ingredients ingredient;
    String text;

    public GetAction(PimpMySnack fenetre, Ingredients ingredient, String text){
 
        super(text);
        this.text = text;
        this.fenetre = fenetre;
        this.ingredient = ingredient;
	}

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
        
        fenetre.getLabelStock(ingredient).setText(ingredient.toString());
    }
}
