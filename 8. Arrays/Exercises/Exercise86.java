public class Exercise86 {

    public static void main(String[] args) {
        int[] array = {1,2,4,1};

        System.out.println(maxInRange(array, 0, array.length-1));
    }

    public static boolean areFactors(int n, int[] array) {
        boolean flag = true;

        for (int value : array) {
            if (value % n != 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static int maxInRange(int[] array, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return array[lowIndex];
        }
        
        else {
            int middle = (highIndex + lowIndex )/ 2;
            if (maxInRange(array, lowIndex, middle) > maxInRange(array, middle+1, highIndex)) {
                return maxInRange(array, lowIndex, middle);
            }
            else {
                return maxInRange(array, middle, highIndex);
            }
        }
    }
}