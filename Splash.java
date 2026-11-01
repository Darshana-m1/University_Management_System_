
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {

    Thread t;

    Splash() {

        // Load image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/first.png"));

        // Resize image
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);

        ImageIcon i3 = new ImageIcon(i2);

        // Create label
        JLabel img = new JLabel(i3);

        add(img);

        // Start thread
        t = new Thread(this);
        t.start();

        int x = 1;

        // Animation effect
        for (int i = 2; i <= 600; i += 4, x += 1) {

            setLocation(600 - ((i + x) / 2), 350 - (i / 2));

            setSize(i + 3 * x, i + x / 2);

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        setVisible(true);
    }

    // Thread run method
    public void run() {

        try {
            Thread.sleep(7000);
            setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}