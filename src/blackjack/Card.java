package blackjack;
import java.util.Arrays;
import java.util.ArrayList;

public class Card {
    private int rank;
    private int suit;

    //constructor
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    //arrays for card ranks and suits
    public static final String[] SUITS = {"Clubs","Spades","Hearts","Diamonds"};
    public static final String[] RANKS = {null,"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queens","Kings"};

    //sets the value of the cards in blackjack
    public int getValue(){
        if(this.rank<11 && this.rank>1){
            return this.rank;
        }
        else if(this.rank>10 && this.rank<14){
            return 10;
        }
        else if(this.rank==1){
            return 1;
        }
        return 0;
    }

    //toString methods
    public String toString(){
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }





}
