/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Searchd extends JFrame{
        private JTextField f1;
    private JLabel j;
    private JButton b;
    public Searchd()
    {
        super("Search by Deapartment");
        setSize(275,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        j=new JLabel("enter Depatment name to search");
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
             r.searchbydepartment(f1.getText());
             r.closefile();
             dispose();
         }
        
        }
       
   }
}
