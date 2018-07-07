import java.util.Arrays;

public class Exercise96 {

    public static void main(String[] args) {
        areAnagrams("stop", "pots");
    }

    public static boolean isDoubloon(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count ++;
                }
            }

            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean areAnagrams(String a, String b) {
        
    }
}