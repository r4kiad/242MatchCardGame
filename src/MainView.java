import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
//this code is what you see when you click main
public class MainView extends JPanel 
{
     private final  Player p = new Player();
     private MainModel m_model;
     private OptionsModel o_model;
     private MainController m_controller;
     private final List<Card> cards;
    private Card selectedCard;
    private Card card1;
    private Card card2;
    private final Timer t;
    private final Card c = new Card();
    
    MainView(MainModel m_model,OptionsModel o_model)
    {
        this.o_model = o_model;
        int d = o_model.getdiff();
        System.out.println("Here " + d);
       if(d == 1){
        int pairs = 8;
        List<Card> cardsList = new ArrayList<Card>();
        List<Integer> cardVals = new ArrayList<Integer>();
        for (int i = 0; i < pairs; i++){
            cardVals.add(i);
            cardVals.add(i);
        }
        Collections.shuffle(cardVals);
        
        for (int val : cardVals){
            final Card c = new Card();
            c.setid(val);
            c.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    //selectedCard = c;
                    doTurn(c);
                }
            });
            cardsList.add(c);
        }
        
        this.cards = cardsList;
        JPanel d1 = new JPanel();
        d1.setLayout(new GridLayout(4,4));
        for (Card c : cards){
            d1.add(c);
        }
        add(d1);
       }
       else if(d == 2)
       {
           int pairs = 12;
        List<Card> cardsList = new ArrayList<Card>();
        List<Integer> cardVals = new ArrayList<Integer>();
        for (int i = 0; i < pairs; i++){
            cardVals.add(i);
            cardVals.add(i);
        }
        Collections.shuffle(cardVals);
        
        for (int val : cardVals){
            final Card c = new Card();
            c.setid(val);
            c.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    //selectedCard = c;
                    doTurn(c);
                }
            });
            cardsList.add(c);
        }
        
        this.cards = cardsList;
        
        JPanel d2 = new JPanel();
        d2.setLayout(new GridLayout(6,4));
        for (Card c : cards){
            d2.add(c);
        }
        add(d2);
        
       
       }
       else
       {
           int pairs = 18;
        List<Card> cardsList = new ArrayList<Card>();
        List<Integer> cardVals = new ArrayList<Integer>();
        for (int i = 0; i < pairs; i++){
            cardVals.add(i);
            cardVals.add(i);
        }
        Collections.shuffle(cardVals);
        
        for (int val : cardVals){
            final Card c = new Card();
            c.setid(val);
            c.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    //selectedCard = c;
                    doTurn(c);
                }
            });
            cardsList.add(c);
        }
        
        this.cards = cardsList;
        
       JPanel d3 = new JPanel();
        d3.setLayout(new GridLayout(6,6));
        for (Card c : cards){
            d3.add(c);
        }
        add(d3); 
       
       }
//set up the timer
        t = new Timer(750, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                checkCards();
            }
        });

        t.setRepeats(false);
    }
    public int getdiff()
    {
        return o_model.getdiff();
    }
    
    
    public void doTurn(Card selectedCard){
        if (card1 == null && card2 == null){
            card1 = selectedCard;
            card1.showText();
        }

        if (card1 != null && card1 != selectedCard && card2 == null){
            card2 = selectedCard;
            card2.showText();
            t.start();

        }
    }
    
    public void checkCards(){
        if (card1.getid() == card2.getid()){//match condition
            card1.setEnabled(false); //disables the button
            card2.setEnabled(false);
            card1.setmatch(true); //flags the button as having been matched
            card2.setmatch(true);
            if (this.isGameWon()){
                JOptionPane.showMessageDialog(this, "You win!");
                //System.exit(0);
            }
            }
        else{
            card1.setText(""); //'hides' text
            card2.setText("");
            }
        card1 = null; //reset c1 and c2
        card2 = null;
    }
    public boolean isGameWon(){
        for(Card c: this.cards){
            if (c.getmatch() == false){
                return false;
            }
        }
        return true;
    }

}
