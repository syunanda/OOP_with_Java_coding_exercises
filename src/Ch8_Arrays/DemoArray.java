package Ch8_Arrays;

public class DemoArray {
    public static void main(String[] args) {

        double[] salaries = {12.22, 13.33, 14.44, 15.55};

        double inflationAdjustment = 0.10;

        System.out.println("Salaries one by one are:");
        for (double salary : salaries) {
            salary += salary * inflationAdjustment;
            System.out.println(salary);
        }
    }

}
