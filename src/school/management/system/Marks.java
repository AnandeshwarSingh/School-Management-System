package school.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.awt.event.*;

public class Marks extends JFrame implements ActionListener{
     
    int marks;
    String rollno,marks1,marks2,marks3,marks4,marks5,total;
    JButton cancel;
    
     Marks(String rollno) {
        this.rollno = rollno;
        
        setSize(500, 600);
        setLocation(500, 100);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("S R B S Public School");
        heading.setBounds(100, 10, 500, 25);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel subheading = new JLabel("Result of Examination 2022");
        subheading.setBounds(100, 50, 500, 20);
        subheading.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(subheading);
        
        JLabel lblrollno = new JLabel("Roll Number " + rollno);
        lblrollno.setBounds(60, 100, 500, 20);
        lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblrollno);
        
        JLabel lblsemester = new JLabel();
        lblsemester.setBounds(60, 170, 500, 20);
        lblsemester.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblsemester);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60, 130, 100, 20);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblname);
        
        JLabel lblname1 = new JLabel();
        lblname1.setBounds(170, 130, 300, 20);
        lblname1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblname1);
        
        JLabel sub1 = new JLabel();
        sub1.setBounds(100, 200, 500, 20);
        sub1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub1);
        
        JLabel sub2 = new JLabel();
        sub2.setBounds(100, 230, 500, 20);
        sub2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub2);
        
        JLabel sub3 = new JLabel();
        sub3.setBounds(100, 260, 500, 20);
        sub3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub3);
        
        JLabel sub4 = new JLabel();
        sub4.setBounds(100, 290, 500, 20);
        sub4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub4);
        
        JLabel sub5 = new JLabel();
        sub5.setBounds(100, 320, 500, 20);
        sub5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub5);
        
        JLabel total1 = new JLabel("Total ");
        total1.setBounds(100, 350, 100, 25);
        total1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(total1);
        
        JLabel total2 = new JLabel();
        total2.setBounds(220, 350, 100, 25);
        total2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(total2);
        
        //percentage
         JLabel per = new JLabel("Percentage ");
        per.setBounds(100, 390, 100, 25);
        per.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(per);
        
        JLabel per1 = new JLabel();
        per1.setBounds(220, 390, 100, 25);
        per1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(per1);
        
        //grade
         JLabel gd = new JLabel("Grade ");
        gd.setBounds(100, 430, 100, 25);
        gd.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(gd);
        
        JLabel gd1 = new JLabel();
        gd1.setBounds(220, 430, 100, 25);
        gd1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(gd1);
        try {
            Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from subject where rollno = '"+rollno+"'");
            while(rs1.next()) {
                sub1.setText(rs1.getString("subject1"));
                sub2.setText(rs1.getString("subject2"));
                sub3.setText(rs1.getString("subject3"));
                sub4.setText(rs1.getString("subject4"));
                sub5.setText(rs1.getString("subject5"));
            }
            
            ResultSet rs3 = c.s.executeQuery("select name from student where rollno = '"+rollno+"'");
            if(rs3.next())
            {
                lblname1.setText(rs3.getString("name"));
            }

            ResultSet rs2 = c.s.executeQuery("select * from marks where rollno = '"+rollno+"'");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "------------" + rs2.getString("marks1"));
                sub2.setText(sub2.getText() + "------------" + rs2.getString("marks2"));
                sub3.setText(sub3.getText() + "------------" + rs2.getString("marks3"));
                sub4.setText(sub4.getText() + "------------" + rs2.getString("marks4"));
                sub5.setText(sub5.getText() + "------------" + rs2.getString("marks5"));
                int s1=Integer.parseInt(rs2.getString("marks1"));
                int s2=Integer.parseInt(rs2.getString("marks2"));
                int s3=Integer.parseInt(rs2.getString("marks3"));
                int s4=Integer.parseInt(rs2.getString("marks4"));
                int s5=Integer.parseInt(rs2.getString("marks5"));
                lblsemester.setText("exam " + rs2.getString("exam"));
                int t=s1+s2+s3+s4+s5;
                String tt=Integer.toString(t);
                total2.setText(tt);
                float p=(t*100)/500;
                per1.setText(Float.toString(p));
                if(p>80)
                {
                    gd1.setText("A  Pass");
                }else if(p>60)
                {
                    gd1.setText("B  Pass");
                }
                else if(p>45)
                {
                     gd1.setText("C  Pass");

                } 
                else
                {
                    gd1.setText("Fail");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        cancel = new JButton("Back");
        cancel.setBounds(250, 500, 120, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
     
     public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
     
     public static void main(String[] args) {
        new Marks("");
    }
    
}
