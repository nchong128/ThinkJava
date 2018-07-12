/**
 * Have defined a class to represent a collection of cards
 * Deck and Hand extends the superclass CardCollection
 */

// extends means that Deck has the same instance variables/methods as CardCollection
public class Deck extends CardCollection {

    // Constructors are not inherited but all other public attributes and methods are
    public Deck(String label) {
        // keyword that refers to the superclass of the current class
        // This invokes the CardCollection constructor, which initialises
        // the attributes label and cards
        super(label);
        
        // When it returns the Deck constructor resumes and populates the ArrayList
        // with Card objects
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank  = 1; rank <= 13; rank++) {
                this.cards.add(new Card(rank, suit));
            }
        }
    }
}