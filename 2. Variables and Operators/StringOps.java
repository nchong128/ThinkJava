public class StringOps{
    public static void main(String[] args) {
        // Can use + operator to concatenate
        System.out.println("Hello " + "World!");

        // Addition is for both numbers and strings
        // Can lead to complications
        System.out.println("My age is " + 1 + 8); // Does concatenation
        System.out.println(1 + 8 + " be my age."); // Does addition

        // Order of operations: Follows mathematical conventions
        // Multiplication and division before addition and subtraction
        // If same precedence, goes from left to right

        // 3 types of errors
        // Compile-time errors: Occurs when you violate the syntax rules of the language
        // so the program cannot be compiled. Can tll you where the error is
        // Run-time error does not appear until after the program starts running
        // Occurs when interpreter is executing byte code and something goes wrong
        // Logic error: Will compile and run without generating errors
        // but it will not do the right thing.
    }
}