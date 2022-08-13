package Ch3_MethodsClassesObjects;

import javax.swing.*;

public class DemoGrossPay {

    public static void main(String[] args) {

        String yourHoursWorkedString;
        double yourHoursWorked ;
        double gross;
        yourHoursWorkedString = JOptionPane.showInputDialog(
                null,
                "Enter your hours here: "
        );
        yourHoursWorked = Double.parseDouble(yourHoursWorkedString);
        gross = calculateGross(yourHoursWorked);
        JOptionPane.showMessageDialog(
                null,
                "Your gross pay is $" + gross
        );
    }

    public static double calculateGross(double hours) {
        final double STD_RATE = 13.75;
        double gross;
        gross = hours * STD_RATE;
        System.out.println(hours + " hours at $" +
                STD_RATE + " per hour is $" + gross);
        return gross;
    }
}
