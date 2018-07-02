import java.util.Arrays;

/** Enhance for loop
    - Traversing arrays is so common, alternative syntax exists

 */
public class EnhancedForLoop {
    
    public static void main(String[] args) {
        int[] values = {1,5,2,1};

        // This for loop displays the lements of an array on separate lines
        for (int i = 0; i < values.length; i++) {
            //System.out.println(values[i]);
        }

        // Enhance for loop, can be read as "for each value in values"
        // Makes the code more readable but nt helpful when the index is needed
        for (int value : values) {
            System.out.println(value);
        }

    }

}