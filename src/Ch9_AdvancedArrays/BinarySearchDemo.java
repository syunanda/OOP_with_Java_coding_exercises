package Ch9_AdvancedArrays;

import java.util.Scanner;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {4, 50 , 23, 61, 8, 10, 30, 1};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer to search >> ");
        int search = input.nextInt();

        int[] sortedArr = insertionSort(arr);
        int sortedIndex = binarySearch(sortedArr, search);
        if (sortedIndex == 0 && search != sortedArr[0]) {
            System.out.println(search + " is not in the array.");
        }
        else {
            System.out.println(search + " is in the array");
        }
    }
    public static int[] insertionSort(int[] someArr){
        int a = 1;
        while(a < someArr.length) {
            int temp = someArr[a];
            int b = a - 1;
            while(b >= 0 && someArr[b] > temp) {
                someArr[b + 1] = someArr[b];
                --b;
            }
            someArr[b + 1] = temp;
            ++a;
        }
        return someArr;
    }

    public static int binarySearch(int[] sorted, int search){
        int arrLength = sorted.length;
        int first = 0;
        int last = arrLength - 1;
        int mid = (first + last)/2;
        int matchIndex = 0;

        while (first < last) {

            if (search < sorted[mid]) {
                last = mid - 1;
            } else if (search > sorted[mid]) {
                first = mid + 1;
            } else if (search == sorted[mid]) {
                matchIndex = mid;
                break;
            }
            mid = (first + last) / 2;
        }
        return matchIndex;
    }

}
