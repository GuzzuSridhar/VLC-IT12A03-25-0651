package dates;

import java.time.LocalDateTime;

public class LoacalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // access the parameters of the time
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        // methods to access the components of a given date
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getMonth());
        System.out.println(now.getYear());
    }
}
