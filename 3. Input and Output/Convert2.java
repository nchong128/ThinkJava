import java.util.Scanner;

public class Convert2 {
    public static void main(String[] args) {
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54;
        Scanner in = new Scanner(System.in);

        System.out.print("How many centimetres? ");
        cm = in.nextDouble();

        // Converting from cm to inch will lead to an error
        // Float by int leads to float, won't fit type of inch
        // Can convert a float to an integer using a type cast, throws away the fraction
        // Put a type in brackets
        inch = (int) (cm / CM_PER_INCH);
        System.out.printf("%.01f cm = %d in\n", cm, inch);
    }
}