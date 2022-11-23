import java.util.Calendar;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClock extends JLabel implements Runnable{
    public void run(){
        int sec = 0;
        int min = 0;
        int hour = 0;
        while(true){
            sec += 1;
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
}