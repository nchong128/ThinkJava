public class PrintTime {
    
    // Can have methods with multiple parameters
    // Declare type for all variables individually, unlike in variable declarations

    public static void printTime(int hour, int minute) {
        System.out.printf("%d:%d \n", hour, minute);
    }

    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        printTime(hour,minute);
    }
}