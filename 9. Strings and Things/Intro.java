/** Strings and Things
    - An Object is a collection of data that provides a set of methods
    - Scanner is an object that provides methods for parsing input
    - System.in and System.out are objects
    - Strings are objects, contains characters and provides methods for
        manipulating character data
    - int, double, boolean are primitive types, not objects
 */

public class Intro {

    public static void main(String[] args) {
        wrapperClass();

    }

    public static void character() {
        // Strings have a method charAt which extracts a character
        // returns a char, a primitive type that stores an invidual letter
        String fruit = "banana";
        char letter = fruit.charAt(0);
        
        System.out.println(letter);
        
        // Characters work like other primitive types
        // Character literals in single quotes, string literals in double quotes
        // Escape sequen ces (like \t) can also be in single quotes
        if (letter == 'b') {
            System.out.println("Yes");
        }

        // Increment and decrement operators work with characters
        // This loop cna go through the alphabet
        System.out.print("Roman alphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();

        // Java uses Unicode to represent characters
        // Uses a type cast to convert each integer 
        // to the corresponding character
        System.out.println("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();
    }

    public static void immutability() {
        // Strings have methods toUpperCase and toLowerCase
        // Does not modify strings as strings are immutable
        String name = "Nicholas Chong";
        String upperName = name.toUpperCase();

        System.out.println(upperName);

        // Can also using replace, finds and replaces instances
        // of one string with another
        String text = "Compsci is fun!";
        text = text.replace("Compsci", "CS");

        System.out.println(text);
    }

    public static void traversal() {
        // Can traverse characters in fruit
        // Strings provide a method called length, returns the number
        // of characters in the string. Method -> Invoked with empty argument list
        String fruit = "BANANA";
        for (int i = 0; i < fruit.length(); i++) {
            char letter = fruit.charAt(i);
            //System.out.println(letter);
        }

        // Enhanced for loop does not work with strings
        // but can convert any string to a character array and iterate it
        for (char letter: fruit.toCharArray()) {
            //System.out.println(letter);
        }

        // To find the last letter of a string 
        int length = fruit.length();
        char last = fruit.charAt(length-1);

        // Many string traversals involves reading one string and creating another
        // To reverse a string..
        System.out.println(reverse(fruit));
    }

    public static String reverse(String s) {
        String r = "";
        for (int  i = s.length() -1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

    public static void substrings() {
        // substring method returns a new string that copies letters
        // from an existing string, starting at a given index
        String fruit = "banana";
        fruit.substring(0); // returns banana
        fruit.substring(2); // returns nana
        fruit.substring(6); // returns ""

        // substring is an overloaded method
        // Has other version of substring that have different parameters
        fruit.substring(0,3); // returns ban
        fruit.substring(2,5); // returns nan
        fruit.substring(6,6); // returns ""
        // Character at the end index is not included
    }

    public static void indexOfMethod() {
        // indexOf method searches for a character in a string
        // Will find the index of 'a' in the string (first appearance)
        String fruit = "banana";
        int index = fruit.indexOf('a');

        // Can specify second argument to specify where in the
        // string to start looking
        int index1 = fruit.indexOf('a',2);
        // If the target is not in the string, it returns 1

        // Can also be used to search for a substring
        fruit.indexOf("nan"); // returns 2
    }

    public static void stringComparison() {
        // Don't use == and != operators to compare strings
        // Those operators check whether the variables refer to the
        // same object, by comparing references
        // Given two strings that contain the same letters, it yields false

        // Use equals method (case-sensitive)
        String name1 = "Croc";
        String name2 = "Croc";
        String name3 = "Sloth";

        System.out.println(name1.equals(name2));

        // Can use compareTo which returns the difference between the first characters
        // in the string that differ
        // 0 if no difference, if first string comes before it is negative, if after then it is positive
        // Using compareTo from Alan on Ada will return 8
    }

    public static String stringFormat() {
        // Can create strings that are formatted a certain way
        // without having to display like (like printf would
        // Use String.format instead of System.out.printf
        // Same as printf but does not display anything
        return String.format("%s is my name", "Nicholas");
    }

    public static void wrapperClass() {
        /** Wrapper Class
            - Primitive values do not provide methods
            - Wrapper class for each primitive value exists
            - char -> Character, int -> Integer, Boolean, Long, Double
            - Each Wrapper class has constants of the min and max value, useful for setting as a base value
            - Acquired through Integer.MIN_VALUE and Integer.MAX_VALUE
         */

         // Provides methods to convert strings to other types
         String str = "12345";
         int num = Integer.parseInt(str);
         System.out.println(num);

         // Also has parseDouble and parseBoolean

         // Has toString, giving a string representation of a value
    }

    public static void commandLine() {
        /**
            - 
         */
    }

}