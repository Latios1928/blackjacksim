package blackjack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        DeckofCards deck = new DeckofCards();
        System.out.println(deck.toString());
        deck.shuffleDeck();
        System.out.println(deck.toString());
    }
}
