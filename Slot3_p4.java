//   WAP to find the sum of 1+2/2!+3/3!+4/4!++n/n! using a single for loop.
import java.io.*;
class test
{
    public void sum(int n)
    {
        float i,pro=1,sum=0;
        for(i=1;i<=n;i++)
        {
            pro=pro*i;
            sum=sum+(i/pro);
        }
        System.out.println("Sum of the series = "+sum);
    }
}
public class Slot3_p4
{
    public static void main(String[] args) {
        try
        {
            System.out.println("Sum of the series 1+2/2!+3/3!+..................+n/n!");
            DataInputStream dis=new DataInputStream(System.in);
            int n;
            System.out.println("Enter N:");
            n=Integer.parseInt(dis.readLine());
            test t=new test();
            t.sum(n);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}