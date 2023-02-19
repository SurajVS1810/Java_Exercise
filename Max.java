//1.WAP to read three numbers and the maximumimport java.io.*;
import java.lang.*;
class Max
{
    public static void main(String args[])
    {
        int x,y,z;
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter the nos : ");
            x=Integer.parseInt(dis.readLine());
            y=Integer.parseInt(dis.readLine());
            z=Integer.parseInt(dis.readLine());
            if(x>=y && x>=z) 
                System.out.println(x+" is Maximum");
            else if(y>=x && y>=z)
                System.out.println(y+" is Maximum");
            else
                System.out.println(y+" is Maximum");
        }
         catch(IOException e){System.out.println(e);}
    }
}