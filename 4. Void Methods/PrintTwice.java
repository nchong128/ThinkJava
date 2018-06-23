/**
    When you use a method, you give the arguments
    When you write a method, you name the parameters
    Variables only exist in the methods they are defined, 
    known as local variables.
 */
public class PrintTwice {
    // Value you provide as an argument msut have the
    // same type as the parameter
    // Java can sometimes convert an argument from one type
    // to another automatically like int to float, but not 
    // int to String
    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }

    public static void main(String[] args) {
        printTwice("hi");
    }
}