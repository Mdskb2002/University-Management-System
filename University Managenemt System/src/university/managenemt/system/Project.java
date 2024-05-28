package university.managenemt.system;

import javax.swing.*;
import java.awt.*;
public class Project extends JFrame{
    Project(){
        setSize(1366, 768);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1326, 668,  Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        
        // new information
        JMenuBar mb = new JMenuBar();
        JMenu newInformation = new JMenu("New Information");
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        facultyInfo.setBackground(Color.WHITE);
        newInformation.add(studentInfo);
        
        
        //details
        JMenu details = new JMenu("View Details");
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem(" Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem(" Student Details");
        studentdetails.setBackground(Color.WHITE);
        details.add(studentdetails);
        
        
        
        //leave
        JMenu leave = new JMenu("Apply for Leave");
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem(" Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem(" Student Leave");
        studentleave.setBackground(Color.WHITE);
        leave.add(studentleave);
        
        
        
        //leavedetails
        JMenu leaveDetails = new JMenu("Leave Details");
        mb.add(leaveDetails);
        
        JMenuItem facultyleavedetails = new JMenuItem(" Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        leaveDetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem(" Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        leaveDetails.add(studentleavedetails);
        
        
        
        //Exams
        JMenu exam = new JMenu("Examinations");
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Results");
        examinationdetails.setBackground(Color.WHITE);
        exam.add(examinationdetails);
        
        JMenuItem enetermarks = new JMenuItem("Enter Marks");
        enetermarks.setBackground(Color.WHITE);
        exam.add(enetermarks);
        
        
        
        
        setJMenuBar(mb);
        setVisible(true);
    }
    public static void main(String[] args){
        new Project();
    }
}
