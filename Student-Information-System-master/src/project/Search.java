
package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search extends JFrame {
    private JTextField f1;
    private JLabel j;
    private JButton b;
    public Search()
    {
        super("Search by Name");
        setSize(300,250);
        setLocation(525,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        j=new JLabel("enter name to search");
        f1=new JTextField(null,20);
                f1.setForeground(Color.BLUE);
        add(j,BorderLayout.CENTER);
        add(f1,BorderLayout.CENTER);
        b=new JButton("Search");
        b.addActionListener(new action());
        add(b,BorderLayout.AFTER_LAST_LINE);
        setVisible(true);
    }
   public class action implements ActionListener
   {

        public void actionPerformed(ActionEvent e) {
         if(e.getActionCommand().equals("Search"))
         {
             Readfile r=new Readfile();
             r.openfile();
             r.searchbyname(f1.getText());
             r.closefile();
             dispose();
         }
        
        }
       
   }
}
