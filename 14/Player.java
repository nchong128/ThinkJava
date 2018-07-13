/**
 * Player class is used to encapsulate player strategy
 */
public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand(name);
    }

    /**
     * Decides which card to discard during each turn
     * First parameter is reference to Eights object that encapsulates
     * the state of the game
     * Second parameter, prev, is the card on top of the discard pile
     */
    public Card play(Eights eights, Card prev) {
        Card card = searchForMatch(prev);
        if (card == null) {
            card = drawForMatch(eights, prev);
        }
        return card;
    }

    /**
     * Looks in the player's hand for a card that matches the previous played cardd
     */
    public Card searchForMatch(Card prev) {
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (cardMatches(card, prev)) {
                return hand.popCard(i);
            }
        }
        return null;
    }

    /**
     * Keeps drawing until it finds a match
     */
    public Card drawForMatch(Eights eights, Card prev) {
        while (true) {
            Card card = eights.draw();
            System.out.println(name + " draws " + card);
            if (cardMatches(card, prev)) {
                return card;
            }
            hand.addCard(card);
        }
    }

    /**
     * A static method that checks if a card matches another card
     */
    public static boolean cardMatches(Card card1, Card card2) {
        if (card1.getSuit() == card2.getSuit()) {
            return true;
        }
        if (card1.getRank() == card2.getRank()) {
            return true;
        }
        if (card1.getRank() == 8) {
            return true;
        }
        return false;
    }

    /**
     * Computes penalty points for cards left in the player's hand
     * at the end of the game
     */
    public int score() {
        int sum = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            int rank = card.getRank();
            if (rank == 8) {
                sum -= 20;
            }
            else if (rank > 10) {
                sum -= 10;
            }
            else {
                sum -= rank;
            }
        }
        return sum;
    }
}