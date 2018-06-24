import java.util.Scanner;

public class Exercise43 {
    
    public static void americanFormat(String day, int date, String month, int year) {
        System.out.println("American format: ");
        System.out.print(day + ", ");
        System.out.print(month);
        System.out.print(" " + date + ", ");
        System.out.println(year);
    }
    
    public static void europeanFormat(String day, int date, String month, int year) {
        System.out.println("European format: ");
        System.out.print(day + " ");
        System.out.print(date + " ");
        System.out.print(month + " ");
        System.out.println(year);
    }


    public static void main(String[] args) {
        String day, month;
        int date, year;
        Scanner in = new Scanner(System.in);

        System.out.println("Day?");
        day = in.nextLine();

        System.out.println("Date?");
        date = in.nextInt();
        in.nextLine();

        System.out.println("Month?");
        month = in.nextLine();

        System.out.println("Year?");
        year = in.nextInt();        

        americanFormat(day, date, month, year);
        europeanFormat(day, date, month, year);
                        
    }

}