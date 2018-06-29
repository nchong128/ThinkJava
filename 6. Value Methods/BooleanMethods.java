// Methods can return boolean values, very convenient
// for hiding tests inside methods

/** JavaDoc Tags
 * Can use the following tags to document
 * @param x the integer to test
 * @return true if x has one digit, false otherwise
 *
 */
public class BooleanMethods {

    public static void main(String[] args) {
        boolean answer;
        answer = isSingleDigit(0);

        System.out.println(answer);
    }

    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        }
        else {
            return false;
        }
    }

}

