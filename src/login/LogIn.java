package login;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import Frame.mainFrame;
public class LogIn extends JLayeredPane {


    public LogIn(mainFrame frame){
        setVisible(true);
        setBounds(810,340,300,400);
        frame.add(this);
        setBorder(new LineBorder(new Color(0,0,0) , 10));
        frame.button.setBounds(25,350,250,30);
        frame.t1.setBounds(50,50,200,50);
        frame.t2.setBounds(50,200,200,50);
        this.add(frame.button);
        this.add(frame.t1);
        this.add(frame.t2);


    }


}
