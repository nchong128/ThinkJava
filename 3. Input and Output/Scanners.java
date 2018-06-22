import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        // System class provides System.in which is an InputStream that allows reading inputs from the keyboard
        // Methods not easy to user -> Use other classes to handle input tasks

        // Scanner is a class that provides methods for inputting words, numbers
        // provided by java.util, a package that contains classes called "utility classes"
        // need to import at the beginning of the file.
        
        // After importing, need to create a Scanner
        // Scanner variable named in and creates a new Scanner that takes input from System.in
        Scanner in = new Scanner(System.in);

        // Scanner also provides a method called nextLine
        // nextLine will read a line of input from the keyboard and return a String
        String name;
        System.out.println("What is your name? ");
        name = in.nextLine();
        System.out.println("Your name is " + name + "\n" );

        String birthDate;
        System.out.println("What day were you born? ");
        birthDate = in.nextLine();
        System.out.println("You were born on a " + birthDate);

    }
}