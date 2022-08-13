package Ch8_Arrays;

public class PassInt {
    // Pass int passes values (This is true for all primitive types)
    public static void main(String[] args) {

        final int NUM_ELEMENTS = 4;
        int someNums = 10;

        System.out.println("At the start of main: " + someNums);

        methodGetsArray(someNums);

        System.out.println("At the start of main: " + someNums);
    }

    public static void methodGetsArray(int integer) {

        System.out.println("At the start of method " + integer);

        integer = 888;

        System.out.println("At the end of method " + integer);
    }
}
