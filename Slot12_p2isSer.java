//Write a program to implement IS-A Serialization and De-Serialization, for a Maruti Car inherited from Vehicle.
import java.io.*;
import java.lang.*;
public class Slot12_p2isSer
{
    public static void main(String args[])
    {
        DataInputStream dis=new DataInputStream(System.in);
        try{
        
        System.out.print("Enter the type of vehicle: ");
        String type=dis.readLine();
        System.out.print("Enter the colour of vehicle : ");
        String colour=dis.readLine();
        System.out.print("Enter the no of wheels : ");
        int n=Integer.parseInt(dis.readLine());
        System.out.print("Enter the model of vehicle : ");
        int model=Integer.parseInt(dis.readLine());
        Slot12_p2Maruthi m=new Slot12_p2Maruthi(type,colour,n,model);
        FileOutputStream fout=new FileOutputStream("D:\\javarecord\\Slot 12\\vehicle.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeObject(m);
        oos.close();
        fout.close();
        }catch(IOException e){System.out.println(e);}
    }
} 
