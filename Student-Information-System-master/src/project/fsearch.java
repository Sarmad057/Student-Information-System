
package project;

import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class fsearch extends JFrame {
    private JTextField f1;
    private JLabel l;
    private JButton b,b1;
    public fsearch()
    {
        super("Search by Name");
        setSize(275,300);
        setLocation(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        action a=new action();
        l=new JLabel("enter name to search");
        add(l);
        f1=new JTextField(null,20);
                f1.setForeground(Color.red);

        add(f1);
        b=new JButton("Search");
        b.addActionListener(a);
        b.setSize(35, 50);
        b1=new JButton("Cancel");
        b1.addActionListener(a);
        b1.setSize(35,50);
        add(b);
        add(b1);
        setVisible(true);
    }
    public class action implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getActionCommand().equals("Search"))
           {
               freadclass c=new freadclass();
               c.openfile();
               c.searchbyname(f1.getText());
               c.closefile();
               Gui g=new Gui();
      
           }
           if(e.getActionCommand().equals("Cancel"))
           {
               fButton b=new fButton();
               b.setVisible(true);
           }
        }
        
    }
}
