/** Recursion
    - Methods can call itself recursively until the base case
    - Try to think of going both down and possibly up the stack
 */
public class Recursion {
    public static void main(String[] args) {
        countdown(10);
        displayBinary(23); 
        System.out.println();
    }
    
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blast off!");
        }

        else {
            System.out.println(n);
            countdown(n-1);
        }
    }

    public static void displayBinary(int value) {
        // Base case when value = 0
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);

        }
    }
}
