//Write a program to implement HAS-A Serialization and De-Serialization for the Engine of a Vehicle.
import java.io.*;
import java.lang.*;
public class Slot12_p3hasSer
{
    public static void main(String args[])
    {
        DataInputStream dis=new DataInputStream(System.in);
        try{
        System.out.print("Enter the type of engine : ");
        String engine=dis.readLine();
        Slot12_p3Engine m=new Slot12_p3Engine(engine);
        FileOutputStream fout=new FileOutputStream("D:\\javarecord\\Slot 12\\engine.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeObject(m);
        oos.close();
        fout.close();
        }catch(IOException e){System.out.println(e);}
    }
} 

