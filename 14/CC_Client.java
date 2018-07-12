public class CC_Client {

    public static void main(String[] args) {
        CardCollection test = new CardCollection("Nick");
        CardCollection skux = new CardCollection("Abe");
        Card card = new Card(3,1);
        Card cardiB = new Card(5,1);
        Card cardiC = new Card(6,2);

        test.addCard(card);
        test.addCard(cardiB);
        test.addCard(cardiC);

        test.shuffle();
        System.out.println(test.getCard(0));
    }
}