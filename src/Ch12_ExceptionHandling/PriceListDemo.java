package Ch12_ExceptionHandling;

import java.util.Scanner;

public class PriceListDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item index here to check the price>> ");
        int priceIndex = input.nextInt();
        PriceList.displayPrice(priceIndex);
    }
}
