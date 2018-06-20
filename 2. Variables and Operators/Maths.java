public class Maths {
    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);

        // Java performs integer division when both operands are integers
        // This is to preserve the int type
        System.out.println(minute / 60); // Returns 0
        System.out.println(13 / 4); // Returns 3

        // Can use floating point numbers instead
        // Declared with double
        // Java does floating point division when one or more operands are floats
        double pi = 3.14159;
        double value = 13; // Legal but bad style
        System.out.println(value / 3);

        // The standard is to actually have floats for float values
        double foo = 1.0 / 3.0; 
        // instead of double foo = 1/3;

        // Rounding errors accumulate as you add things up
        System.out.println(0.1 * 10); // Yields 1
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1+ 0.1+ 0.1+ 0.1+ 0.1); // Yields 0.99999

        // To get absolute precision, use integers instead
        int bankBalance = 12345;
        // instead of double balance = 123.45;
    }
}