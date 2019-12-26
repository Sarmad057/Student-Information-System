package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ffields extends JFrame {
    private JLabel j,j1,j2,j3,j4,j5,j6;
    private JTextField t1,t2,t3,t4,t5,t6,t7;
    private JButton b,b1,b2;
    public Ffields()
    {
        super("Fill the Form");
        setSize(275,300);
        setLocation(525,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(10,2));
    action a=new action();
    j=new JLabel("Name");
    add(j);
    t1=new JTextField(null,20);
    add(t1);
    
    
    j1=new JLabel("Gender");
    add(j1);
    t2=new JTextField(null,20);
    add(t2);
    
     j2=new JLabel("Phone");
    add(j2);
    t3=new JTextField(null,20);
    add(t3);
    j3=new JLabel("Designation");
    add(j3);
    t4=new JTextField(null,20);
    add(t4);
    j4=new JLabel("Salary");
    add(j4);
    t5=new JTextField(null,20);
    add(t5);
    j5=new JLabel("Department");
    add(j5);
    t6=new JTextField(null,20);
    add(t6);
    j6=new JLabel("CNIC");
    add(j6);
    t7=new JTextField(null,20);
    add(t7);
    b=new JButton("Save");
    b.addActionListener(a);
    b.setSize(30,35);
    b1=new JButton("Cancel");
    b1.addActionListener(a);
    b1.setSize(30,35);
    b2=new JButton("Main Menu");
    b2.addActionListener(a);
    b2.setSize(30,35);
    add(b);
    add(b1);
    add(b2);
    }
    public class action implements ActionListener
    {

  
        public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("Save"))
       {
           Faculty f=new Faculty();
    Department dep=new Department();
fwriteclas w=new fwriteclas();
       f.setName(t1.getText());
           f.setGender(t2.getText());
           f.setPhone(t3.getText());
           f.setDesignation(t4.getText());
           f.setSalary(t5.getText());
           dep.setName(t6.getText());
           dep.setStudent(t7.getText());
           
           
           Faculty f1=new Faculty(f.getName(),f.getPhone(),f.getGender(),f.getDesignation(),f.getSalary(),dep);
           w.openfile();
           w.addrecords(f1);
           w.closefile();
           JOptionPane.showMessageDialog(null,"you have been registered");
 Gui g=new Gui();
       }
       if(e.getActionCommand().equals("Cancel"))
        
       {
           fButton b=new fButton();
           dispose();
       }
        if(e.getActionCommand().equals("Main Menu"))
        {
            Gui g=new Gui();
            dispose();
        }}
        
    }
}
