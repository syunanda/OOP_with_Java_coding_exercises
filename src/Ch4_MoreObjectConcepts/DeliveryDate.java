package Ch4_MoreObjectConcepts;

import java.time.LocalDate;
import java.util.Scanner;

public class DeliveryDate {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LocalDate orderDate;
        int mo;
        int day;
        int year;
        final int WEEKS_FOR_DELIVERY = 2;

        System.out.println("Enter order month ");
        mo = keyboard.nextInt();
        System.out.println("Enter order day ");
        day = keyboard.nextInt();
        System.out.println("Enter order year ");
        year = keyboard.nextInt();

        orderDate = LocalDate.of(year, mo, day);

        System.out.println("Order date is " + orderDate);
        System.out.println("Delivery date is " + orderDate.plusWeeks(WEEKS_FOR_DELIVERY));
    }
}
