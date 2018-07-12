/**
 * Have defined a class to represent a collection of cards
 * Deck and Hand extends the superclass CardCollection
 */

// extends means that Deck has the same instance variables/methods as CardCollection
public class Deck extends CardCollection {

    // Constructors are not inherited but all other public attributes and methods are
    public Deck(String label) {
        super(label);

        for (int suit = 0; suit <= 3; suit++) {
            for (int rank  = 1; rank <= 13; rank++) {
                this.cards.add(new Card(rank, suit));
            }
        }
    }
}