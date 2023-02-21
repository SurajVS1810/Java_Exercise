//  WAP (menu driven) to demonstrate function overriding in java, by displaying details of a student, and a teacher.
import java.io.*;
import java.lang.*;
class Teacher
{
    int tno;
    String tname;
    int tsal;
    public void read()
    {
        DataInputStream dis=new DataInputStream(System.in);
        try
        {
        System.out.println("Enter the tno,name and salary of teacher : ");
        tno=Integer.parseInt(dis.readLine());
        tname=dis.readLine();
        tsal=Integer.parseInt(dis.readLine());
        }
        catch(IOException e){System.out.println(e);}
    }
    public void disp()
    {
        System.out.println();
        System.out.println("Teacher details");
        System.out.println("Teacher no : "+tno);
        System.out.println("Teacher name : "+tname);
        System.out.println("Teacher salary : "+tsal);
    }
}
class Student extends Teacher
{
    int sno;
    String scourse;
    String sname;
    public void read()
    {
        DataInputStream dis=new DataInputStream(System.in);
        try
        {
        System.out.println("Enter the no,name and course of student : ");
        sno=Integer.parseInt(dis.readLine());
        sname=dis.readLine();
        scourse=dis.readLine();
        }
        catch(IOException e){System.out.println(e);}
    }
    public void disp()
    {
        System.out.println();
        System.out.println("Student details");
        System.out.println("Student no : "+sno);
        System.out.println("Student no : "+sname);
        System.out.println("Student no : "+scourse);
    }
}
class Slot5_p2
{
public static void main(String args[])
 {    
    try
    {
        DataInputStream dis=new DataInputStream(System.in);
        int ch;
        Student s=new Student();
        Teacher t=new Teacher();
        do
        {
            System.out.println();
            System.out.println("1.Read Student Details");
            System.out.println("2.Read Teacher Details");
            System.out.println("3.Display Student Details");
            System.out.println("4.Display Teacher Details");
            System.out.println("5.Exit");
            System.out.println();
            System.out.print("Enter the choice :");
            ch=Integer.parseInt(dis.readLine());
            switch(ch)
            {
                case 1:
                s.read();
                break;
                case 2:
                t.read();
                break;
                case 3:
                s.disp();
                break;
                case 4:
                t.disp();
                break;
                default :
                System.out.println("Enter a valid choice");
            }

        }while(ch!=5);
    }
    catch(IOException e){System.out.println(e);}
  }
}