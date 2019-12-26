package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class fButton extends JFrame{
    private JButton ad,Sbn,Sbd,b;
    private JPanel p,p1,p2;
    public fButton()
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
        ad.setSize(35, 50);
        ad.setForeground(Color.red);
        Sbn=new JButton("Search by name");
        Sbn.addActionListener(a);
        Sbn.setSize(35, 50);
        Sbn.setForeground(Color.blue);
        Sbd=new JButton("Search by Department");
        Sbd.addActionListener(a);
        Sbd.setForeground(Color.darkGray);
        Sbd.setSize(35, 50);
         b=new JButton("Back");
        b.addActionListener(a);
        b.setBackground(Color.LIGHT_GRAY);
        p1=new JPanel();
        p1.add(Sbn,BorderLayout.SOUTH);
        p1.setBackground(Color.BLACK);
        p=new JPanel();
       p.add(Sbd,BorderLayout.WEST);
       p.setBackground(Color.cyan);
       p2=new JPanel();
       p2.add(b);
        add(ad);
        add(p1);
        add(p);
       add(p2);
        setVisible(true);
    }
    public class action implements ActionListener
    {

        public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Add record"))
        {
            Ffields f=new Ffields();
            f.setVisible(true);
            
        }
        if(e.getActionCommand().equals("Search by name"))
        {
            fsearch s=new fsearch();
             s.setVisible(true);
            dispose();
        }
        if(e.getActionCommand().equals("Search by Department"))
        {
            fsearchd f=new fsearchd();
         dispose();
            
        }
        
             if(e.getActionCommand().equals("Back"))
             {
                 Gui g=new Gui();
                 dispose();
             }
        }
        
    }
}
