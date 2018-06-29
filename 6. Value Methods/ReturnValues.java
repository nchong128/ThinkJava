/**
    - When invoking void method, usually on a line by itself
    - When invoking a value method, there is a return value
    - Usually assigned to a variable/part of an expression

    - Value methods declare the type of the return value and
        uses a return statement to give the value 

 */
public class ReturnValues {

    public static void main(String[] args) {
        double x = absoluteValue(10.0);
        System.out.println(x);
    }

    // Example 1: This method takes a double as a parameter
    // and returns the area of a circle as a double

    // Returning a value of a different type -> Error
    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }

    public static double absoluteValue(double value) {
        if (value < 0) {
            return -value;
        }
        else {
            return value;
        }
        // Code will give an error if there is dead code
        // System.out.println("XD");

        // Need to make sure that every possible path goes to a return statement
        // Error otherwise
    }
}