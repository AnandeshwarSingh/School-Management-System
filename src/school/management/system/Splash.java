package school.management.system;

import javax.swing.*;
import java.awt.*;
//import university.management.system.ExaminationDetails;

// multi treading method runnable
public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/banarer1.png"));
        Image i2 = i1.getImage().getScaledInstance(1100, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
         
        t = new Thread(this);
        t.start();
        
        setVisible(true);
        int x = 1;
        for(int i=0;i<800;i+=4, x+=1)
        {
            setLocation(1100-((i+2*x)/2),550-((i+x)/2));
            setSize(i+(3*x/2), i+(x/2));
            
            try{
                Thread.sleep(3);
            }catch(Exception e){}
        }
    }
    public void run(){
        try {
            
            Thread.sleep(3000);
            setVisible(false);
            /// next frame
            //Login n = new Login();
            new first();
            //Project n2 = new Project();
            //new AddStudent();
            //new AddTeacher();
            //new StudentDetails();
            //new StudentLeave();
            //new TeacherLeave();
            //new StudentLeaveDetails();
            //new TeacherLeaveDetails();
            //new ExaminationDetails();
            //new UpdateStudent();
            //new UpdateTeacher();
            //new EnterMarks();
            //new Marks("");
            
            
        } catch(Exception e){
        
        }
    }
    
    
    public static void main(String args[])
    {
        Splash s = new Splash();
    }
}
