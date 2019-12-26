package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui extends JFrame {
    private JButton j,j1;
    private JButton j2;
    private JMenu m;
    private JMenuItem i,i1; 
    private JMenuBar b;
    
    public Gui()
    {
       
        super("Welcome to CIIT Islamabad");
        setSize(500,500);
        setLocation(400,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,1));
        //super.setUndecorated(true);
         Icon bug1=new ImageIcon(getClass().getResource("download.jpg"));
         j1=new JButton("",bug1);
      
         add(j1);
        action a=new action();
        i=new JMenuItem("Student");
        i.addActionListener(a);
        i1= new JMenuItem("Faculty");
        i1.addActionListener(a);
       
        m=new JMenu("File");
        m.add(i);
        m.add(i1);
        m.setForeground(Color.GREEN);
        
        b=new JMenuBar();
        b.add(m);
      
        add(b);
        b.setBackground(Color.red);
        setJMenuBar(b);
     
       
        setVisible(true);
        
        
    }
    public class action implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
       
            if(e.getActionCommand().equals("Student"))
            {
                Gbutton b=new Gbutton();
             b.setVisible(true);
             dispose();
            }
            else if(e.getActionCommand().equals("Faculty"))
            {
                fButton f=new fButton();
                f.setVisible(rootPaneCheckingEnabled);
                dispose();
            }
        }
        }
        
    }

