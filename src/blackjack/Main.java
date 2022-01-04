package blackjack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        DeckofCards deck = new DeckofCards();
        deck.shuffleDeck();
        Card card1 = new Card(13,1);
        ArrayList list = new ArrayList();
        list.add(card1);
        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("String4");
        int y = (int)(5.0*Math.random());
        list.remove(y);
        list.add(3,"Stringnew");
        System.out.println(list);

    }
}
