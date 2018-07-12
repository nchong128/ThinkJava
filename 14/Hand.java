/** 
 * Need to represent a hand, a collection of cards held by a player or a pile
 * Not much difference between a hand and a pile so made under one class
 */

public class Hand extends CardCollection {

    /** 
     * Hand has a constructor which invokes the CardCollection constructor
     * and nothing else.
     */
    public Hand(String label) {
        super(label);
    }

    /**
     * Hand extends CardCollection, inherits all of its methods, used here
     */
    public void display() {
        System.out.println(getLabel() + ": ");
        for (int i = 0; i < size(); i++) {
            System.out.println(getCard(i));
        }
        System.out.println();
    }
}