//WAP to display even numbers upto ‘n’ using a static function.
import java.io.*;
import java.lang.*;
class Slot5_p1
{
    static void disp(int n)
    {
        for(int i=2;i<=n;i=i*2)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String args[])
    {
        try
        {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.print("Enter the no : ");
        int n=Integer.parseInt(dis.readLine());
        disp(n);
        }
        catch(IOException e){System.out.println(e);}
    }
}