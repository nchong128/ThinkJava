/** while loop
    - Can use while loops
    -Math.log is to base e, to get log to base n, divide Math.log(~) by Math.log(n)
  */
public class WhileLoop {
    
    public static void main(String[] args) {
        whileCountdown(10);
        logTable();
    }

    public static void whileCountdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }

    public static void logTable() {
        int i = 1;
        final double LOG2 = Math.log(2);

        while (i < 10) {
            double x = (double) i;
            System.out.println(x + "  " + Math.log(x) / LOG2);
            i = i * 2;
        }
    }
}