package Ch9_AdvancedArrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myScores = new int [5];
        display("Original array: ", myScores);
        Arrays.fill(myScores, 8);
        display("After filling with 8s; ", myScores);
        myScores[2] = 6;
        myScores[4] = 3;
        display("After changing two values: ", myScores);
        Arrays.parallelSort(myScores);
        display("After sorting: ", myScores);
    }
    public static void display(String message, int[] array) {
        System.out.print(message);
        for(int val: array)
            System.out.print(val + " ");
        System.out.println();
    }

}
