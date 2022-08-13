package Ch9_AdvancedArrays;

import java.util.Scanner;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {

        int[][] count = new int [3][3];
        int row, column;
        final int QUIT = 999;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a row or " + QUIT + " to quit >> ");
        row = input.nextInt();

        while(row!=QUIT) {
            System.out.println("Enter a column >> ");
            column = input.nextInt();
            if(row < count.length && column < count.length) {
                count[row][column]++;
                for (int[] r: count) {
                    for (int c = 0; c < r.length; c++){
                        System.out.print(r[c] + " ");
                    }
                    System.out.println();
                }
            }
            else {
                System.out.println("Invalid position selected.");
            }
            System.out.println("Enter a row or " + QUIT + " to quit >> ");
            row = input.nextInt();
        }
    }
}
