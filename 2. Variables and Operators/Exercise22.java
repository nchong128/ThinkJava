public class Exercise22 {
    public static void main(String[] args) {
        double hour = 13.0;
        double minute = 53.0;
        double second = 45.4;

        System.out.println("Seconds since midnight: ");
        double secondsElapsed = hour * 60 * 60 + minute * 60 + second;
        System.out.println(secondsElapsed);

        System.out.println("Remaining seconds: ");
        double fromHours = (23 - hour) * 60 * 60;
        double fromMinutes = (59 - minute) * 60;
        double fromSeconds = (59 - second);
        double secondsRemaining = fromHours + fromMinutes + fromSeconds;
        System.out.println(secondsRemaining);

        System.out.println("Percentage of day elapsed: ");
        double totalSeconds = (secondsElapsed + secondsRemaining);
        double percentElapsed = 100 * (secondsElapsed / totalSeconds);
        System.out.println(percentElapsed);


    }
}