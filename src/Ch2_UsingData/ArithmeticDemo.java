package Ch2_UsingData;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer >> ");
        firstNumber = input.nextInt();
        System.out.println("Please enter another integer >> ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = (double) sum/2.0;

        System.out.println(firstNumber + " + " + secondNumber +
                " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber +
                " is " + difference);
        System.out.println("The average of " +
                firstNumber + " and " + secondNumber +
                " is " + average);

        if (firstNumber>secondNumber) {
            System.out.println(firstNumber + " is " +
                    "bigger than " + secondNumber);
        }
        else {
            System.out.println(firstNumber + " is not " +
                    "bigger than " + secondNumber);
        }

        double firstDouble;
        double secondDouble;
        double doubleSum;
        double doubleDifference;
        double doubleAverage;

        System.out.println("Please enter a double >> ");
        firstDouble = input.nextDouble();
        System.out.println("Please enter another double >> ");
        secondDouble = input.nextDouble();

        doubleSum = firstDouble + secondDouble;
        doubleDifference = firstDouble - secondDouble;
        doubleAverage = doubleSum / 2 ;

        System.out.println(firstDouble + " + " + secondDouble +
                " is " + doubleSum);
        System.out.println(firstDouble + " - " + secondDouble +
                " is " + doubleDifference);
        System.out.println("The average of " +
                firstDouble + " and " + secondDouble +
                " is " + doubleAverage);
    }
}
