import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IHMStockIngredient 
{
    JLabel label_stock_ingredient;
    ImageIcon icone_ingredient;
    JLabel label_icone_ingredient;
    JLabel label_ingredient;
    JButton btn_add;
    JButton btn_rm;

    public IHMStockIngredient(PimpMySnack fenetre, JPanel panel, Inventaire stock, String chemin, String nom)
    {
        this.label_stock_ingredient = new JLabel(stock.getIngredientByName(nom).toString());
        this.icone_ingredient = new ImageIcon(chemin);
        this.label_icone_ingredient = new JLabel(icone_ingredient, JLabel.CENTER);
        this.label_ingredient = new JLabel(nom);
        this.btn_add = new JButton(new GetAction(this, stock.getIngredientByName(nom), "+"));
        this.btn_rm = new JButton(new GetAction(this, stock.getIngredientByName(nom), "-"));
    }

    public void add_to_panel(JPanel panel)
    {
        panel.add(label_icone_ingredient);
        panel.add(label_ingredient);
        panel.add(btn_add);
        panel.add(btn_rm);
        panel.add(label_stock_ingredient);
    }
}