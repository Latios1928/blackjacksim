package blackjack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class Player {
    private ArrayList<Card> phand;
    private double score;
    private double pcardsum;

    public Player(int score){
        this.phand = new ArrayList<Card>();
        this.pcardsum = 0;
    }

}
