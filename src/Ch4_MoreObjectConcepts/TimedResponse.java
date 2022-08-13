package Ch4_MoreObjectConcepts;

import javax.swing.*;
import java.time.LocalDateTime;

public class TimedResponse {
    public static void main(String[] args) {
        final int MIN_TO_SEC = 60;
        LocalDateTime time1, time2;
        int min1, min2, seconds1, seconds2, difference;

        time1 = LocalDateTime.now();
        min1 = time1.getMinute();
        seconds1 = time1.getSecond();

        JOptionPane.showConfirmDialog(
                null,
                "Is it ice-cream time now?"
        );

        time2 = LocalDateTime.now();
        min2 = time2.getMinute();
        seconds2 = time2.getSecond();

        difference = (MIN_TO_SEC*(min2-min1)) + (seconds2-seconds1);

        JOptionPane.showMessageDialog(
                null,
                "End seconds: " + seconds2 + '\n' +
                        "Start seconds: " + seconds1 + '\n' +
                        "It took " + difference + " seconds for you to answer."
        );
    }
}
