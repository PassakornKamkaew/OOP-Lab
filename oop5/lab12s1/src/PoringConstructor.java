import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PoringConstructor implements ActionListener{
    int numberOfPoring = 0;
    private JButton addButton;
    private JFrame window;
    private Poring poring;
    public PoringConstructor(){
        addButton = new JButton("Add");
        window = new JFrame();
        
        addButton.addActionListener(this);
        
        window.setLayout(new FlowLayout());
        window.add(addButton);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(170, 75);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(addButton)){
            numberOfPoring++;
            Poring poring = new Poring(numberOfPoring);
            Thread thread = new Thread(poring);
            thread.start();
        }
    }
}