package Ch2_UsingData;

import javax.swing.*;

public class DialogBox {
    public static void main (String[] args) {

        String result;
        result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, "+result + "!");

    }
}
