import java.util.Random;
public class DeckClient {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.selectionSort();
        deck.print();


    }
    
}   