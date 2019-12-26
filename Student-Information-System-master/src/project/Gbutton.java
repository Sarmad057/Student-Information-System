
package project;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
public class Gbutton extends JFrame {
    private JButton ad,Sbn,Sbd,b;
    private JPanel p1,p2,p3,p4;
    public Gbutton()
    {
        super("Select your option");
        setSize(275,300);
        setLocation(525,200);
         super.setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1));
        action a=new action();
        ad=new JButton("Add record");
        ad.addActionListener(a);
        ad.setSize(35,50);
        Sbn=new JButton("Search by name");
        Sbn.addActionListener(a);
        Sbn.setSize(35,50);
        Sbd=new JButton("Search by Department");
        Sbd.addActionListener(a);
        Sbd.setSize(35,50);
        b=new JButton("Back");
        b.addActionListener(a);
        b.setBackground(Color.LIGHT_GRAY);
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        p1.add(ad);
        p2.add(Sbd);
        p3.add(Sbn);
        p4.add(b);
        p1.setBackground(Color.DARK_GRAY);
        p2.setBackground(Color.GRAY);
        p3.setBackground(Color.CYAN);
        add(p1);
        add(p2);
        add(p3);
       add(p4);
    }
    public class action implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
          if(e.getActionCommand().equals("Add record"))
          {
              fields f=new fields();
              f.setVisible(true);
              dispose();
              
          }
             if(e.getActionCommand().equals("Search by name"))
        {
            Search s=new Search();
            
            dispose();
        }
             if(e.getActionCommand().equals("Search by Department"))
             {
                Searchd d=new Searchd();
                
                 
             }
             if(e.getActionCommand().equals("Back"))
             {
                 Gui g=new Gui();
             }
        }
        
    }
}
