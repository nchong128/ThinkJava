public class Encapsulate {
    
    public static void main(String[] args) {
        printTable(10);
    }

    // This is the encapsulated version in a neat method
    public static void printRow() {
        int i = 1;
        while (i <= 6) {
            // %4d pads the integer with 4 spaces each
            System.out.printf("%4d", 2*i);
            i = i + 1;
        }
        // Prints a newline and completes the line generated above
        System.out.println();
    }

    // This is the generalised version of the method above
    // Remember that Java supports multiple methods with the same name
    public static void printRow(int n, int cols) {
        int i = 1;
        while (i <= cols) {
            // %4d pads the integer with 4 spaces each
            System.out.printf("%4d", n*i);
            i = i + 1;
        }
        // Prints a newline and completes the line generated above
        System.out.println();
    }

    // Can now create a generalised method to print the times tables
    public static void printTable(int rows) {
        int i = 1;
        while (i <= rows) {
            printRow(i, rows);
            i = i + 1;
        }
    }
}