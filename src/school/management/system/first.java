package school.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class first extends JFrame implements ActionListener{
    
    JButton admin,student,faculty;
    first()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        admin = new JButton("Admin Login");
        admin.setBounds(120, 40, 200, 30);
        admin.setBackground(Color.BLACK);
        admin.setForeground(Color.WHITE);
        admin.addActionListener(this);
        admin.setFont(new Font("serif", Font.BOLD, 18));
        add(admin);
        
        faculty = new JButton("Faculty Login");
        faculty.setBounds(120, 90, 200, 30);
        faculty.setBackground(Color.BLACK);
        faculty.setForeground(Color.WHITE);
        faculty.addActionListener(this);
        faculty.setFont(new Font("serif", Font.BOLD, 18));
        add(faculty);
        
        student = new JButton("Student Login");
        student.setBounds(120, 140, 200, 30);
        student.setBackground(Color.BLACK);
        student.setForeground(Color.WHITE);
        student.addActionListener(this);
        student.setFont(new Font("serif", Font.BOLD, 18));
        add(student);
        
        setSize(450,300);
        setLocation(500, 250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==admin)
        {
            Login n = new Login();
        }
        else if (ae.getSource()==student)
        {
            studentLogin m = new studentLogin();
        }
        else if (ae.getSource()==faculty)
        {
            teacherLogin m = new teacherLogin();
        }
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
