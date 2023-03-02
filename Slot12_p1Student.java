import java.io.*;
public class Slot12_p1Student implements Serializable{
    String Sid;
    String sname;
    int age;
    String course;
    public Slot12_p1Student(String Sid,String sname,int age,String course){
        this.Sid=Sid;
        this.sname=sname;
        this.age=age;
        this.course=course;
    }
    public void disp(){
        System.out.println("Sid = "+this.Sid);
        System.out.println("sname = "+this.sname);
        System.out.println("age = "+this.age);
        System.out.println("course = "+this.course);
    }
}
