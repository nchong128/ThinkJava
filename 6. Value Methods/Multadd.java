public class Multadd {

    public static void main(String[] args) { 
        double a = 0.5;
        double b = Math.cos(Math.PI / 4);
        double c = Math.sin(Math.PI / 4);

        double solution1 = multadd(a,b,c);

        // Revise this
        System.out.println(Math.log(10) + Math.log(20));
    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        double exponent = Math.exp(-x);
        double lhs = x * exponent;
        double rhs = Math.sqrt(multadd(exponent, -1, 1));

        return lhs + rhs;
    }
}