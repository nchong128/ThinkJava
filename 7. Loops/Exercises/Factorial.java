public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static double factorial(int n) {
        double result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}