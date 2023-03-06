import java.io.*;

public class Slot12_p4Ser
{
public static void main (String args[])
{

try{
    DataInputStream dis = new DataInputStream(System.in);
    System.out.print("Enter the employee id : ");
    String eid=dis.readLine();
    System.out.print("Enter the name of employee : ");
    String ename=dis.readLine();
    System.out.print("Enter the age of employee : ");
    int eage=Integer.parseInt(dis.readLine());
    System.out.print("Enter the dept of employee : ");
    String edept=dis.readLine();
    Slot12_p4Employee e= new Slot12_p4Employee(eid,ename,edept);
FileOutputStream fout = new FileOutputStream("D:\\javarecord\\Slot 12\\emp.txt");
ObjectOutputStream oos= new ObjectOutputStream(fout);
oos.writeObject(e);//write
System.out.println("Serialization happened");
}
catch(IOException m){System.out.println(m);}
}
}