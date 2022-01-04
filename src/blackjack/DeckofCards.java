package blackjack;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;

public class DeckofCards {
    private Card[] deck;

    public DeckofCards() {
        this.deck = new Card[52];
        int count = 0;
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j <= 3; j++) {
                this.deck[count] = new Card(i, j);
                count++;
            }
        }
    }

    public void returnDeck(){
        System.out.println(deck);
    }

    public void f(){
        String s = Arrays.toString(this.deck);
        System.out.println(s);
    }

    /*public int setIndex(){
        int index = (int) (52.0 * Math.random());
        return index;
    }*/

    public void shuffleDeck(){

        List<Card> m = Arrays.asList(this.deck);
        ArrayList<Card> m1 = new ArrayList<Card>(m);
        System.out.println(m1);
        for(int i = 0;i<1000;i++){
            int y = (int)(52.0*Math.random());
            Card x = this.deck[y];
            System.out.println(x);
            m1.remove(y);
            m1.add(50,x);
            System.out.println(m1);
        }


    }

}
