import javax.swing.JLabel;
import javax.swing.JPanel;

public class InstructionsView extends JPanel
{
    
    InstructionsView()
    {
        JLabel instr = new JLabel("The objective of the game is to match all the cards");
        add(instr);
        JLabel instr2 = new JLabel("Player will click on two cards to match");
        add(instr2);
        JLabel instr3 = new JLabel(" if it is not a match then it will flip back down.");
        add(instr3);
        
     
        
    }
}
