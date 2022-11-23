import java.awt.*;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyClock clock = new MyClock();
        
        Thread t = new Thread(clock);     
        t.start();
   
        fr.add(clock);
        fr.setSize(300, 150);
        fr.setVisible(true);
    }
}
