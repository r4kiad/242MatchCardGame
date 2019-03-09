public class OptionsModel 
{
     
    private Player p = new Player();

    public void setpname(String playerName) {
        p.setpname(playerName);
    }
    public String getname()
    {
        return p.getname();
    }
    public void setdiff(int diff){
        p.setdiff(diff);
    }
    public int getdiff()
    {
        return p.getdiff();
    }
    public String getInfo(){
        return p.getInfo();
    }
}
