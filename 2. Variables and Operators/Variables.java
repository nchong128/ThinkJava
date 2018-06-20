public class Variables {
    public static void main(String[] args) {
        // Have to declare variables first before storing
        // e.g. char, int, String
        String firstName;
        String lastName;
        int hour, minute;

        // Values need to be the same type as the one assigned
        // Note: Can also declare and initialise on the same line
        firstName = "Nicholas";
        lastName = "Chong";
        hour = 3;
        minute = 60;

        // To output multiple lines on the same line, can use print statements
        // followed by println at the end. Recommended to have println at the end
        System.out.print("My name is ");
        System.out.print(firstName);
        System.out.print(" ");
        System.out.print(lastName);
        System.out.print(" and the time be ");
        System.out.print(hour);
        System.out.println(minute);
    }
}
