package Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import login.LogIn;
public class mainFrame extends JFrame implements ActionListener {


    public JButton button = new JButton();
    public JTextField t1 = new JTextField();
    public JTextField t2 = new JTextField();
    public JLabel label = new JLabel();


    public mainFrame(){
        setVisible(true);
        setBounds(0,0,1920,1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        button.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button))
            System.out.println("k");
    }
}
