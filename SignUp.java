package onestopeatery;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignUp extends JFrame implements ActionListener{
    JButton b1;
    JComboBox cb1;
   
    JTextField tf1,tf2,tf3,tf4;
    JLabel txt,txt1,txt2,txt3,txt4,txt5;
    
    SignUp(){
        setSize(1240, 1029);
        setLocation(100,100);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpeg"));
        JLabel img = new JLabel(i1);
        add(img);
        
        txt = new JLabel("Sign Up");
        txt.setBounds(450, 30, 900, 145);
        Color c1 = new Color(41, 0, 1);
        txt.setForeground(c1);
        txt.setFont(new Font("Apple Chancery",Font.BOLD,100));
        img.add(txt);
        
        txt1 = new JLabel("Name");
        txt1.setBounds(250, 150, 700, 200);
        txt1.setForeground(Color.BLACK);
        txt1.setFont(new Font("Century Schoolbook",Font.BOLD,60));
        img.add(txt1);
        
        tf1 = new JTextField();
        tf1.setBounds(470,225,400,50);
        img.add(tf1);
        
        txt2 = new JLabel("Age");
        txt2.setBounds(250, 245, 700, 200);
        txt2.setForeground(Color.BLACK);
        txt2.setFont(new Font("Century Schoolbook",Font.BOLD,60));
        img.add(txt2);
        
        tf2 = new JTextField();
        tf2.setBounds(470,320,400,50);
        img.add(tf2);
        
        txt3 = new JLabel("Password");
        txt3.setBounds(250, 340, 700, 200);
        txt3.setForeground(Color.BLACK);
        txt3.setFont(new Font("Century Schoolbook",Font.BOLD,45));
        img.add(txt3);
        
        tf4 = new JTextField();
        tf4.setBounds(470,415,400,50);
        img.add(tf4);
             
       
        txt4 = new JLabel("Post");
        txt4.setBounds(250, 435, 700, 200);
        txt4.setForeground(Color.BLACK);
        txt4.setFont(new Font("Century Schoolbook",Font.BOLD,60));
        img.add(txt4);
        
        String str[] = {" ","Student","Teaching Staff","Non-teaching Staff"};
        cb1 = new JComboBox(str);
        cb1.setBounds(470, 510, 400, 20);
        cb1.setBackground(Color.WHITE);
        cb1.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(cb1);
        
        txt5 = new JLabel("Email Id");
        txt5.setBounds(250, 540, 700, 200);
        txt5.setForeground(Color.BLACK);
        txt5.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt5);
        
        tf3 = new JTextField();
        tf3.setBounds(470,605,400,50);
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
        
        b1 = new JButton("Sign-In");
        b1.setBounds(500, 700, 200, 70);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setFont(new Font("Times New Roman",Font.BOLD,35));
        img.add(b1);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
        if(ae.getSource()== b1){
            String user = tf1.getText();
            String age = tf2.getText();
            String pass = tf4.getText();
            String post = (String)cb1.getSelectedItem();
            String email = tf3.getText();
            
            Connection c;
            Statement s;
           try{
             
               Class.forName("com.mysql.cj.jdbc.Driver");
               c = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopeatery", "root","kankhu18!");
               s = c.createStatement();
               String query = "insert into signin values('" + user + "' , '" + age + "' , '" + pass + "' , '"+ post + "' , '" + email  + "')";
               s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Sign-in successfull");
               setVisible(false);
               new OneStopEatery();
              
           }
          catch(Exception e){
                e.printStackTrace();
                } 
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
        new SignUp();
    }
}
