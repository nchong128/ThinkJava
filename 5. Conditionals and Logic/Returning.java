// return statement can terminae a method before reaching the end
// Can be used if error condiion is triggered
// System.err is a special way to output error messages

public class Returning {
    
    public static void main(String[] args) {
        int x = -10;
        log(x);
    }

    public static void log(int num) {
        if (num <= 0.0) {
            System.err.println("Error: The number has to be positive");
            return;
        }

        double result = Math.log(num);
        System.out.println("The log of the number is " + result);

    }  

}