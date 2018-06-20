import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {
        int age;
        String name;
        Scanner in = new Scanner(System.in);

        /**
        // This will lead to a bug
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
         */
         
        // To solve, need an extra nextLine after nextInt
        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine(); // Reads the newline
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }
}