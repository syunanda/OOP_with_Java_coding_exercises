package Chapter6;

import java.util.Scanner;

public class AssignVolunteer5 {


    public AssignVolunteer5() {

        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONIC_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER;
        final String FURNITURE_PRICER;
        final String ELECTRONIC_PRICER;
        final String OTHER_PRICER;

        CLOTHING_PRICER = "Regina";
        FURNITURE_PRICER = "Walter";
        ELECTRONIC_PRICER = "Lydia";
        OTHER_PRICER = "Marco";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " +
                FURNITURE_CODE + " for furniture, " +
                ELECTRONIC_CODE + " for electronics, " +
                OTHER_CODE + " for anything else... >> ");
        donationType = keyboard.nextInt();
        while (donationType < CLOTHING_CODE || donationType > OTHER_CODE) {
            System.out.print("Enter " + CLOTHING_CODE + " for clothing, " +
                    FURNITURE_CODE + " for furniture, " +
                    ELECTRONIC_CODE + " for electronics, " +
                    OTHER_CODE + " for anything else... >> ");
            donationType = keyboard.nextInt();
        }

        switch(donationType)
        {
            case(CLOTHING_CODE):
            {
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            }
            case(FURNITURE_CODE):
            {
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            }
            case(ELECTRONIC_CODE):
            {
                volunteer = ELECTRONIC_PRICER;
                message = "an electronics donation";
                break;
            }
            case(OTHER_CODE):
            {
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;
            }
            default:
            {
                volunteer = "invalid";
                message = "an invalid donation type";
            }

        }
        if (volunteer.equals("invalid")) {
            System.out.println("You entered " + donationType);
            System.out.println("This is " + message);
        }
        else {
            System.out.println("You entered " + donationType);
            System.out.println("This is " + message);
            System.out.println("The Volunteer who will price this item is " + volunteer);
        }

    }
}


