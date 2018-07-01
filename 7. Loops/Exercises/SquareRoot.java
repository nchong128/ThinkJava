public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(squareRoot(9));
    }

    public static double squareRoot(double a) {
        double x = a/2;
        double prev = 0;
        while (Math.abs(x-prev) >= 0.0001) {
            prev = x;
            x = (x + a/x)/2;
        }
        return x;
    }
}