import java.util.Arrays;

public class Exercise81 {

    public static void main(String[] args) {
        double[] x = {1.2, 2.4, 1.0};
        powArray(x,10);
        System.out.println(Arrays.toString(x));
    }

    public static void powArray(double[] array, int power) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.pow(array[i], power);
        }
    }
}