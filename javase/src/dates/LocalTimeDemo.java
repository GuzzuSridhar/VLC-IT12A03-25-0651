package dates;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {
    public static void main(String[] args) {
        // capture current time
        LocalTime now = LocalTime.now();
        System.out.println(now);

        // Custome time
        LocalTime punchIn = LocalTime.of(10, 25, 16);
        System.out.println(punchIn);

        // access the parameters of the time
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        // showing the time in a different zone
        LocalTime sgTime = LocalTime.now(ZoneId.of("Asia/Singapore"));
        System.out.println("time in SG: " + sgTime);
        LocalTime indTime = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("time in India: " + indTime);

    }
}
