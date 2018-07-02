
public class Exercise84 {

    public static void main(String[] args) {
        int[] x = {1,2,51,11,12,101,60};

        System.out.println(indexOfMax(x));
    }

    public static int indexOfMax(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[index] < array[i]) {
                index = i;
            }
        }

        return index;
    }
    
}