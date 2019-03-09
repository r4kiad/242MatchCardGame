import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class OptionsView extends JPanel
{
   private JButton retButton;
   private JTextField playerName;
   private JLabel EnterDiff;
   private JSlider difficulty;
   private JLabel summarylabel;
    
        
   private OptionsModel o_model;
        
    OptionsView(OptionsModel o_model)
    {
        this.o_model = o_model;
              
            
        playerName = new JTextField("--Enter Player Name--");
        difficulty = new JSlider(JSlider.HORIZONTAL, 1,3,3);
        difficulty.setMajorTickSpacing(1);
        difficulty.setPaintLabels(true);
        difficulty.setPaintTicks(true);
        summarylabel = new JLabel("No info yet.");
        add(summarylabel);
        EnterDiff = new JLabel("  Enter Difficulty:");
        
        // It may be useful to have a Save & Return button
            
        retButton = new JButton("Save and Return");
        
        
        add(playerName);
        add(EnterDiff);
        add(difficulty);
        add(retButton);               
        }
    public void ButtonListener(ActionListener al)
    {
        retButton.addActionListener(al);
    }
    public JButton getretButton(){
        return this.retButton;
    }
    public String getName(){
        return this.playerName.getText();
    }
    public int getdiff(){
        return this.difficulty.getValue();
    }
    public void getinfo(String Info){
        summarylabel.setText(Info);
    }
}
