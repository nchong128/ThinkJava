import java.util.Arrays;
import java.util.Random;
/** Random Numbers
    - Deterministic: When computer programs do the same thing every time it runs
    - Making a program non-deterministic is hard so it is hard to generate
        truly random numbers
    - There are algorithms to genrate pseudorandom numbers
    - If you generate a long series of random numbers, every value should appear
        the same number of times
    - Can test by generating a large number of values, store them in an array
        and count the number of teams each value occurs

 */
public class RandomNum {

    public static void main(String[] args) {
        int[] results = randomArray(100);
        //System.out.println(Arrays.toString(result));

        double[] example = {2.4, 5, 1.1, 5.6, 3.2};
        //System.out.println(inRange(example, 3.3, 6.0));

        // Can now count the number of scores for eachgrade
        // and store them in an array
        int[] counts = new int[100];

        for (int i = 0; i < counts.length; i++) {
            counts[i] = inRange(results, i, i+ 1);
        }
        System.out.println(Arrays.toString(counts));

        // More efficient version
        int[] counts2 = new int[100];

        for (int i = 0; i < results.length; i++) {
            int index = scores[i];
            counts[index]++;
        }
        
      
    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    // Another reduce operation that counts the number of elements
    // within a certain range
    public static int inRange(int[] a, int low, int high) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        
        return count;
    }


}