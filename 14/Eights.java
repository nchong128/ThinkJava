import java.util.Scanner;

public class Eights {

    private Player one;
    private Player two;
    private Hand drawPile;
    private Hand discardPile;
    private Scanner in;

    public Eights() {
        Deck deck = new Deck("Deck");
        deck.shuffle();

        int handSize = 5;
        one = new Player("Nick");
        deck.deal(one.getHand(), handSize);

        two = new Player("Chris");
        deck.deal(two.getHand(), handSize);
        
        discardPile = new Hand("Discards");
        deck.deal(discardPile, 1);
        
        drawPile = new Hand("Draw pile");
        deck.dealAll(drawPile);
        
        in = new Scanner(System.in);
    }

    public boolean isDone() {
        return one.getHand().empty() || two.getHand().empty();
    }

    public void reshuffle() {
        Card prev = discardPile.popCard();
        discardPile.dealAll(drawPile);
        discardPile.addCard(prev);
        drawPile.shuffle();
    }

    public Card draw() {
        if (drawPile.empty()) {
            reshuffle();
        }
        return drawPile.popCard();
    }
           
    public Player nextPlayer(Player current) {
        if (current == one) {
            return two;
        }
        else {
            return one;
        }
    }     


}