package blackjack;

public class BlackjackGame {
    private int handsplayed;
    public BlackjackGame(){
        this.handsplayed = 0;
        Dealer dealer = new Dealer();
        Player player = new Player(100000);
        DeckofCards deck = new DeckofCards();
    }

    public void deal(){

    }

    public void reset(){

    }

    public void hit(){

    }

    public void stand(){

    }

    public void doubledown(){

    }

    public void split(){

    }

    public void surrender(){

    }

    public void decision(){

    }
}
