
import javax.swing.JButton;
import javax.swing.JPanel;

public class NavViewBottomMenuPanel extends JPanel
{
    JButton mainButton;
    JButton optionsButton;
    JButton instructionsButton;
    JButton creditsButton; 
    JButton playButton;
    
    public NavViewBottomMenuPanel() 
    {
        super();       
        mainButton = new JButton("Main");
        optionsButton = new JButton("Options");
        instructionsButton = new JButton("Instructions");
        creditsButton = new JButton("Credits");
                                  
        add(mainButton);
        add(optionsButton);
        add(instructionsButton);
        add(creditsButton);   
        

    }          
}
