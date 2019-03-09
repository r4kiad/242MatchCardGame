
import java.awt.event.*;
import javax.swing.JButton;

public class OptionsController 
{
    private OptionsModel o_model;
    private OptionsView o_view;
    private MainView m_view;
    OptionsController(final OptionsModel o_model,final OptionsView o_view,final MainView m_view)
    {
        this.o_model = o_model;
        this.o_view = o_view;
        this.m_view = m_view;
        class ButtonListener implements ActionListener {            
        
            public void actionPerformed(ActionEvent e)
            {
                JButton eventSource = (JButton)e.getSource();
        if(eventSource == o_view.getretButton())
        {
        o_model.setpname(o_view.getName());
        o_model.setdiff(o_view.getdiff());
        o_view.getinfo("information saved  ");
        
        }
        else{}
        }
        }
      o_view.ButtonListener(new ButtonListener());             
    }
}
