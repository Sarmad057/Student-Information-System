
package project;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;

public class fields extends JFrame{
private  JLabel j,j1,j2,j3,j4,j5,j6,j7,j8;    
private JTextField t, t1,t2,t3,t4,t5,t6,t7,t8;
private JButton b,b1,b2;
public fields()
{
    super("Fill the Form");
    setSize(300,300);
    setLocation(525,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout(12,1));
    
    action a=new action();
    j=new JLabel("Name");
    add(j);
    t1=new JTextField(null,20);
    add(t1);
    j1=new JLabel("Section");
    add(j1);
    t2=new JTextField("",20);
    add(t2);
    
    j2=new JLabel("Gender");
    add(j2);
    t3=new JTextField("",20);
    add(t3);
    
     j3=new JLabel("Phone");
    add(j3);
    t4=new JTextField(null,20);
    add(t4);
    
     j4=new JLabel("GPA");
    add(j4);
    t5=new JTextField(null,20);
    add(t5);
    
     j5=new JLabel("DEPARTMENT Name");
    add(j5);
    t6=new JTextField(null,20);
    add(t6);
    
     j6=new JLabel("CNIC");
    add(j6);
    t7=new JTextField(null,20);
    add(t7);
    
    
     j8=new JLabel("Semester");
    add(j8);
    t=new JTextField(null,20);
     add(t);
     
    b=new JButton("Save");
    add(b,BorderLayout.SOUTH);
    
    
        b.addActionListener(a);
    
    b.setSize(30, 35);
    b1=new JButton("Main Menu");
    add(b1,BorderLayout.SOUTH);
    b1.addActionListener(a);
    b2=new JButton("Cancel");
    add(b2,BorderLayout.SOUTH);
    b2.addActionListener(a);
    add(b);
    add(b2);
    add(b1);
    b1.setSize(30, 35);
    b2.setSize(30, 35);
}

public class action implements ActionListener
        {
   
        @Override
        public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Main Menu")){
            Gui g=new Gui();
            dispose();
        }
        if(e.getActionCommand().equals("Save"))
        {
            
             Students s=new Students();
    Department dep=new Department();
writefile w=new writefile();
       s.setName(t1.getText());
             
           s.setSection(t2.getText());
           s.setGender(t3.getText());
           s.setPhone(t4.getText());
           dep.setName(t5.getText());
           s.setGpa(t6.getText());
           s.setSemestar(t.getText());
           dep.setStudent(t7.getText());
           
           Students s1=new Students(s.getName(),s.getPhone(),s.getGender(),s.getGpa(),s.getSemestar(),s.getSection(),dep);
           w.openfile();
           w.addrecords(s1);
           w.closefile();
           JOptionPane.showMessageDialog(null,"you have been enrolled");
           Gui g=new Gui();
           dispose();
        }
        
         if(e.getActionCommand().equals("Cancel"))
        {
            Gbutton g=new Gbutton();
            g.setVisible(true);
            dispose();
        }
        }
            
        }
}
