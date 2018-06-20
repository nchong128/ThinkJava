import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        int seconds, minutes, hours, remainder;
        Scanner in = new Scanner(System.in);

        System.out.print("Number of seconds: ");
        seconds = in.nextInt();
        hours = seconds / 3600;
        remainder = seconds % 3600;
        System.out.println(remainder);
        minutes = remainder / 60;
        seconds = remainder % 60;

        System.out.printf("%d hours, %d minutes, and %d seconds", hours, minutes, seconds);

    }
}