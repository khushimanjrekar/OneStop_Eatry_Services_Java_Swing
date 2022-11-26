
package onestopeatery;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Final extends JFrame implements ActionListener {
    
    Final(){
        setSize(500, 400);
        setLocation(100,100);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/sixth.jpeg"));
        JLabel img = new JLabel(i1);
        add(img);
        
        JLabel txt1 = new JLabel("Thank You");
        txt1.setBounds(100, 20, 400, 200);
        txt1.setForeground(Color.BLACK);
        txt1.setFont(new Font("Apple Chancery",Font.BOLD,60));
        img.add(txt1);
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/seventh.png"));
        JLabel img2 = new JLabel(i2);
        img2.setBounds(150,100,192,192);
        img.add(img2);
        
        JLabel txt2 = new JLabel("Your Order is being Prepared");
        txt2.setBounds(45, 160, 500, 200);
        txt2.setForeground(Color.BLACK);
        txt2.setFont(new Font("Apple Chancery",Font.BOLD,33));
        img.add(txt2);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 500, 30);
        img.add(mb);
        
        JMenu menu = new JMenu("MyAccount");
        menu.setForeground(Color.DARK_GRAY);
        mb.add(menu);
        
        JMenuItem m2 = new JMenuItem("Login");
        m2.addActionListener(this);
        menu.add(m2);
        
        JMenuItem m3 = new JMenuItem("Logout");
        m3.addActionListener(this);
        menu.add(m3);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       
        if(ae.getActionCommand().equals("Login")){
            setVisible(false);
            new OneStopEatery();
        }
        else if(ae.getActionCommand().equals("Logout")){
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new Final();
    }
}
