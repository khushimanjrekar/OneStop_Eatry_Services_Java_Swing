package onestopeatery;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Menu extends JFrame implements ActionListener{
    JButton b1;
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20;
    JCheckBox cb21,cb22,cb23,cb24,cb25,cb26,cb27,cb28,cb29,cb30,cb31,cb32,cb33,cb35,cb36,cb37,cb38,cb39,cb40,cb44;
    Menu(){
        setSize(1440, 1029);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpeg"));
        JLabel img = new JLabel(i1);
        add(img);
        
        JLabel txt = new JLabel("Menu");
        txt.setBounds(100, 30, 900, 70);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("Apple Chancery",Font.BOLD,100));
        img.add(txt);
        
        JLabel txt1 = new JLabel("Snacks");
        txt1.setBounds(50, 110, 300, 50);
        Color c1 = new Color(250, 241, 230);
        txt1.setForeground(c1);
        txt1.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt1);
        
        cb1 = new JCheckBox("Vada Pav"+"-20");
        cb1.setBounds(50, 170, 300, 30);
        Color c2 = new Color(248, 196, 180);
        cb1.setForeground(c2);
        cb1.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb1);
        
        cb2 = new JCheckBox("Samosa Pav");
        cb2.setBounds(50, 210, 300, 30);
        cb2.setForeground(c2);
        cb2.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb2);
        
        cb3 = new JCheckBox("Samosa/Vada");
        cb3.setBounds(50, 250, 300, 30);
        cb3.setForeground(c2);
        cb3.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb3);
        
        cb4 = new JCheckBox("Pani Puri");
        cb4.setBounds(50, 290, 200, 30);
        cb4.setForeground(c2);
        cb4.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb4);
        
        cb5 = new JCheckBox("Shev Puri"+"40");
        cb5.setBounds(50, 330, 200, 30);
        cb5.setForeground(c2);
        cb5.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb5);
        
        JLabel txt2 = new JLabel("South Indian");
        txt2.setBounds(50, 370, 400, 50);
        txt2.setForeground(c1);
        txt2.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt2);
        
        cb6 = new JCheckBox("Sada Dosa");
        cb6.setBounds(50, 430, 200, 30);
        cb6.setForeground(c2);
        cb6.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb6);
        
        cb7 = new JCheckBox("Rava Dosa");
        cb7.setBounds(50, 470, 200, 30);
        cb7.setForeground(c2);
        cb7.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb7);
        
        cb8 = new JCheckBox("Uttapa");
        cb8.setBounds(50, 510, 200, 30);
        cb8.setForeground(c2);
        cb8.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb8);
        
        cb9 = new JCheckBox("Medu Vada");
        cb9.setForeground(c2);
        cb9.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb9);
        
        cb10 = new JCheckBox("Idli");
        cb10.setBounds(50, 590, 200, 30);
        cb10.setForeground(c2);
        cb10.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb10);
        
        JLabel txt3 = new JLabel("Chinese");
        txt3.setBounds(400, 110, 400, 50);
        txt3.setForeground(c1);
        txt3.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt3);
        
        cb11 = new JCheckBox("Fried Rice");
        cb11.setBounds(400, 170, 200, 30);
        cb11.setForeground(c2);
        cb11.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb11);
        
        cb12 = new JCheckBox("Hakka Noodles");
        cb12.setBounds(400, 210, 300, 30);
        cb12.setForeground(c2);
        cb12.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb12);
        
        cb13 = new JCheckBox("Veg Crispy");
        cb13.setBounds(400, 250, 200, 30);
        cb13.setForeground(c2);
        cb13.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb13);
        
        cb14 = new JCheckBox("Veg Manchurian");
        cb14.setBounds(400, 290, 300, 30);
        cb14.setForeground(c2);
        cb14.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb14);
        
        cb15 = new JCheckBox("Choupsey");
        cb15.setBounds(400, 330, 200, 30);
        cb15.setForeground(c2);
        cb15.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb15);
        
        JLabel txt4 = new JLabel("Indian");
        txt4.setBounds(400, 370, 400, 50);
        txt4.setForeground(c1);
        txt4.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt4);
        
        cb16 = new JCheckBox("Tawa Pulav");
        cb16.setBounds(400, 430, 300, 30);
        cb16.setForeground(c2);
        cb16.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb16);
        
        cb17 = new JCheckBox("Paneer Pulav");
        cb17.setBounds(400, 470, 300, 30);
        cb17.setForeground(c2);
        cb17.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb17);
        
        cb18 = new JCheckBox("Veg Handi");
        cb18.setBounds(400, 510, 200, 30);
        cb18.setForeground(c2);
        cb18.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb18);
        
        cb19 = new JCheckBox("Veg Kurma");
        cb19.setBounds(400, 550, 300, 30);
        cb19.setForeground(c2);
        cb19.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb19);
        
        cb20 = new JCheckBox("Paneer Tika");
        cb20.setBounds(400, 590, 300, 30);
        cb20.setForeground(c2);
        cb20.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb20);
        
        JLabel txt5 = new JLabel("Roti");
        txt5.setBounds(700, 110, 400, 50);
        txt5.setForeground(c1);
        txt5.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt5);
        
        cb21 = new JCheckBox("Plain Roti");
        cb21.setBounds(700, 170, 300, 30);
        cb21.setForeground(c2);
        cb21.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb21);
        
        cb22 = new JCheckBox("Rumali Roti");
        cb22.setBounds(700, 210, 300, 30);
        cb22.setForeground(c2);
        cb22.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb22);
        
        cb23 = new JCheckBox("Butter Roti");
        cb23.setBounds(700, 250, 300, 30);
        cb23.setForeground(c2);
        cb23.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb23);
        
        cb24 = new JCheckBox("Kulcha");
        cb24.setBounds(700, 290, 300, 30);
        cb24.setForeground(c2);
        cb24.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb24);
        
        cb25 = new JCheckBox("Naan");
        cb25.setBounds(700, 330, 200, 30);
        cb25.setForeground(c2);
        cb25.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb25);
        
        JLabel txt6 = new JLabel("Beverages");
        txt6.setBounds(700, 370, 400, 50);
        txt6.setForeground(c1);
        txt6.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt6);
        
        cb26 = new JCheckBox("Coffee");
        cb26.setBounds(700, 430, 300, 30);
        cb26.setForeground(c2);
        cb26.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb26);
        
        cb27 = new JCheckBox("Tea");
        cb27.setBounds(700, 470, 300, 30);
        cb27.setForeground(c2);
        cb27.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb27);
        
        cb28 = new JCheckBox("Iced Tea");
        cb28.setBounds(700, 510, 300, 30);
        cb28.setForeground(c2);
        cb28.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb28);
        
        cb29 = new JCheckBox("Cold Coffee");
        cb29.setBounds(700, 550, 300, 30);
        cb29.setForeground(c2);
        cb29.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb29);
        
        cb30 = new JCheckBox("Cold Drinks");
        cb30.setBounds(700, 590, 300, 30);
        cb30.setForeground(c2);
        cb30.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb30);
        
        JLabel txt7 = new JLabel("Fresh Juice");
        txt7.setBounds(1000, 110, 400, 50);
        txt7.setForeground(c1);
        txt7.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt7);
        
        cb31 = new JCheckBox("Orange");
        cb31.setBounds(1000, 170, 300, 30);
        cb31.setForeground(c2);
        cb31.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb31);
        
        cb32 = new JCheckBox("Lemonade");
        cb32.setBounds(1000, 210, 300, 30);
        cb32.setForeground(c2);
        cb32.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb32);
        
        cb33 = new JCheckBox("Watermelon");
        cb33.setBounds(1000, 250, 300, 30);
        cb33.setForeground(c2);
        cb33.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb33);
        
        cb44 = new JCheckBox("Sweet Lime");
        cb44.setBounds(1000, 290, 300, 30);
        cb44.setForeground(c2);
        cb44.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb44);
        
        cb35 = new JCheckBox("Lime Lemon");
        cb35.setBounds(1000, 330, 300, 30);
        cb35.setForeground(c2);
        cb35.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb35);
        
        JLabel txt8 = new JLabel("Milkshakes");
        txt8.setBounds(1000, 370, 400, 50);
        txt8.setForeground(c1);
        txt8.setFont(new Font("Century Schoolbook",Font.BOLD,50));
        img.add(txt8);
        
        cb36 = new JCheckBox("Mango");
        cb36.setBounds(1000, 430, 300, 30);
        cb36.setForeground(c2);
        cb36.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb36);
        
        cb37 = new JCheckBox("Chickoo");
        cb37.setBounds(1000, 470, 300, 30);
        cb37.setForeground(c2);
        cb37.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb37);
        
        cb38 = new JCheckBox("Custard Apple");
        cb38.setBounds(1000, 510, 300, 30);
        cb38.setForeground(c2);
        cb38.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb38);
        
        cb39 = new JCheckBox("Rose");
        cb39.setBounds(1000, 550, 300, 30);
        cb39.setForeground(c2);
        cb39.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb39);
        
        cb40 = new JCheckBox("Chocolate");
        cb40.setBounds(1000, 590, 300, 30);
        cb40.setForeground(c2);
        cb40.setFont(new Font("Century Schoolbook",Font.BOLD,30));
        img.add(cb40);
        
        b1 = new JButton("Order");
        b1.setBounds(590, 625, 200, 70);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.black);
        b1.setFont(new Font("Times New Roman",Font.BOLD,35));
        b1.addActionListener(this);
        img.add(b1);
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpeg"));
        JLabel img2 = new JLabel(i2);
        img2.setBounds(50,700,1350,80);
        img.add(img2);
        
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
        
        setVisible (true);
    }
    
      public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1){
            String food = cb1.getText();
            Connection c;
            Statement s;
           try{
             
               Class.forName("com.mysql.cj.jdbc.Driver");
               c = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopeatery", "root","kankhu18!");
               s = c.createStatement();
               String query = "insert into food values('" + food + "')";
               s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Order successfull");
               setVisible(false);
               new Order();
              
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
        new Menu();
    }

}

