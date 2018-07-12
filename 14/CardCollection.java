/**
 * Need to represent a deck of cards, a discard pile, a draw pile, a hand for each player
 * Need to be able to deal, draw and discard cards
 * Two problems:
 * 1) Hands and piles have different sizes, size changes as game progresses, Deck uses an array that cannot
      change in size
 * Solved by: Using an ArrayList, a collection, which is an object that contains other objects
 *            Will allow adding/removing elemnets and it grows and shrinks automatically
 * 2) Deck class may not be suitable to represent hands and piles, may need another class
   Solved by: Using inheritance to make a new class, CardCollection, and then define Deck and Hand as subclasses
              of CardCollection
 * A subclass is anew class that extends an existing class, has all of the attributes/methods of existing class, plus more
 */
import java.util.ArrayList;
import java.util.Random;

public class CardCollection {
    // cards is an ArrayList of Card objects
    private String label;
    private ArrayList<Card> cards;

    // cards initialised with an empty ArrayList
    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<Card>();
    }

    // Method to add a Card element to the collection
    public void addCard(Card card) {
        this.cards.add(card);
    }

    // Removes a Card at a specified index
    public Card popCard(int i) {
        return this.cards.remove(i);
    }

    // Overloaded variant which removes the last card
    public Card popCard() {
        int i = size() - 1;
        return popCard(i);
    }

    public int size() {
        return this.cards.size();
    }

    // Method to check if the CardCollection is empty
    public boolean empty() {
        return size() == 0;
    }

    // Wrapper methods invoke other methods without doing much work
    // These are used to implement less trivial methods

    // Pops cards and adds them to another CardCollection
    public void deal(CardCollection that, int n) {
        for (int i = 0; i < n; i++) {
            Card card = popCard();
            that.addCard(card);
        }
    }

    // Need to use methods get and set to access ArrayList
    public Card getCard(int i) {
        return this.cards.get(i);
    }

    // Method to get the last card without removal
    public Card last() {
        int i = size() - 1;
        return this.cards.get(i);
    }

    // We only allow CardCollection to be modified by either popCard or swapCards
    public void swapCards(int i, int j) {
        Card temp = this.cards.get(i);
        cards.set(i, this.cards.get(j));
        cards.set(j, temp);
    }

    // Method used based on swapCards
    public void shuffle() {
        Random random = new Random();
        for (int i = size() - 1; i > 0; i--) {
            int j = random.nextInt(i);
            swapCards(i,j);
        }
    }
}