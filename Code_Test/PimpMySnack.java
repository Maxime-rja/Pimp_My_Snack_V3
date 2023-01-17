import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PimpMySnack extends JFrame
{
    public PimpMySnack()
    {
        super();
        build();
    }

    private void build(){
		setTitle("Pimp My Snack"); //On donne un titre à l'application
		setSize(1000,500); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        setContentPane(buildContentPane());
	}

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();

        JLabel label_pain = new JLabel("Pain");
        JButton btn_add_pain = new JButton("+");
        JButton btn_rm_pain = new JButton("-");

        JLabel label_tomate = new JLabel("Tomates");
        JButton btn_add_tomate = new JButton("+");
        JButton btn_rm_tomate = new JButton("-");

        JLabel label_steak = new JLabel("Steak");
        JButton btn_add_steak = new JButton("+");
        JButton btn_rm_steak = new JButton("-");


        JLabel label_oignon = new JLabel("Oignon");
        JButton btn_add_oignon = new JButton("+");
        JButton btn_rm_oignon = new JButton("-");

        JLabel label_champignon = new JLabel("Champignon");
        JButton btn_add_champignon = new JButton("+");
        JButton btn_rm_champignon = new JButton("-");

        JLabel label_fromage = new JLabel("Fromage");
        JButton btn_add_fromage = new JButton("+");
        JButton btn_rm_fromage = new JButton("-");

        JLabel label_cornichon = new JLabel("Cornichon");
        JButton btn_add_cornichon = new JButton("+");
        JButton btn_rm_cornichon = new JButton("-");

        JLabel label_salade = new JLabel("Salade");
        JButton btn_add_salade = new JButton("+");
        JButton btn_rm_salade = new JButton("-");

        JLabel label_poulet = new JLabel("Poulet");
        JButton btn_add_poulet = new JButton("+");
        JButton btn_rm_poulet = new JButton("-");

        JLabel label_bacon = new JLabel("Bacon");
        JButton btn_add_bacon = new JButton("+");
        JButton btn_rm_bacon = new JButton("-");

        panel.add(label_pain);
        panel.add(btn_add_pain);
        panel.add(btn_rm_pain);

        panel.add(label_tomate);
        panel.add(btn_add_tomate);
        panel.add(btn_rm_tomate);

        panel.add(label_steak);
        panel.add(btn_add_steak);
        panel.add(btn_rm_steak);

        panel.add(label_oignon);
        panel.add(btn_add_oignon);
        panel.add(btn_rm_oignon);

        panel.add(label_champignon);
        panel.add(btn_add_champignon);
        panel.add(btn_rm_champignon);

        panel.add(label_fromage);
        panel.add(btn_add_fromage);
        panel.add(btn_rm_fromage);

        panel.add(label_cornichon);
        panel.add(btn_add_cornichon);
        panel.add(btn_rm_cornichon);

        panel.add(label_salade);
        panel.add(btn_add_salade);
        panel.add(btn_rm_salade);

        panel.add(label_poulet);
        panel.add(btn_add_poulet);
        panel.add(btn_rm_poulet);

        panel.add(label_bacon);
        panel.add(btn_add_bacon);
        panel.add(btn_rm_bacon);


        panel.setLayout(new GridLayout(10,3));
     
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
}
