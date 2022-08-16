package Ch11_AdvancedInheritance;

import javax.swing.*;

public class VehicleTest {
    public static void main(String[] args) {
        Sailboat aBoat = new Sailboat();
        JOptionPane.showMessageDialog(null,
                "\nVehicle descriptions:\n" +
                        aBoat.toString());
    }
}
