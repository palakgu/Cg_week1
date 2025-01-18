import java.time.*;
public class timezone {
    public static void main(String[] args) {
        // Get the current date and time
        ZonedDateTime currentTime = ZonedDateTime.now();

        // Display the current time in GMT
        ZonedDateTime gmtTime = currentTime.withZoneSameInstant(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + gmtTime);

        // Display the current time in IST
        ZonedDateTime istTime = currentTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + istTime);

        // Display the current time in PST
        ZonedDateTime pstTime = currentTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + pstTime);
    }
}