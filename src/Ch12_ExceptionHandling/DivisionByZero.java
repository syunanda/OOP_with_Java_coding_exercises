package Ch12_ExceptionHandling;

import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {

        int numerator, denominator, result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter numerator >> ");
        numerator = input.nextInt();
        System.out.print("Enter denominator >> ");
        denominator = input.nextInt();

        try {
            result = numerator / denominator;
            System.out.println(numerator + " / " + denominator +
                    " = " + result);
        }
        catch(ArithmeticException mistake) {
            System.out.println("Arithmetic exception was thrown and caught");
        }
        System.out.println("End of program");
    }

}
