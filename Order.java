package onestopeatery;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Order extends JFrame implements ActionListener{
    JButton b1;
    JLabel txt1,txt2,txt3;
    JTextField tf1,tf2,tf3;
    Order(){
        setSize(1000, 620);
        setLocation(100,100);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fiftth.jpeg"));
        JLabel img = new JLabel(i1);
        add(img);
        
        JLabel txt = new JLabel("Order");
        txt.setBounds(400, 0, 900, 200);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("Apple Chancery",Font.BOLD,90));
        img.add(txt);
        
        txt1 = new JLabel("Ordered Items");
        txt1.setBounds(90, 95, 500, 200);
        txt1.setForeground(Color.WHITE);
        txt1.setFont(new Font("Century Schoolbook",Font.BOLD,60));
        img.add(txt1);
        
        tf1 = new JTextField();
        tf1.setBounds(550,175,400,50);
        img.add(tf1);
        
        txt2 = new JLabel("Total Amount");
        txt2.setBounds(90, 175, 500, 200);
        txt2.setForeground(Color.WHITE);
        txt2.setFont(new Font("Century Schoolbook",Font.BOLD,60));
        img.add(txt2);
        
        tf2 = new JTextField();
        tf2.setBounds(550,255,400,50);
        img.add(tf2);
        
        txt3 = new JLabel("Instructions");
        txt3.setBounds(90, 255, 500, 200);
        txt3.setForeground(Color.WHITE);
        txt3.setFont(new Font("Century Schoolbook",Font.BOLD,60));
        img.add(txt3);
        
        tf3 = new JTextField();
        tf3.setBounds(550,335,400,50);
        img.add(tf3);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1440, 30);
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
        
        b1 = new JButton("Order Now");
        b1.setBounds(400, 430, 200, 70);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setFont(new Font("Times New Roman",Font.BOLD,35));
        img.add(b1);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1){
            setVisible(false);
            new Final();
        }
        
        if(ae.getActionCommand().equals("Login")){
            setVisible(false);
            new OneStopEatery();
        }
        else if(ae.getActionCommand().equals("Logout")){
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new Order();
    }
}
