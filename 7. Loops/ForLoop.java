/** for loops
    - Can use for loops as well
    - Need to specify initialiser, condition and update in the for loop
    - ++ and -- for increment/decrement
    - += and -= for increment/decrement for set amount
    - Main difference between for and while is that variable in initialiser
        exists only inside the for loop, no where else. (see foo)
    - Can be dealt with by specifying variable outside the for loop
 */
public class ForLoop {
    
    public static void main(String[] args) {
        bar();
    }

    public static void foo() {
        for (int i = 0; i <= 5; i ++) {
            System.out.println(i);
        }
        // System.out.println(i); // This will give a compiler error
    }

    public static void bar() {
        int i;
        for (i = 0; i <= 6; i ++) {
            System.out.println(i);
        }
        System.out.println(i); // No error
    }
}