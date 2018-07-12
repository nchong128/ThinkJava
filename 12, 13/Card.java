public class Card {
    /**
     * Local variables defined in a method and instance variables defined before method definitions
     * Class variables (includes static) are created when the program begins and survives until the program ends
     * Differs to instance variables where they are reclaimed when the object is garbage-collected
     * Class variables are shared across all instances of the class
     * Often used to store constant values -> final normally used
     * ALL CAPS naming convention
     * Do not need to be created everytime methods are called, also needed in other methods and classes
     * Array variables are final and the strings are immutable, so it can be public
     * There is only one instance of a class variable, no matter how many objects there are
     */

    // Zeroth element not used so that Ace is assigned to 1
    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6","7","8","9","10","Jack", "Queen", "King"};
    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    
    // Declare instance variables and write constructors
    private final int rank;
    private final int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Write toString method
    public String toString() {
        String s = RANKS[this.rank] + " of " + SUITS[this.suit];
        return s;
    }

    // Create an equals method 
    public boolean equals(Card that) {
        return this.rank == that.rank
            && this.suit == that.suit;
    }

    /**
     * Create a compare method
     * Can use comparators for primitive values but for objects, will have to decide on what is of higher value
     * Suits determined to be of higher value than rank
     */
    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        
        return 0;
    }

    /**
     * Attributes are private so getters are written to give info on these attributes
     * We want cards to be immutable as it will lead to less errors, so we do not include any setters
     * To make sure the attributes are fully immutable, we add final to those attributes
     * Can still assign values to it inside a constructor
     */
    
    public int getRank() {
        return this.rank;
    }
    
    public int getSuit() {
        return this.suit;
    }

}