package onestopeatery;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class OneStopEatery extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JLabel txt1,txt2;
    JTextField tf1;
    JPasswordField tf2;
    
    OneStopEatery() {
        setSize(1440, 1029);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpeg"));
        JLabel img = new JLabel(i1);
        add(img);
        
        JLabel txt = new JLabel("OneStop Eatery Services");
        txt.setBounds(300, 10, 900, 200);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("Apple Chancery",Font.BOLD,80));
        img.add(txt);
        
        txt1 = new JLabel("User ID");
        txt1.setBounds(400, 155, 700, 200);
        txt1.setForeground(Color.WHITE);
        txt1.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt1);
        
        tf1 = new JTextField();
        tf1.setBounds(670,230,400,50);
        img.add(tf1);
        
        txt2 = new JLabel("Password");
        txt2.setBounds(400, 250, 700, 200);
        txt2.setForeground(Color.WHITE);
        txt2.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt2);
        
        tf2 = new JPasswordField();
        tf2.setBounds(670,325,400,50);
        img.add(tf2);
        
        b1 = new JButton("Login");
        b1.setBounds(530, 420, 200, 70);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setFont(new Font("Times New Roman",Font.BOLD,35));
        img.add(b1);
        
        b2 = new JButton("Sign Up");
        b2.setBounds(740, 420, 200, 70);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        b2.setFont(new Font("Times New Roman",Font.BOLD,35));
        img.add(b2);
        
        b3 = new JButton("Close");
        b3.setBounds(630, 520, 200, 70);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.black);
        b3.addActionListener(this);
        b3.setFont(new Font("Times New Roman",Font.BOLD,35));
        img.add(b3);
        


        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1){
            String user = tf1.getText();
            String pass = tf2.getText();
            
            
            
            Connection c;
            Statement s;
           try{
             
               Class.forName("com.mysql.cj.jdbc.Driver");
               c = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopeatery", "root","kankhu18!");
               s = c.createStatement();
               String query = "select * from signin where username = '" + user + "' and password = '" + pass + "'";
               ResultSet rs = s.executeQuery(query);
               if(rs.next()){
                   setVisible(false);
                   new Menu();
               } else{
                   JOptionPane.showMessageDialog(null,"Invalid username or password");
                   setVisible(false);
                   new OneStopEatery();
               }
              
           }
          catch(Exception e){
                e.printStackTrace();
                } 
            
            
        }
        else if (ae.getSource()== b2){
            setVisible(false);
            new SignUp();
        }
        else if (ae.getSource()== b3){
            setVisible(false);
        }
           
    }
    
    public static void main(String[] args) {
        new OneStopEatery();
    }
    
}
