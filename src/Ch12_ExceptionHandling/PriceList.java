package Ch12_ExceptionHandling;

public class PriceList {
    private static final double[] prices = {15.99, 27.88, 34.56, 45.89};
    public static void displayPrice(int item) throws IndexOutOfBoundsException {
        try {
            System.out.println("The price is $" + prices[item]);
        }
        catch(IndexOutOfBoundsException mistake){
            System.out.println("Item index entered does not exist.");
        }
    }
}
