public class TimeClient {

    public static void main(String[] args) {
        Time time = new Time(11, 59, 59.5);
        
        
        Time startTime = new Time(18,50,0.0);
        Time runningTime = new Time(2,16,0.0);
        Time endTime = Time.add(startTime, runningTime);

        System.out.println(endTime);

        Time endTime2 = startTime.add(runningTime);
        System.out.println(endTime2);
    }
    

}