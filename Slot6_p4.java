import java.io.*;
import java.lang.*;
class Squareroot
{
    public void test(Num a)
    {
        double R = Math.pow(a.x, 0.5);
        System.out.println("The square root of " + a.x + " is " + R);
    }
}
class Num
{
    int x;
}
class Slot6_p4
{
    public static void main(String args[])
    {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            System.out.print("Enter the no : ");
            Num a=new Num();
            a.x=Integer.parseInt(dis.readLine());
            Squareroot s=new Squareroot();
            s.test(a);
        }
        catch(IOException e){System.out.println(e);}
    }
}