public class Client {

    public static void main(String[] args) {
        Deck deck = new Deck("Deck");
        deck.shuffle();

        Hand hand = new Hand("Hand");
        /**
         * Able to use the deal method because Hand is a subclass of 
         * CardCollection, so Hand is considered to be a CARDcOLLECTION
         * 
         * If a method expects a CardCollection, can give it a Hand, Deck or
         * CardCollection.
         * 
         * This does not apply vice versa... not every CardCollection is a Hand
         */
        deck.deal(hand,5);
        hand.display();

        Hand drawPile = new Hand("Draw Pile");
        deck.dealAll(drawPile);
        System.out.printf("Draw Pile has %d cards.\n", drawPile.size());
    }
}