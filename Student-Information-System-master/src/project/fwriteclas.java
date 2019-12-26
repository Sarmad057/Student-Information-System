
package project;
import java.io.*;
import java.util.*;
public class fwriteclas {
    private ObjectOutputStream output;
    public void openfile()
    {
        try{
        output=new ObjectOutputStream(new FileOutputStream("Faculty.ser"));
    }
        catch(Exception e)
        {
            System.err.println("error in creating file");
        }
    }
    public void addrecords(Faculty f)
    {
        try
        {
   
      
        output.writeObject(f);
    }
    catch(Exception e)
    {
        System.err.println("error in writing  file");
    }
    }
    public void closefile()
    {
        try
        {
        if(output!=null)
        {
         output.close();
        }
    }
        catch(Exception e)
        {
            System.err.println("error in closing file");
        }
    }
}
    
