
package clock;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.*;

class ledBox extends JPanel {
    JButton ledSquar[] =  new JButton[15];
    ledBox(){
        manageComponents();
    }
    private void manageComponents(){
        this.setSize(90, 150);
        this.setLayout(new GridLayout(5,3));
        
        for (int i=0;i<15;i++){
            ledSquar[i] =  new JButton();
            this.add(ledSquar[i]);
            ledSquar[i].setEnabled(false);
            
        }
        this.setNumber(0);
        
    }
    public void setNumber(int num){
        if(num==0){
            for (int i=0;i<15;i++)
            {
                ledSquar[i].setBackground(new Color(255,0,51));
            }
            ledSquar[4].setBackground(Color.black);
            ledSquar[7].setBackground(Color.black);
            ledSquar[10].setBackground(Color.black);
        }
        if(num==1){
            for (int i=0;i<15;i++)
            {
                ledSquar[i].setBackground(Color.black);
            }
            ledSquar[2].setBackground(new Color(255,0,51));
            ledSquar[5].setBackground(new Color(255,0,51));
            ledSquar[8].setBackground(new Color(255,0,51));
            ledSquar[11].setBackground(new Color(255,0,51));
            ledSquar[14].setBackground(new Color(255,0,51));
        }
        if(num==2){
            for (int i=0;i<15;i++)
            {
                ledSquar[i].setBackground(new Color(255,0,51));
            }
            ledSquar[3].setBackground(Color.black);
            ledSquar[4].setBackground(Color.black);
            ledSquar[10].setBackground(Color.black);
            ledSquar[11].setBackground(Color.black);
        }
        
        if(num==3){
            for (int i=0;i<15;i++)
            {
                ledSquar[i].setBackground(new Color(255,0,51));
            }
            ledSquar[3].setBackground(Color.black);
            ledSquar[4].setBackground(Color.black);
            ledSquar[10].setBackground(Color.black);
            ledSquar[9].setBackground(Color.black);
        }
        
        if(num==4){
            for (int i=0;i<15;i++)
            {
                ledSquar[i].setBackground(new Color(255,0,51));
            }
            ledSquar[1].setBackground(Color.black);
            ledSquar[4].setBackground(Color.black);
            ledSquar[10].setBackground(Color.black);
            ledSquar[9].setBackground(Color.black);
            ledSquar[12].setBackground(Color.black);
            ledSquar[13].setBackground(Color.black);
        }
        if(num==5){
            for (int i=0;i<15;i++)
            {
                ledSquar[i].setBackground(new Color(255,0,51));
            }
            ledSquar[4].setBackground(Color.black);
            ledSquar[5].setBackground(Color.black);
            ledSquar[9].setBackground(Color.black);
            ledSquar[10].setBackground(Color.black);
            
        }
        if(num==6){
            for (int i=0;i<15;i++)
            {
                ledSquar[i].setBackground(new Color(255,0,51));
            }
            ledSquar[4].setBackground(Color.black);
            ledSquar[5].setBackground(Color.black);
            ledSquar[10].setBackground(Color.black);
            
        }
        if(num==7){
            for (int i=0;i<15;i++)
            {
                ledSquar[i].setBackground(new Color(255,0,51));
            }
            ledSquar[3].setBackground(Color.black);
            ledSquar[4].setBackground(Color.black);
            ledSquar[6].setBackground(Color.black);
            ledSquar[7].setBackground(Color.black);
            ledSquar[9].setBackground(Color.black);
            ledSquar[10].setBackground(Color.black);
            ledSquar[12].setBackground(Color.black);
            ledSquar[13].setBackground(Color.black);
            
        }
        if(num==8){
            for (int i=0;i<15;i++)
            {
                ledSquar[i].setBackground(new Color(255,0,51));
            }
            ledSquar[4].setBackground(Color.black);
            ledSquar[10].setBackground(Color.black);
            
        }
        if(num==9){
            for (int i=0;i<15;i++)
            {
                ledSquar[i].setBackground(new Color(255,0,51));
            }
            ledSquar[4].setBackground(Color.black);
            ledSquar[10].setBackground(Color.black);
            ledSquar[9].setBackground(Color.black);
            
        }
    }
    
    
}
class separator extends JPanel {
    JButton ledSquar[] =  new JButton[5];
    separator(){
        manageComponents();
    }
    private void manageComponents(){
        this.setSize(30, 150);
        this.setLayout(new GridLayout(5,0));
        for (int i = 0 ; i<5 ; i++) {
           ledSquar[i] =  new JButton();
           this.add(ledSquar[i]);
           ledSquar[i].setEnabled(false);
        }
        this.beep(true);
        
    }
    
    public void beep(boolean b){
        if(b==true){
            ledSquar[0].setBackground(Color.black);
            ledSquar[1].setBackground(new Color(0,51,204));
            ledSquar[2].setBackground(Color.black);
            ledSquar[3].setBackground(new Color(0,51,204));
            ledSquar[4].setBackground(Color.black);
        }
        if(b==false){
            ledSquar[0].setBackground(Color.black);
            ledSquar[1].setBackground(Color.black);
            ledSquar[2].setBackground(Color.black);
            ledSquar[3].setBackground(Color.black);
            ledSquar[4].setBackground(Color.black);
        }
    }
}
class mainFrame extends JFrame {
    ledBox hour1 =  new ledBox();
    ledBox hour2 =  new ledBox();
     ledBox second1 =  new ledBox();
    ledBox second2 =  new ledBox();
     ledBox minute1 =  new ledBox();
    ledBox minute2 =  new ledBox();
    separator one =  new separator();
    separator two =  new separator();
    Timer ledBox , separator ;
    boolean beepState = true;
    mainFrame(){
        manageComponents();
        this.start();
    }
    private void manageComponents(){
        this.setTitle("LED Clock");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setBackground(Color.black);
        this.setSize(635, 175);
        this.add(hour1);
        hour1.setLocation(0, 0);
        this.add(hour2);
        hour2.setLocation(95, 0);
        this.add(one);
        one.setLocation(190, 0);
        this.add(minute1);
        minute1.setLocation(225, 0);
        this.add(minute2);
        minute2.setLocation(320, 0);
        this.add(two);
        two.setLocation(415, 0);
        this.add(second1);
        second1.setLocation(450, 0);
        this.add(second2);
        second2.setLocation(545, 0);
    }
    
    public void start(){
        
        ledBox =  new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
                 {
                   ledBoxDo();
                 }
        });
        
        separator =  new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
                 {
                   separatorDo();
                 }
        });
        ledBox.start();
        separator.start();
    }
    
    public void ledBoxDo(){
        
        Calendar now =  Calendar.getInstance();
        int AMPM =  (now.get(Calendar.HOUR_OF_DAY) % 12)  ;
        if(AMPM == 0){
            AMPM = 12;
        }
        hour1.setNumber(AMPM/10);
        hour2.setNumber(AMPM%10);
        
        minute1.setNumber((now.get(Calendar.MINUTE)/10));
        minute2.setNumber((now.get(Calendar.MINUTE)%10));
        
        second1.setNumber((now.get(Calendar.SECOND)/10));
        second2.setNumber((now.get(Calendar.SECOND)%10));
        
    }
    public void separatorDo(){
        one.beep(beepState);
        two.beep(beepState);
        if(beepState==true){
            beepState=false;
        }
        else{
            beepState=true;
        }
    }
}

public class Clock {

    
    public static void main(String[] args) {
        mainFrame mainWindow = new mainFrame();
        mainWindow.setVisible(true);
    }
    
}
