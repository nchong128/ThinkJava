public class Recursion {

    public static void main(String[] args) {
        int x = fibonacci(4);
        System.out.println(x);
    }

    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        else {
            return value * factorial(value - 1);
        }
    }

    public static int fibonacci(int value) {
        if (value == 1 || value == 2) {
            return 1;
        }
        else {
            return fibonacci(value - 1) + fibonacci(value - 2);
        }
    }
}