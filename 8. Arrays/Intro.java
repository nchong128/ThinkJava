/** Arrays
    - Arrays allow for storing multiple values of
        of the same type using a single variable
    - Array is a sequence of values, each value is an element
    - Elements can be ints, doubles, any other type but all
        the values need to be of the same ype
 */

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {
        displaying();
    }
    
    public static void introduction() {
        // Need to declare the array's type and then create the
        // array itself
        int[] counts;
        double[] values;
        
        // To create the array itself, needs the new operator
        // In the square bracket is the size of the array
        counts = new int[4];
        values = new double[10];

        // Can do above in a single line
        int[] counts1 = new int[4];
        double[] values1 = new double[10];

        // When creating an array of ints, elements are initialised to 0
        // [] allows for selecting elements from an array
        System.out.println("The zeroth element is " + counts[1]);

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;
        
        // Can use loops with arrays to display elements
        for (int i = 0; i < 4; i++) {
            System.out.println(counts[i]);
        }

        // Can use .length to display lengths of arrays
        System.out.println(counts.length);
    }

    public static void displaying() {
        // Another way of creating an array
        int[] a = {1,2,3,4};

        // Doing this will just give the address of the array
        System.out.println(a);

        // Can do it manually
        printArray(a);
        
        // Can also import java.util.Arrays that gives methods for
        // working with arrays.
        // Using method toString returns a string representation
        // of an array
        System.out.println(Arrays.toString(a)); // Displays [1,2,3,4]

    }

    public static void printArray(int[] array) {
        System.out.print("{" + array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("}");
    }




}