

package project;
import java.io.*;
public class Students extends Person implements Serializable{
private String gpa;
private String semestar;
private String section;
private Department d;
public Students()
{
    super("","","");
    gpa="";
    semestar="";
    section="";
}
public Students(String n,String ph,String g,String gp,String s,String sec,Department e)
{
    super(n,ph,g);
    gpa=gp;
    semestar=s;
    section=sec;
    d=e;
}
public void setGpa(String gp)
{
    this.gpa=gp;
}
public void setSemestar(String s)
{
    semestar=s;
}
public void setSection(String sec)
{
    section=sec;
}

    public String getGpa() {
        return gpa;
    }

    public String getSemestar() {
        return semestar;
    }
 public void setD(Department d) {
        this.d = d;
    }
    public Department getD() {
        return d;
    }

   

    public String getSection() {
        return section;
    }    
}
