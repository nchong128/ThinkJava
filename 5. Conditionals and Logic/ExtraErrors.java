// Can have more ways to check errors 
// nextDouble, so scanner tries to read a double
// If the user enters a float, the Scanner converts it to a double
// If the user types anything else, Scanne throws an InputMismatchException

// Can be prevented by using hasNextDouble from the Scanner class
// Checks whether the next token in the input stream can be interpreted as a double
// If so, can call nextDouble with no chance of throwing an exception
// If not, displays error message and returns
import java.util.Scanner;

public class ExtraErrors {

    public static void main(String[] args) {
        scanDouble();
    }

    public static void scanDouble() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }
        double x = in.nextDouble();

    }
    
    public static void logarithm(int num) {
        if (num <= 0.0) {
            System.err.println("Error: The number has to be positive");
            return;
        }

        double result = Math.log(num);
        System.out.println("The log of the number is " + result);

    }  

}