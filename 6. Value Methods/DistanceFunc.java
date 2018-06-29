import java.util.Scanner;

public class DistanceFunc {

    public static void main(String[] args) {
        double dx, dy, x1, x2, y1, y2,
            inner, total;
        x1 = askValue();
        x2 = askValue();
        y1 = askValue();
        y2 = askValue();

        dx = x2 - x1;
        dy = y2 - y1;
        inner = square(dx) + square(dy);
        total = sqrt(inner);
        System.out.print("Distance between two points: ");
        System.out.println(total);
    }

    // Asks the user for the float value of a variable
    public static double askValue() {
        Scanner in = new Scanner(System.in);
        double value;

        System.out.print("Value? ");
        value = in.nextDouble();

        return value;
    }

    // Finds the square of a given float
    public static double square(double value) {
        return value * value;
    }

    // Finds the squareroot of a given float
    public static double sqrt(double value) {
        return Math.pow(value, 0.5);
    }

}

/** Overloading
    - Java supports having multiple methods with the same name
    - Used for methods with the same functions but with different parameters
    - Java automatically detects for method that fits the data type/ number of parameters given

 */