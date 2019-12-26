
package project;
import java.awt.HeadlessException;
import java.io.*;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
public class Readfile {
private ObjectInputStream input;
public void openfile()
{
    try
    {
        input=new ObjectInputStream(new FileInputStream("Students.ser"));
        
    }
    catch(IOException e)
    {
        System.err.println("error in opening file");
    }
}
public void searchbyname(String n)
{ 
    Students s=new Students();
    Department d=new Department();
    while(true)
    {
   try
   {
     s=(Students) input.readObject();
     d=s.getD();
    
    if(s.getName().equalsIgnoreCase(n))
    {
    JOptionPane.showMessageDialog(null,"name  " + s.getName()+"\nphone  " + s.getPhone()+"\ngender  " + s.getGender()+"\nDepartment  " + d.getName()+"\nGPA  " + s.getGpa()+"\nnoofstudents  " +d.getStudent()+"\nsemester  " + s.getSemestar()+"\nsection  " + s.getSection());
 
    }
    else
    {
        JOptionPane.showMessageDialog(null,"no name found");
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
public void searchbydepartment(String n)
{ 
    Students s=new Students();
    Department d=new Department();
    while(true)
    {
   try
   {
     s=(Students)input.readObject();
     d=s.getD();
    
    if(d.getName().equals(n))
    {
        JOptionPane.showMessageDialog(null,"name  " + s.getName()+"\nphone  " + s.getPhone()+"\ngender  " + s.getGender()+"\nDepartment  " + d.getName()+"\nGPA  " + s.getGpa()+"\nnoofstudents  " +d.getStudent()+"\nsemester  " + s.getSemestar()+"\nsection  " + s.getSection());
        
    }
    else
       {
           JOptionPane.showMessageDialog(null,"no name found");
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

/*public void readfile()
{
    Students s = new Students();
    Department d = new Department();
    while(true)
    {
    try
    {
        s=(Students) input.readObject();
        d=s.getD();
       
        System.out.println("your GPA is "+s.getGpa()+"Your name is "+s.getName()+"your gender is "+s.getGender()+"your phone num is "+s.getPhone()+"your section is " +s.getSection()+""+s.getSemestar());
        System.out.println("your department is "+d.getName()+"your departments numberof students is "+d.getStudent());
        
    }
    catch(EOFException E)
    {-ssss
    return;
    }
    catch(ClassNotFoundException e)
    {
        System.err.println("no file found");
       System.exit(1);
    }
    catch(IOException i)
    {
        System.err.println("error in reading file");
   System.exit(1);
   
    }
}}*/
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
        System.out.println("error in closing file");
    }
}
}
