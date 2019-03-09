import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class NavView extends JFrame
{
    NavModel model;
    NavViewPanel nVpanel;
    OptionsModel o_model;
    
    NavView(NavModel model,OptionsModel o_model)
    {
        super("Memory Card Game");
        this.model = model;
        this.o_model= o_model;
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        nVpanel = new NavViewPanel();
        
        add(nVpanel);    
    }
    
//Switch To Operations----------------------------------------------------------    
    
    
    public void switchToOptionsPanel(OptionsView o_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeInstructions();
        nVpanel.removeCredits();
        nVpanel.addOptions(o_view);        
    }
    
    public void switchToMainPanel(MainView m_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        nVpanel.removeInstructions();
        nVpanel.removeCredits();
        o_model.getdiff();
        nVpanel.addMain(m_view,o_model);        
    }
    
    public void switchToCreditsPanel(CreditsView c_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeInstructions();
        nVpanel.removeOptions();
        nVpanel.addCredits(c_view);
    }
    
    public void switchToInstructionsPanel(InstructionsView i_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeCredits();
        nVpanel.addInstructions(i_view);
    }
    
//Add Button Listeners----------------------------------------------------------
    
   
    
    public void addOptionsButtonListener(ActionListener al) 
    {    
        nVpanel.menu.optionsButton.addActionListener(al);
    }    
                    
    public void addMainButtonListener(ActionListener al) 
    {    
        nVpanel.menu.mainButton.addActionListener(al);
    }
    
    public void addCreditsButtonListener(ActionListener al)
    {
        nVpanel.menu.creditsButton.addActionListener(al);
    }
    
    public void addInstructionsButtonListener(ActionListener al)
    {
        nVpanel.menu.instructionsButton.addActionListener(al);
    }
}
