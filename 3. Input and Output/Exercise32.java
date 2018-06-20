import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the temperature in Celsius? ");
        celsius = in.nextDouble();
        fahrenheit = (9.0 / 5.0) * celsius + 32.0;
        
        System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);
    }
}