/** Relational Operators
    x == y
    x != y
    x > y
    x < y
    x >= y 
    x >= y
    
    - Always returns a Boolean, as either true or false
    - Two sides of the operator have to be compatible
        - Int and String cannot be compared
        - Int and float may be compared
    - Don't use != and == for string comparison, just use .equals()
 */
public class Relationals {
    
    public static void main(String[] args) {
        System.out.println(5.99999999999999999 == 6);

        System.out.println("xD".equals("xd"));

        System.out.println("xD".equals("xD"));

        boolean answer;

        answer = (6.0 > 5);

        System.out.println(answer);

    }
}