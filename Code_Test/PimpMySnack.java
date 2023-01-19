import java.awt.FlowLayout;

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
		setTitle("Ma première fenêtre"); //On donne un titre à l'application
		setSize(1000,500); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        setContentPane(buildContentPane());
	}

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
     
        JLabel label = new JLabel("Bienvenue dans ma modeste application");
     
        panel.add(label);
     
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
