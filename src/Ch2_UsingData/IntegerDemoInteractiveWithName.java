package Ch2_UsingData;

import java.util.Scanner;

public class IntegerDemoInteractiveWithName {
    public static void main (String[] args) {
        // int anInt = 2147483647;
        // byte aByte = 127;
        // short aShort = 32767;
        // long aLong = 9223372036854775807L;
        int anInt;
        byte aByte;
        short aShort;
        long aLong;

        float aFloat = 1.123456F;
        double aDouble = 1.1234567;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte integer >> ");
        aByte = input.nextByte();
        System.out.print("Please enter a short integer >> ");
        aShort = input.nextShort();
        System.out.print("Please enter a long integer >> ");
        aLong = input.nextLong();

        int anotherInt = aShort * aByte;

        System.out.println("The int is "+ anInt);
        System.out.println("The byte is "+ aByte);
        System.out.println("The short is "+ aShort);
        System.out.println("The long is "+ aLong);
        System.out.println("Another int is "+ anotherInt);
        System.out.println("The float is "+ aFloat);
        System.out.println("The double is "+ aDouble);

        String name;
        System.out.print("Please enter your name >> ");
        name = input.nextLine();
        input.nextLine();
        System.out.println("Thank you, "+ name);
    }
}
