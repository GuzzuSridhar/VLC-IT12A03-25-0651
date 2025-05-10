package dates;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        // create an object to hold the current date
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // create an object to hold the custom date
        LocalDate bday = LocalDate.of(2024, 1, 25);
        System.out.println(bday);

        // methods to access the components of a given date
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());

    }
}
