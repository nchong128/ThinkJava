import java.util.Scanner;
import java.util.Random;

public class Exercises {
    public static void main(String[] args ) {
        //exercise1();
        //checkFermat(1,2,3,2);
        //bottlesOfBeer(3);
        guessMyNumber();
    }

    public static void guessMyNumber() {
        Random random = new Random();
        int numToGuess = random.nextInt(100) + 1;
        loopOver(numToGuess);

    }

    public static void loopOver(int numToGuess) {
        Scanner in = new Scanner(System.in);
        int myGuess;

        System.out.println("What is your guess?");
        myGuess = in.nextInt();

        if (myGuess == numToGuess) {
            System.out.println("You got it!");
        }
        else if (myGuess > numToGuess) {
            System.out.println("Too high!");
            loopOver(numToGuess);
        }
        else {
            System.out.println("Too low!");
            loopOver(numToGuess);
        }
    }
        
    public static void exercise1() {
        int x = 51;

        if (x > 0 && x < 10) {
            System.out.println("Positive single digit number");
        }
    }

    public static void checkFermat(int a, int b, int c, int n) {
        double lhs = Math.pow(a,2) + Math.pow(b,2);
        double rhs = Math.pow(c,2);

        if (n > 2 && lhs == rhs) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } 
        else {
            System.out.println("No that doesn't work");
        }
    }

    public static void bottlesOfBeer(int number) {
        if (number == 0) {
            chorus(number);
            System.out.println("’cause there are no more bottles of beer on the wall!");
        }
        else {
            chorus(number);
            bottlesOfBeer(number - 1);
        }
    }

    public static void chorus(int number) {
        if (number > 0) {
            System.out.println(number + " bottles of beer on the wall,");
            System.out.println(number +  " bottles of beer,");
            System.out.println("ya take one down, ya pass it around,");
            System.out.println(number + " bottles of beer on the wall.\n");
        }
        else {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya take one down, ya pass it around,");
        }
    }
}