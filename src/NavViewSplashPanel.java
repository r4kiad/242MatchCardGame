import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NavViewSplashPanel extends JPanel
{
    JButton splashButton;
    JLabel optionsLabel;
    
    NavViewSplashPanel()
    {
            splashButton = new JButton(new ImageIcon("src/images/Memory_Card_Game_Logo.PNG"));            
            add(splashButton);
            
            optionsLabel = new JLabel("Team 11 Memory Card Game");
            add(optionsLabel);
            
    }
}
