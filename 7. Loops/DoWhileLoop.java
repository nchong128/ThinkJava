/** do-while loop
    - while and for loops are pretest loops
        They test the condition first and at the beginning
            of each pass through the loop
    - do-while is a posttest loop
        Useful for running a loop at least once
 */

/** break and continue
    - Can use a break to exit the current loop it is in
    - Can use continue to move onto the next iteration
 */
import java.util.Scanner;

public class DoWhileLoop {
    
    public static void main(String[] args) {
        continueExample();
    }    

    public static void doWhileExample() {
        /**
            - Can use a do-while loop to keep reading input until it is valid
            - Asks for input
                If false, consumes the invalid input using next and displays it
                If true, okay flag turned to true, so the loop is broken
            - Can now assign to x and display it
        */
        Scanner in = new Scanner(System.in);
        boolean okay;
        do {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                okay = true;
            }
            else {
                okay = false;
                String word = in.next();
                System.err.println(word + " is not a number");
            }
        }
        while (!okay);

        double x = in.nextDouble();
        System.out.println("Your number is " + x);
    }

    public static void breakExample() {
        Scanner in = new Scanner(System.in);
        // Using true as a conditional allows it to loop forever
        while (true) {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                break;
            }
            String word = in.next();
            System.err.println(word + " is NaN");
        }
        double x = in.nextDouble();
    }

    // This method computes a total that skips over negative values
    // by using continue to move to the next iteration of the while loop
    public static void continueExample() {
        Scanner in = new Scanner(System.in);
        int x = -1;
        int sum = 0;
        while (x != 0) {
            x = in.nextInt();
            if (x <= 0) {
                continue;
            }
            System.out.println("Adding " + x);
            sum += x;
        }
    }
}