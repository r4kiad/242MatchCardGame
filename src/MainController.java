
import java.awt.GridLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author r4kia
 */
public class MainController {
    private MainModel m_model;
    private MainView m_view;
    private OptionsModel o_model;
    
    MainController(final MainModel m_model,final MainView m_view, OptionsModel o_model)
    {
        this.m_model = m_model;
        this.m_view = m_view;
        this.o_model = o_model;
        
        System.out.println("controller " + o_model.getdiff());
        System.out.println("Controller + m view " + m_view.getdiff());
    }
}

