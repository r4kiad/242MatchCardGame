
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreditsView extends JPanel
{
   private  JLabel gaudlipLabel;
   private  JLabel huangLabel;
   private  JLabel naftulinLabel;
    
    
    
    CreditsView()
    {
      
        
    gaudlipLabel = new JLabel("Benjamin Gaudlip");
    huangLabel = new JLabel("Simon Huang");
    naftulinLabel = new JLabel("Wyatt Naftulin");
    
    add(gaudlipLabel);
    add(huangLabel);
    add(naftulinLabel);
        
    }
}
