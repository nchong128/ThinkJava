import java.util.Random;
public class Deck {
    // Create a Random object as a class variable
    public final static Random random = new Random();
    public Card[] cards;

    public Deck(int n) {
        this.cards = new Card[n];
    }

    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank,suit);
                index++;
            }
        }
    }

    // Instance method that prints all the Cards in the Deck
    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    // Helper methods to the shuffle method
    public int randomInt(int low, int high) {
        int result = random.nextInt(high+1);
        while (result < low) {
            result = random.nextInt(high+1);
        }
        return result;
    }

    public void swapCards(int index1, int index2) {
        Card temp = this.cards[index1];
        this.cards[index1] = this.cards[index2];
        this.cards[index2] = temp;
    }

    public void shuffle() {
        for (int index = 0; index < this.cards.length - 1; index++) {
            int randNum = randomInt(0, this.cards.length - 1);
            swapCards(index, randNum);
        }
    }

    // Finds the index of the lowest Card between lowIndex to highIndex (inclusive)
    public int indexLowest(int lowIndex, int highIndex) {
        int low = lowIndex;
        Card lowestCard = this.cards[low];

        for (int i = lowIndex; i < highIndex + 1; i++) {
            Card candidateCard = this.cards[i];
            if (lowestCard.compareTo(candidateCard) >= 0) {
                lowestCard = candidateCard;
                low = i;
            }
        }
        return low;
    }

    public void selectionSort() {
        for (int i = 0; i < this.cards.length-1; i++) {
            int lowerI = indexLowest(i, this.cards.length-1);
            swapCards(i, lowerI);
        }
    }

}