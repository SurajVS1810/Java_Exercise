//Write a program to implement Serialization and De-Serialization, for an object of Student Class.
//Serialization
import java.io.*;
import java.lang.*;
class Slot12_p1Ser
{
    public static void main(String args[])
    {
        DataInputStream dis=new DataInputStream(System.in);
        try{
        
        System.out.print("Enter the id of student : ");
        String Sid=dis.readLine();
        System.out.print("Enter the name of student : ");
        String sname=dis.readLine();
        System.out.print("Enter the age of student : ");
        int age=Integer.parseInt(dis.readLine());
        System.out.print("Enter the course of student : ");
        String course=dis.readLine();
        Slot12_p1Student s=new Slot12_p1Student(Sid,sname,age,course);
        FileOutputStream fout=new FileOutputStream("D:\\javarecord\\Slot 12\\student.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeObject(s);
        oos.close();
        fout.close();
        }catch(IOException e){System.out.println(e);}
    }
}