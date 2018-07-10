public class Deck {
    public Card[] cards;

    public Deck(int n ) {
        this.cards = new Card[n];
    }

    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card[rank, suit];
                index++;
            }
        }
    }

    
}