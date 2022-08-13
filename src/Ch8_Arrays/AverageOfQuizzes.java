package Ch8_Arrays;

import java.util.Scanner;

public class AverageOfQuizzes {
    public static void main(String[] args) {
        int[] scores = new int[10];
        int score = 0;
        int count = 0;
        int total = 0;
        final int QUIT = 999;
        final int MAX = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter quiz score or " +
                QUIT + " to quit >> ");
        score = input.nextInt();

        while (score != QUIT) {
            scores[count] = score;
            total += score;
            count++;
            if (count <= MAX) {
                System.out.println("Enter quiz score or " +
                        QUIT + " to quite >> ");
                score = input.nextInt();
            }
            else {
                score = QUIT;
            }
        }

        System.out.println("The scores entered were: ");

        for (int x=0; x < count; x++) {
            System.out.println(scores[x]);
        }
        if (count != 0) {
            System.out.println("The average is " + (total*1.0/count));
        }
        else {
            System.out.println("There are no scores entered.");
        }

    }
}
