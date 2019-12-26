
package project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
public class fsearchd extends JFrame
{
    private JTextField f1;
    private JLabel l;
    private JButton b,b1;
    public fsearchd()
    {
        super("Search by Department");
        setSize(275,300);
        setLocation(525,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        l=new JLabel("Enter department name to search");
        add(l);
        f1=new JTextField(null,20);
        add(f1);
        action a=new action();
        f1.setForeground(Color.red);
        b=new JButton("Search");
        add(b);
        b.addActionListener(a);
        b.setSize(35, 50);
        b1=new JButton("Back");
        add(b1);
        b1.setSize(35, 50);
        b1.addActionListener(a);
           setVisible(true);
    }
    public class action implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Search"))
        {
            freadclass s=new freadclass();
            s.openfile();
            s.searchbydepartment(f1.getText());
            s.closefile();
            Gui g  =new Gui();
        }
        if(e.getActionCommand().equals("Back"))
        {
            fButton f=new fButton();
            
        }
        }
        
    }
    
}
