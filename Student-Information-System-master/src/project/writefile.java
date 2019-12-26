package project;
import java.util.*;
import java.io.*;
public class writefile {
    private  ObjectOutputStream output;
    public void openfile()
    {
        try
        {
            output=new ObjectOutputStream(new FileOutputStream("Students.ser"));
        }
        catch(FileNotFoundException i)
        {
            System.err.println("file not found");
        }
        catch(IOException i)
        {
            System.err.println("error in opening file");
        }
        catch(SecurityException s)
        {
            System.err.println("error in opening file");
        }
    }
    public void addrecords(Students s1)
    {
        Department d=new Department();
       
        try
    {
        output.writeObject(s1);
    }
        catch(IOException e)
        {
            System.err.println("error in writing file");
        }
   
}
    public void closefile()
    {try{
        if(output!=null)
        {
            output.close();
        }
    }
    catch(IOException f)
    {
        System.err.println("error in cosing file");
    }
}
}