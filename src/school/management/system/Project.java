package school.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    
    Project(){
        setSize(1900,1000);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/banarer1.png"));
        Image i2 = i1.getImage().getScaledInstance(1900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
       
        JMenuBar mb = new JMenuBar();
        
         // new information
        JMenu newInformation = new JMenu ("New Information");
        newInformation.setFont(new Font("sans-serif", Font.PLAIN, 20));
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.setFont(new Font("sans-serif", Font.PLAIN, 20));
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.setFont(new Font("sans-serif", Font.PLAIN, 20));
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        // Details of new information
        JMenu details = new JMenu ("View Details");
        details.setFont(new Font("sans-serif", Font.PLAIN, 20));
        details.setForeground(Color.BLUE);
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.setFont(new Font("sans-serif", Font.PLAIN, 20));
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.setFont(new Font("sans-serif", Font.PLAIN, 20));
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        // Leave
        JMenu leave = new JMenu ("Apply Leave");
        leave.setForeground(Color.BLUE);
        leave.setFont(new Font("sans-serif", Font.PLAIN, 20));
        mb.add(leave);
        
        JMenuItem facultleave = new JMenuItem("Faculty Leave");
        facultleave.setBackground(Color.WHITE);
        facultleave.setFont(new Font("sans-serif", Font.PLAIN, 20));
        facultleave.addActionListener(this);
        leave.add(facultleave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.setFont(new Font("sans-serif", Font.PLAIN, 20));
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        // Leave Details
        JMenu leaveDetails = new JMenu ("Leave Details");
        leaveDetails.setForeground(Color.BLUE);
        leaveDetails.setFont(new Font("sans-serif", Font.PLAIN, 20));
        mb.add(leaveDetails);
        
        JMenuItem facultleavedetails = new JMenuItem("Faculty Leave Details");
        facultleavedetails.setBackground(Color.WHITE);
        facultleavedetails.setFont(new Font("sans-serif", Font.PLAIN, 20));
        facultleavedetails.addActionListener(this);
        leaveDetails.add(facultleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.setFont(new Font("sans-serif", Font.PLAIN, 20));
        studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);
        
        // Exams Details
        JMenu exam = new JMenu ("Examination");
        exam.setForeground(Color.BLUE);
        exam.setFont(new Font("sans-serif", Font.PLAIN, 20));
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.setFont(new Font("sans-serif", Font.PLAIN, 20));
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.setFont(new Font("sans-serif", Font.PLAIN, 20));
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        // UpdateInfo
        JMenu updateInfo = new JMenu ("Update Details");
        updateInfo.setForeground(Color.BLUE);
        updateInfo.setFont(new Font("sans-serif", Font.PLAIN, 20));
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.setFont(new Font("sans-serif", Font.PLAIN, 20));
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.setFont(new Font("sans-serif", Font.PLAIN, 20));
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        // fee
        JMenu fee = new JMenu ("Fee Details");
        fee.setForeground(Color.BLUE);
        fee.setFont(new Font("sans-serif", Font.PLAIN, 20));
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Update Fee Details");
        feestructure.setBackground(Color.WHITE);
        feestructure.setFont(new Font("sans-serif", Font.PLAIN, 20));
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.setFont(new Font("sans-serif", Font.PLAIN, 20));
        fee.add(feeform);
        
        // Utility
        JMenu utility = new JMenu ("Utility");
        utility.setForeground(Color.BLUE);
        utility.setFont(new Font("sans-serif", Font.PLAIN, 20));
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.setFont(new Font("sans-serif", Font.PLAIN, 20));
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculater");
        calc.setBackground(Color.WHITE);
        calc.setFont(new Font("sans-serif", Font.PLAIN, 20));
        calc.addActionListener(this);
        utility.add(calc);
        
        
        // exit
        JMenu exit = new JMenu ("Exit");
        exit.setForeground(Color.BLUE);
        exit.setFont(new Font("sans-serif", Font.PLAIN, 20));
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.setFont(new Font("sans-serif", Font.PLAIN, 20));
        ex.addActionListener(this);
        exit.add(ex);
        
        
        setJMenuBar(mb);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        }
        else if (msg.equals("Calculater")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception ea){
                
            }
        }
        else if (msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception ea){
                
            }
         } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        }
        else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        }
        else if (msg.equals("Faculty Leave")) {
            new TeacherLeave();
        }
        else if (msg.equals("Student Leave")) {
            new StudentLeave();
        }
        else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        }
        else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        }
        else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        }
        else if (msg.equals("update Student Details")) {
            new UpdateStudent();
        }
        else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        }
        else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        }
        
    }
}
//public static void main(String args[]){
//        new Project();
//    }
