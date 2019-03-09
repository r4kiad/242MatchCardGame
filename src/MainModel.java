/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author r4kia
 */
public class MainModel {
    private Player p = new Player();
    private Card c = new Card();
    public void setpname(String playerName) {
        p.setpname(playerName);
    }

    public void setdiff(int diff){
        p.setdiff(diff);
    }
    public String getname()
    {
        return p.getname();
    }
    public int getdiff()
    {
        return p.getdiff();
    }
    public String getInfo(){
        return p.getInfo();
    }
    public void setid(int id){
        c.setid(id);
    }
    public void setmatch(boolean match){
        c.setmatch(match);
    }
    public boolean getmatch(){
        return c.getmatch();
    }
}
