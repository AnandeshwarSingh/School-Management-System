package school.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class TeacherLeave extends JFrame implements ActionListener{
    
    Choice cempId,ctime;
    JDateChooser dcdate;
    JButton submit, cancel;
    TeacherLeave(){
        
        setSize(500,500);
        setLocation(600, 100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Apply Leave (Teacher)");
        heading.setBounds(60, 50, 300, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel lblroll = new JLabel("Search by empeloyee ID");
        lblroll.setBounds(60, 100, 200, 20);
        lblroll.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblroll);
        
        cempId = new Choice();
        cempId.setBounds(60, 130, 200, 20);
        add(cempId);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next()){
                cempId.add(rs.getString("empId"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        
        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60, 180, 200, 30);
        lbldate.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(lbldate);
        
        dcdate = new JDateChooser();
        dcdate.setBounds(60,210,200,25);
        add(dcdate);
        
        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60, 260, 200, 20);
        lbltime.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lbltime);
        
        ctime = new Choice();
        ctime.setBounds(60, 290, 200, 20);
        ctime.add("Half Day");
        ctime.add("Full Day");
        add(ctime);
        
        submit = new JButton("Submit");
        submit.setBounds(60, 350, 100, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("serif", Font.BOLD, 18));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(200, 350, 100, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD, 18));
        add(cancel);
        
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==submit) {
            String rollno = cempId.getSelectedItem();
            String date = ((JTextField)dcdate.getDateEditor().getUiComponent()).getText();
            String duration = ctime.getSelectedItem();
            
            String query = "insert into teacherleave values('"+rollno+"' , '"+date+"' , '"+duration+"')";
            
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Leave confirmed");
                setVisible(false);
                
            }catch (Exception e){
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new TeacherLeave();
        
    }

    

    
}

