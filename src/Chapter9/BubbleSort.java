package Chapter9;

public class BubbleSort {
    public static void main(String[] args) {

        int[] someNums = {88,33, 99,22, 54};
        System.out.println("Initial array is: ");
        for (int val : someNums) {
            System.out.print(val + " ");
        }

        int comparisonsToMake = someNums.length - 1;
        int a, b, temp;

        for(a = 0; a < someNums.length - 1; ++a) {

            for(b = 0; b < comparisonsToMake; ++b) {

                if(someNums[b] > someNums[b + 1]) {
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
            }
            --comparisonsToMake;
        }

        System.out.println("\nSorted array is: ");
        for (int val : someNums) {
            System.out.print(val + " ");
        }
    }
}
