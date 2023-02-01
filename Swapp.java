//4.WAP to accept two numbers from the keyboard and swap themimport java.io.*;
import java.lang.*;
class Fun
{
    public void swap(int a, int b)
    {
        int c=a;
        a=b;
        b=c;
        System.out.println("After swap");
        System.out.println("x = "+a+" y = "+b);
    }
}
class Swapp
{
    public static void main(String args[])
    {
        try
        {
            int x;
            int y;
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("Enter the nos");
            x = Integer.parseInt(dis.readLine());
            y = Integer.parseInt(dis.readLine());
            System.out.println("Before swap");
            System.out.println("x = "+x+" y = "+y);
            Fun f = new Fun();
            f.swap(x,y);
        }
        catch(IOException e) { System.out.println(e);}
    }
}