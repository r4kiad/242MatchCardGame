/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JButton;
/**
 *
 * @author Kiad
 */
public class Card extends JButton{
    private int id;
    private boolean match = false;
    Card(){
        
    }
     public void setid(int id)
    {
        this.id=id;
    }
   
    public int getid()
    {
        return this.id;
    }
    public void setmatch(boolean match){
        this.match = match;
    }

    public boolean getmatch(){
        return this.match;
    }
    public void showText(){
        this.setText(String.valueOf(id));
    }
}
