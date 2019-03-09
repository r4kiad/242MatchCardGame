/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;


public class Player extends JFrame {
    
    private String playerName;
    private int diff;
    Player(){
        
    }
     public void setpname(String playerName)
    {
        this.playerName=playerName;
    }
    
    public void setdiff(int diff)
    {
        this.diff = diff;
    }
    public String getname()
    {
        return this.playerName;
    }
    public int getdiff()
    {
        return this.diff;
    }
    public String getInfo()
    {
        return(this.playerName + ", Difficulty: " + this.diff);
    }
    
}
