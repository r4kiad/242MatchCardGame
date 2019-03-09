//Acts as our App.java java class

public class MatchGameFinalProject 
{
    public static void main(String[] args) 
    {
        OptionsModel o_model = new OptionsModel();
        NavModel model = new NavModel();
        NavView view = new NavView(model,o_model);
        NavController controller = new NavController(model, view);
        
        view.setSize(700,500);
        
        view.setVisible(true);
        
    }
    
}
