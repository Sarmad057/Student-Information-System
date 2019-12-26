package project;
import java.io.*;
public class Faculty extends Person implements Serializable{
private String designation;
private String salary;
private Department d;
public Faculty(String n,String ph,String g,String d,String salary,Department e)
{
    super(n,ph,g);
    designation=d;
    this.salary=salary;
    this.d=e;
}

    Faculty() {
           designation="";
           salary="";
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setD(Department d) {
        this.d = d;
    }

    public Department getD() {
        return d;
    }


    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getSalary() {
        return salary;
    }
}
