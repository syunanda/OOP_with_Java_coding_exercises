package Chapter8;

import java.util.Scanner;

public class TestBowlingTeam {
    public static void main(String[] args) {
        String name;
        BowlingTeam bowlTeam = new BowlingTeam();
        final int NUM_TEAM_MEMBERS = 4;
        final int NUM_TEAMS = 4;
        BowlingTeam[]teams = new BowlingTeam[NUM_TEAMS];

        int x;
        int y;

        for (y=0; y<NUM_TEAMS; y++) {

            teams[y] = new BowlingTeam();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter team name here: ");
            name = input.nextLine();
            teams[y].setTeamName(name);

            for (x = 0; x < NUM_TEAM_MEMBERS; x++) {
                System.out.println("Enter team member's name >> ");
                name = input.nextLine();
                teams[y].setMember(x, name);
            }

        }

        for (y=0; y<NUM_TEAMS; y++) {
            System.out.println("\nMembers of team " + teams[y].getTeamName());

            for (x = 0; x < NUM_TEAM_MEMBERS; x++) {
                System.out.print(teams[y].getMember(x) + " ");
            }
        }
    }
}
