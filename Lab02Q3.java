public class Lab02Q3 {
    public static void main(String [] args) {
        long totalMilliseconds, totalSeconds, currentSeconds, totalMinutes, currentMinutes, totalHours, currentHours;
        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = (totalMilliseconds / 1000);
        currentSeconds = (totalSeconds % 60);
        totalMinutes = (totalSeconds / 60);
        currentMinutes = (totalMinutes % 60);
        totalHours = (totalMinutes / 60);
        currentHours = (totalHours % 24);
        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT ");



    }
}
