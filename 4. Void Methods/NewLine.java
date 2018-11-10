// Can add more methods to a class

// Class is called NewLine (upper camel case)
// Methods are newLine and main (lower camel case)
// Both are public methods, so they can be invoked from other classes
// Both void -> Do not return a result 
// main has a single parameter called args, with type String[]
// Means that whoever invokes main must provide an array of strings
// newLine has no parameters, needs no arguments
// Also in the same class as main so don't have to specify the class name

public class NewLine {
    
    public static void threeLines() {
        newLine();
        newLine();
        newLine();
    }
    public static void newLine() {
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("First line.");
        threeLines();
        System.out.println("Second line.");
    }
}

/**
    --Flow of execution--
    Execution always begins at the first statement of main
    Statements executed one at a time in order
    Goes through detours like other languages    
 */
