package Ch10_Inheritance;

import java.util.Scanner;

public class UseParty {
    public static void main(String[] args) {
        DinnerParty aParty = new DinnerParty();
        int guest;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of guests >> ");
        guest = input.nextInt();
        aParty.setGuest(guest);
        System.out.println("Party has " + aParty.getGuest() + " guests.");
        aParty.displayInvitation();

        System.out.println(
                "Please enter menu option" +
                        " 1 for chicken, 2 for beef, 3 for vegan");
        int dinnerChoice = input.nextInt();
        aParty.setDinnerChoice(dinnerChoice);
        System.out.println("You have selected option " + aParty.getDinnerChoice());


    }
}
