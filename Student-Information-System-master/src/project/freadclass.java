
package project;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class freadclass {
    private ObjectInputStream input;
    public void openfile()
    {
        try
    {
        input=new ObjectInputStream(new FileInputStream("Faculty.ser"));
    }
    catch(Exception e)
    {
        System.err.println("error in reading file");
    }
}
    public void searchbyname(String n)
    { 
        Faculty f=new Faculty();
    Department d=new Department();
    while(true)
    {
        try
        {
            f=(Faculty) input.readObject();
            d=f.getD();
            if(f.getName().equals(n))
            {
            JOptionPane.showMessageDialog(null,"your name is "+f.getName()+"\n"+"your designation is "+f.getDesignation()+"\n"+"Your gender is "+f.getGender()+"\n"+"your Salary is "+f.getSalary()+"\n"+"your department is"+d.getName()+"\n"+"your number of student is "+d.getStudent());
            }
            else
                JOptionPane.showMessageDialog(null,"no record found");
            
        }
        catch(ClassNotFoundException e)
        {
            return;
        }
        catch(FileNotFoundException e)
        {
            return;
        }
        catch(EOFException e)
        {
            return;
        }
        catch(IOException e)
        {
            System.err.println("error in reading file");
        }
        
    }
    }
    public void searchbydepartment(String m)
    { 
        Faculty f=new Faculty();
    Department d=new Department();
    while(true)
    {
        try
        {
            f=(Faculty) input.readObject();
            d=f.getD();
            if(d.getName().equals(m))
            {
            JOptionPane.showMessageDialog(null,"your name is "+f.getName()+"\n"+"your designation is "+f.getDesignation()+"\n"+"Your gender is "+f.getGender()+"\n"+"your Salary is "+f.getSalary()+"\n"+"your department is"+d.getName()+"\n"+"your number of student is "+d.getStudent());}
            
        
        else
        {
     JOptionPane.showMessageDialog(null,"no record found");           
                }
        }
       
 catch(EOFException E)
   {
return;
   }
     
       catch(ClassNotFoundException E)
   {
   System.err.println("error1");
  
System.exit(1);


   }
     catch(NoSuchElementException E)
   {
   System.err.println("error1");
  
System.exit(1);


   }
   catch(IOException E)
   {
   System.err.println("error2");
System.exit(1);
   
    }
    }
    }

    public void closefile()
    {
        try
        {
            if(input!=null)
            {
                input.close();
            }
        }
        catch(Exception e)
        {
            System.err.println("error in closing file");
        }
    }
    }