// Don't need to import Math module
// Can use Math.sin/cos/tan
// Can use Math.PI for pi expression
// Math.log(x) is to base e

public class MathOp {
    public static void main(String[] args) {
        double root = Math.sqrt(17.0);
        double angle = 120;
        double radians = Math.toRadians(angle);
        double height = Math.sin(angle);

        long x = Math.round(height);

        System.out.println(x);

    }
}