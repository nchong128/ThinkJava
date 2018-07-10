import java.util.Arrays;
public class CardClient {
    public static void main(String[] args) {
        Card threeOfClubs = new Card(3,0);
        Card[] cards = makeDeck();

        printDeck(cards);
        System.out.println(search(cards, threeOfClubs));
        System.out.println(binarySearch(cards, threeOfClubs));
        System.out.println(binarySearch(cards, threeOfClubs, 0, cards.length-1));
        System.out.println(hasFlush(cards));

    }

    // Makes a deck of 52 cards
    public static Card[] makeDeck() {
        Card[] cards = new Card[52];

        int index = 0;
        for (int suit = 0; suit <= 3; suit++ ) {
            for (int rank = 1; rank <= 13; rank++ ) {
                cards[index] = new Card(rank, suit);
                index ++; // should be 52
            }
        }
        return cards;
    }

    // Prints every Card object in the array using iteration
    public static void printDeck(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }

    // Uses sequential search to search where a certain Card in the array would be
    public static int search(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    // Faster binary search method
    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comp = cards[mid].compareTo(target);

            if (comp == 0) {
                return mid;
            }
            else if (comp < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Recursive method for binary search, using low and high as parameters
    // Two common errors for recursive program: No base case, no recursive call to base case
        // Both leadiing to infinite recursion and a StackOverflowException
    public static int binarySearch(Card[] cards, Card target, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        int comp = cards[mid].compareTo(target);

        if (comp == 0) {
            return mid;
        }
        else if (comp < 0) {
            return binarySearch(cards, target, mid + 1, high);
        }
        else {
            return binarySearch(cards, target, low, mid-1);
        }
    }

    public static int[] suitHist(Card[] cards) {
        int[] hist = new int[4];
        for (int i = 0; i < cards.length; i++) {
            int suitNum = cards[i].getSuit();
            hist[suitNum]++;
        }
        return hist;
    }

    public static boolean hasFlush(Card[] cards) {
        int[] hist = suitHist(cards);
        for (int i = 0; i < hist.length; i++) {
            if (hist[i] > 5) {
                return true;
            }
        }
        return false;
    }
}