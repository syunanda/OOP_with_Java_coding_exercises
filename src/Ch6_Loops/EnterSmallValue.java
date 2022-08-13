package Ch6_Loops;

import java.util.Scanner;

public class EnterSmallValue {
    public static void main(String[] args) {
        int userEntry;
        final int LIMIT = 3;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer no higher than " +
                LIMIT + " >> ");
        userEntry = keyboard.nextInt();

        while (userEntry > LIMIT) {
            System.out.println("Please enter an integer no higher than " +
                    LIMIT + " >> ");
            userEntry = keyboard.nextInt();
        }
        System.out.println("You correctly entered " + userEntry);
    }
}
