import java.awt.BorderLayout;
import javax.swing.JPanel;

public class NavViewPanel extends JPanel
{
    NavViewBottomMenuPanel menu;
    NavViewSplashPanel splash;
    
    
    OptionsView o_view;
    MainView m_view;
    InstructionsView i_view;
    CreditsView c_view;
    OptionsModel o_model;
    
    public NavViewPanel() 
    {
        super();
        setLayout(new BorderLayout());     
        menu = new NavViewBottomMenuPanel();
        splash = new NavViewSplashPanel();
        
        add(menu, BorderLayout.SOUTH);        
       add(splash, BorderLayout.CENTER);                        
    }
    
    //Note: Splash screen is only shown on startup.  No need to navigate back to it.
    
//Add Panels--------------------------------------------------------------------
    
    
    
    public void addOptions(OptionsView o_view)
    {
        this.o_view = o_view; //maintain handle to this view so we can remove it
        add(o_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addMain(MainView m_view,OptionsModel o_model)
    {
        this.m_view = m_view;  //maintain handle to this view so we can remove it
        this.o_model = o_model;
        o_model.getdiff();
        add(m_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addInstructions(InstructionsView i_view)
    {
        this.i_view = i_view; //maintain handle to this view so we can remove it
        add(i_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addCredits(CreditsView c_view)
    {
        this.c_view = c_view; //maintain handle to this view so we can remove it
        add(c_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    
    
    public void addSplash(NavView n_view)
    {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
//Remove Panels-----------------------------------------------------------------
    
    
    public void removeOptions()
    {
        if (this.o_view != null)
            remove(this.o_view);
    }
    
    public void removeMain()
    {
        if (this.m_view != null)
            remove(this.m_view);
    }

    public void removeCredits()
    {
        if(this.c_view != null)
            remove(this.c_view);
    }
    
    public void removeInstructions()
    {
        if(this.i_view != null)
            remove(this.i_view);
    }
    public void removeSplash()
    {
        remove(splash);
    }
    
}

