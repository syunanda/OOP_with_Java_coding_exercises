package Chapter4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate internationalCatDay = LocalDate.now();
        LocalDate nalaBirthday = LocalDate.of(2016, 1, 14);

        System.out.println("International Cat Day is " + internationalCatDay);
        System.out.println("Nala's Birthday is " + nalaBirthday);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current time is " + now);
    }
}
