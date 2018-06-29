public class Exercise62 {
    
    public static void main(String[] args) {
        System.out.println(isTriangle(31,31,31));
    }

    public static boolean isDivisible(int n, int m) {
        return n % m == 0;
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a > (b + c)) {
            return false;
        }
        else if (b > (a + c)) {
            return false;
        }
        else if (c > (b + c)) {
            return false;
        }
        else {
            return true;
        }
    }
}