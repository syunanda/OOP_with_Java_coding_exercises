package Chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class AssignVolunteer {
    int donationType;
    String volunteer;
    String message;
    final int CLOTHING_CODE;
    final int OTHER_CODE;
    final String CLOTHING_PRICER;
    final String OTHER_PRICER;

    public AssignVolunteer() {

        CLOTHING_CODE = 1;
        OTHER_CODE = 2;
        CLOTHING_PRICER = "Regina";
        OTHER_PRICER = "Marco";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " +
                OTHER_CODE + " for anything else... >> ");
        donationType = keyboard.nextInt();

        if (donationType == CLOTHING_CODE) {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
            display();
        }
        if (donationType == OTHER_CODE) {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
            display();
        }
        else {
            System.out.println("You entered " + donationType +
                    ", which is not a valid donation code.");
        }

    }

    private void display() {
        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The Volunteer who will price this item is " + volunteer);
    }
}
