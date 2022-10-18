import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TellerGUI extends Account implements ActionListener {

    private JFrame fr;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;

    private JLabel l1;
    private JLabel l2;
    private JLabel l3;

    private JTextArea ta;

    private JButton bn1;
    private JButton bn2;
    private JButton bn3;

    public TellerGUI() {
        super(6000, "");

        fr = new JFrame("TellerGUI");

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        ta = new JTextArea();

        l1 = new JLabel("Balance");
        l2 = new JLabel();
        l3 = new JLabel("Amount");

        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");

        p1.setLayout(new GridLayout(3, 1));
        p2.setLayout(new GridLayout(2, 2));
        p2.add(l1);

        l2.setText(String.valueOf(this.getBalance()));
        p2.add(l2);

        p2.add(l3);
        p2.add(ta);
        p2.setSize(500, 200);

        p3.setLayout(new FlowLayout());

        p3.add(bn1);
        p3.add(bn2);
        p3.add(bn3);

        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);

        p1.add(p2);
        p1.add(p3);
        fr.add(p1);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(bn1)) {
            setBalance(this.getBalance() + (Integer.valueOf(ta.getText())));
            l2.setText(String.valueOf(this.getBalance()));
        }
        else if (ae.getSource().equals(bn2)) {
            if (this.getBalance() - (Integer.valueOf(ta.getText())) >= 0) {
                setBalance(this.getBalance() - (Integer.valueOf(ta.getText())));
            }
            l2.setText(String.valueOf(this.getBalance()));
        }
        else if (ae.getSource().equals(bn3)) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TellerGUI();
    }
}