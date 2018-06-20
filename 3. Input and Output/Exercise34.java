import java.util.Random;
import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int myGuess, number, difference;

        // Picks a random number
        number = random.nextInt(100) + 1;
        
        // Asks for the guess
        System.out.println("I'm thinking of a number between 0 and 100 (including both). Can you guess what it is?");
        System.out.print("Type your number: ");
        myGuess = in.nextInt();
        System.out.printf("Your guess was: %d\n", myGuess);

        // Compares number to guess
        difference = number - myGuess;

        // Displays the rest
        System.out.printf("The number I was thinking of is: %d\n", number);
        System.out.printf("You were off by: %d", difference);
    }
}