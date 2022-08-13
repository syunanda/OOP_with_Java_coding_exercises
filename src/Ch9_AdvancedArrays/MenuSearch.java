package Ch9_AdvancedArrays;

import javax.swing.*;
import java.util.Arrays;

public class MenuSearch {
    public static void main(String[] args) {

        String[] menuChoices = new String[10];
        Arrays.fill(menuChoices, "zzzzzzz");
        String entry = "", menuString = "";
        int x = 0;
        int numEntered;
        int highestSub = menuChoices.length - 1;

        menuChoices[x] = JOptionPane.showInputDialog(
                null,
                "Enter an item for today's menu, or zzz to quit"
        );

        while(!menuChoices[x].equals("zzz") && x < highestSub) {
            menuString = menuString + menuChoices[x] + "\n";
            ++x;
            if(x < highestSub)
                menuChoices[x] = JOptionPane.showInputDialog(
                        null,
                        "Enter an item for today's menu, or zzz to quit"
                );
        }
        numEntered = x;

        entry  = JOptionPane.showInputDialog(
                null,
                "Today's menu is:\n" + menuString +
                        "Please make a selection:"
        );

        Arrays.sort(menuChoices, 0, numEntered);

        x = Arrays.binarySearch(menuChoices, entry);
        if(x >= 0 && x < numEntered)
            JOptionPane.showMessageDialog(null, "Excellent choice");
        else
            JOptionPane.showMessageDialog(null,
                    "Sorry - that item is not on tonight's menu");

    }
}
