// Can use conditonals to react accordingly to circumstances
// Can use if, else and else if
// Can create boolean flags to signify if something i true or false

import java.util.Scanner;

public class Conditionals {

    public static void posOrNeg (int num) {
        if (num == 0 ) {
            System.out.printf("%d is zero.", num);
        }
        else if (num > 0) {
            System.out.printf("%d is positive.", num);
        }
        else {
            System.out.printf("%d is negative.", num);
        }
    }   

    public static void main(String[] args) {
        int x, y;
        boolean confirm;
        Scanner in = new Scanner(System.in);

        System.out.println("What is x?");
        x = in.nextInt();

        System.out.println("What is y?");
        y = in.nextInt();

        posOrNeg(x);

        
    }
}