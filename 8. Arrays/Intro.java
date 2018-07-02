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
        traversal();
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

    /** Copying Arrays
        - Array variables contain refrences to arrays
        - Making an assignment to an array variable only copies the refrence
        - Doesn't copy the array itself
     */
    public static void copying() {
        // Simply has two different variables with reference to the same array
        double[] a = new double[3];
        double[] b = a;

        // a and b are different names for the same thing, called aliases
        a[0] = 17.0;
        System.out.println(a[0]);
        
        // To fully copy the array, not the reference
        // Need to create new array and copy elements from old to new
        double[] c = new double[3];
        for (int i = 0; i < 3; i++ ) {
            c[i] = a[i];
        }

        // Can also use the copyOf method to copy an array
        // Second paramter is the number of elements to copy
        double[] d = Arrays.copyOf(a, 3);


    }

    public static void length() {
        // Can use __.length to find the length of any array
        int[] a = {1,2,3,4};

        System.out.println(a.length);

        // a.length-1 is the index of the last element
        // Can fuly copy an array using Arrays.copyOf()
        int[] b = Arrays.copyOf(a, a.length);
    }

    public static void traversal() {
        int[] a = {1,2,5,3};
        // Looping through elements of an array is called traversal
        for (int i = 0; i < a.length; i++) {
            a[i] += 10;
        }

        System.out.println(Arrays.toString(a));

        // Another common pattern is a search, looking for an element
        System.out.println(search(a, 15));

        // Another common traversal is a reduce operation
        // Reducing an array of values to a single value
        // e.g. Sum/product/min/max
        System.out.println(sum(a));

    }
    
    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int sum(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        return result;
    }

}