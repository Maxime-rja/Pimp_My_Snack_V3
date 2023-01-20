import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PimpMySnack extends JFrame implements ActionListener
{

    Inventaire stock = new Inventaire();

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
        IHMStockIngredient IHM_pain = new IHMStockIngredient(this, panel, stock, "Images/pain.png", "Pain");
        IHM_pain.add_to_panel(panel);

        // TOMATE
        IHMStockIngredient IHM_tomate = new IHMStockIngredient(this, panel, stock, "Images/tomate.png", "Tomate");
        IHM_tomate.add_to_panel(panel);

        // STEAK
        IHMStockIngredient IHM_steak = new IHMStockIngredient(this, panel, stock, "Images/steak.png", "Steak");
        IHM_steak.add_to_panel(panel);

        // OIGNON
        IHMStockIngredient IHM_oignon = new IHMStockIngredient(this, panel, stock, "Images/oignon.png", "Oignon");
        IHM_oignon.add_to_panel(panel);

        // CHAMPIGNON
        IHMStockIngredient IHM_champignon = new IHMStockIngredient(this, panel, stock, "Images/champignon.png", "Champignon");
        IHM_champignon.add_to_panel(panel);

        // FROMAGE
        IHMStockIngredient IHM_fromage = new IHMStockIngredient(this, panel, stock, "Images/fromage.png", "Fromage");
        IHM_fromage.add_to_panel(panel);

        // CORNICHON
        IHMStockIngredient IHM_cornichon = new IHMStockIngredient(this, panel, stock, "Images/cornichon.png", "Cornichon");
        IHM_cornichon.add_to_panel(panel);

        // SALADE
        IHMStockIngredient IHM_salade = new IHMStockIngredient(this, panel, stock, "Images/salade.png", "Salade");
        IHM_salade.add_to_panel(panel);

        // POULET
        IHMStockIngredient IHM_poulet = new IHMStockIngredient(this, panel, stock, "Images/poulet.png", "Poulet");
        IHM_poulet.add_to_panel(panel);

        // BACON
        IHMStockIngredient IHM_bacon = new IHMStockIngredient(this, panel, stock, "Images/bacon.png", "Bacon");
        IHM_bacon.add_to_panel(panel);

        // LAYOUT
        panel.setLayout(new GridLayout(10,5));
     
        return panel;
    }

	public static void main ( String [] args )
	{
        PimpMySnack fenetreAdmin = new PimpMySnack();
        fenetreAdmin.setVisible(true);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

    }
}
