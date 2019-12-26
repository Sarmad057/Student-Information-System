
package project;
import java.io.*;
public class Department implements Serializable {
private String name;
private String students;
public Department(String n,String s)
{
    name=n;
    students=s;
}

    Department() {
 name="";
 students="";
    }
public void setName(String n)
{
    name=n;
}

    public String getName() {
        return name;
    }

    public void setStudent(String s) {
        this.students = s;
    }

    public String getStudent() {
        return students;
    }
}
