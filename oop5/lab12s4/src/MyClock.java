import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClock extends JLabel implements Runnable, MouseListener{
    public MyClock(){
        this.addMouseListener(this);
    }
    
    boolean stop = false;
    
    public void run(){
        int sec = 0;
        int min = 0;
        int hour = 0;
        while(true){
            if(stop == false){
            sec += 1;
            }
            if(sec == 60){
                min += 1;
                sec = 0;
            }
            if(min == 60){
                hour += 1;
                min = 0;
            }
            
            setFont(new Font("Serif", Font.BOLD, 50));
            
            setText(checktime(hour) + " : " + checktime(min) + " : " + checktime(sec));
            
            try{
                Thread.sleep(1000);
            } catch (InterruptedException ex){
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String checktime(int num){
        String time;
        if(num < 10){
            time =  "0" + num;
        }
        else{
            time = num + "";
        }
        return time;
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == this){
            if (stop == true){
                stop = false;
            }
            else{
                stop = true;
            }
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}