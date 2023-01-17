import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PimpMySnack extends JFrame implements ActionListener
{

    Inventaire stock = new Inventaire();
    JLabel label_stock_pain = new JLabel(stock.pain.toString());
    JLabel label_stock_tomate = new JLabel(stock.tomate.toString());
    JLabel label_stock_steak = new JLabel(stock.steak.toString());
    JLabel label_stock_oignon = new JLabel(stock.oignon.toString());
    JLabel label_stock_champignon = new JLabel(stock.champignon.toString());
    JLabel label_stock_fromage = new JLabel(stock.fromage.toString());
    JLabel label_stock_cornichon = new JLabel(stock.cornichon.toString());
    JLabel label_stock_salade = new JLabel(stock.salade.toString());
    JLabel label_stock_poulet = new JLabel(stock.poulet.toString());
    JLabel label_stock_bacon = new JLabel(stock.bacon.toString());

    ImageIcon icone_pain = new ImageIcon("Images/pain.png");
    ImageIcon icone_tomate = new ImageIcon("Images/tomate.png");
    ImageIcon icone_steak = new ImageIcon("Images/steak.png");
    ImageIcon icone_oignon = new ImageIcon("Images/oignon.png");
    ImageIcon icone_champignon = new ImageIcon("Images/champignon.png");
    ImageIcon icone_fromage = new ImageIcon("Images/fromage.png");
    ImageIcon icone_cornichon = new ImageIcon("Images/cornichon.png");
    ImageIcon icone_salade = new ImageIcon("Images/salade.png");
    ImageIcon icone_poulet = new ImageIcon("Images/poulet.png");
    ImageIcon icone_bacon = new ImageIcon("Images/bacon.png");

    

    public PimpMySnack()
    {
        super();
        build();
    }
    
    private void build(){
		setTitle("Pimp My Snack"); //On donne un titre à l'application
		setSize(1000,500); //On donne une taille à notre fenêtre
        //setSize(1650,1080);
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        setContentPane(buildContentPane());
	}

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();

        // PAIN
        JLabel label_icone_pain = new JLabel(icone_pain, JLabel.CENTER);
        JLabel label_pain = new JLabel("Pain");
        JButton btn_add_pain = new JButton(new GetAction(this, stock.pain, "+"));
        JButton btn_rm_pain = new JButton(new GetAction(this, stock.pain, "-"));
        panel.add(label_icone_pain);
        panel.add(label_pain);
        panel.add(btn_add_pain);
        panel.add(btn_rm_pain);
        panel.add(label_stock_pain);

        // TOMATE
        JLabel label_icone_tomate = new JLabel(icone_tomate, JLabel.CENTER);
        JLabel label_tomate = new JLabel("Tomates");
        JButton btn_add_tomate = new JButton(new GetAction(this, stock.tomate, "+"));
        JButton btn_rm_tomate = new JButton(new GetAction(this, stock.tomate, "-"));
        panel.add(label_icone_tomate);
        panel.add(label_tomate);
        panel.add(btn_add_tomate);
        panel.add(btn_rm_tomate);
        panel.add(label_stock_tomate);
        
        // STEAK
        JLabel label_icone_steak = new JLabel(icone_steak, JLabel.CENTER);
        JLabel label_steak = new JLabel("Steak");
        JButton btn_add_steak = new JButton(new GetAction(this, stock.steak, "+"));
        JButton btn_rm_steak = new JButton(new GetAction(this, stock.steak, "-"));
        panel.add(label_icone_steak);
        panel.add(label_steak);
        panel.add(btn_add_steak);
        panel.add(btn_rm_steak);
        panel.add(label_stock_steak);

        // OIGNON
        JLabel label_icone_oignon = new JLabel(icone_oignon, JLabel.CENTER);
        JLabel label_oignon = new JLabel("Oignon");
        JButton btn_add_oignon = new JButton(new GetAction(this, stock.oignon, "+"));
        JButton btn_rm_oignon = new JButton(new GetAction(this, stock.oignon, "-"));
        panel.add(label_icone_oignon);
        panel.add(label_oignon);
        panel.add(btn_add_oignon);
        panel.add(btn_rm_oignon);
        panel.add(label_stock_oignon);

        // CHAMPIGNON
        JLabel label_icone_champignon = new JLabel(icone_champignon, JLabel.CENTER);
        JLabel label_champignon = new JLabel("Champignon");
        JButton btn_add_champignon = new JButton(new GetAction(this, stock.champignon, "+"));
        JButton btn_rm_champignon = new JButton(new GetAction(this, stock.champignon, "-"));
        panel.add(label_icone_champignon);
        panel.add(label_champignon);
        panel.add(btn_add_champignon);
        panel.add(btn_rm_champignon);
        panel.add(label_stock_champignon);

        // FROMAGE
        JLabel label_icone_fromage = new JLabel(icone_fromage, JLabel.CENTER);
        JLabel label_fromage = new JLabel("Fromage");
        JButton btn_add_fromage = new JButton(new GetAction(this, stock.fromage, "+"));
        JButton btn_rm_fromage = new JButton(new GetAction(this, stock.fromage, "-"));
        panel.add(label_icone_fromage);
        panel.add(label_fromage);
        panel.add(btn_add_fromage);
        panel.add(btn_rm_fromage);
        panel.add(label_stock_fromage);

        // CORNICHON
        JLabel label_icone_cornichon = new JLabel(icone_cornichon, JLabel.CENTER);
        JLabel label_cornichon = new JLabel("Cornichon");
        JButton btn_add_cornichon = new JButton(new GetAction(this, stock.cornichon, "+"));
        JButton btn_rm_cornichon = new JButton(new GetAction(this, stock.cornichon, "-"));
        panel.add(label_icone_cornichon);
        panel.add(label_cornichon);
        panel.add(btn_add_cornichon);
        panel.add(btn_rm_cornichon);
        panel.add(label_stock_cornichon);

        // SALADE
        JLabel label_icone_salade = new JLabel(icone_salade, JLabel.CENTER);
        JLabel label_salade = new JLabel("Salade");
        JButton btn_add_salade = new JButton(new GetAction(this, stock.salade, "+"));
        JButton btn_rm_salade = new JButton(new GetAction(this, stock.salade, "-"));
        panel.add(label_icone_salade);
        panel.add(label_salade);
        panel.add(btn_add_salade);
        panel.add(btn_rm_salade);
        panel.add(label_stock_salade);

        // POULET
        JLabel label_icone_poulet = new JLabel(icone_poulet, JLabel.CENTER);
        JLabel label_poulet = new JLabel("Poulet");
        JButton btn_add_poulet = new JButton(new GetAction(this, stock.poulet, "+"));
        JButton btn_rm_poulet = new JButton(new GetAction(this, stock.poulet, "-"));
        panel.add(label_icone_poulet);
        panel.add(label_poulet);
        panel.add(btn_add_poulet);
        panel.add(btn_rm_poulet);
        panel.add(label_stock_poulet);

        // BACON
        JLabel label_icone_bacon = new JLabel(icone_bacon, JLabel.CENTER);
        JLabel label_bacon = new JLabel("Bacon");
        JButton btn_add_bacon = new JButton(new GetAction(this, stock.bacon, "+"));
        JButton btn_rm_bacon = new JButton(new GetAction(this, stock.bacon, "-"));
        panel.add(label_icone_bacon);
        panel.add(label_bacon);
        panel.add(btn_add_bacon);
        panel.add(btn_rm_bacon);
        panel.add(label_stock_bacon);

        // LAYOUT
        panel.setLayout(new GridLayout(10,5));
     
        return panel;
    }

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

        
        PimpMySnack fenetreAdmin = new PimpMySnack();
        fenetreAdmin.setVisible(true);
        

        /*
        Inventaire stockage = new Inventaire();
        stockage.afficherListeIngredientInventaire();
        Menus burger = new Menus(stockage, "Burger");
        burger.ajouterIngredientMenu(stockage.pain);
        burger.ajouterIngredientMenu(stockage.steak);
        burger.afficherListeIngredientMenu();
        stockage.afficherListeIngredientInventaire();
        burger.retirerIngredientMenu(stockage.steak);
        burger.afficherListeIngredientMenu();
        stockage.afficherListeIngredientInventaire();
        */


    }

    public JLabel getLabelStock(Ingredients ingredient)
    {
        switch(ingredient.getNomIngredient())
        {
            case "Pain":
                return label_stock_pain;
            case "Tomate":
                return label_stock_tomate;
            case "Steak":
                return label_stock_steak;
            case "Oignon":
                return label_stock_oignon;
            case "Champignon":
                return label_stock_champignon;
            case "Fromage":
                return label_stock_fromage;
            case "Cornichon":
                return label_stock_cornichon;
            case "Salade":
                return label_stock_salade;
            case "Poulet":
                return label_stock_poulet;
            case "Bacon":
                return label_stock_bacon;
            default:
                return null;
        }
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

    }
}
