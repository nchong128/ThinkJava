import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);
        // final keywords makes the variable constant, it canno be reassigned
        final double CM_PER_INCH = 2.54;

        // Asks the user for inch values
        // nextInt method reads input from keyboard and converts to integers
        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * CM_PER_INCH;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");

        // Formatting output: Using print/println displays up to 16 dp
        // Can use printf to give more control of the format
        // Using %.3f signifies that it should be a flaoting point, rounded to 3 dp
        System.out.printf("Answer is %.3f \n", 4.0 / 3.0); 

        // printf does not append a newline, needs \n
        // Values are matched with the format specifiers in order
        // %d displays integer values 
        // %f displays floating point
        System.out.printf("%d in = %.1f cm \n", inch, cm);

        // %08d, padded with 0's with at least 8 digits wide

    }
}