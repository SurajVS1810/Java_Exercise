// WAP to calculate sum of n even numbers (functions with no argument and return type.)
import java.io.*;
import java.lang.*;
class Even
{
    public static void sum()
    {
        DataInputStream dis=new DataInputStream(System.in);
        try
        {
            System.out.print("Enter the value of n : ");
            int n=Integer.parseInt(dis.readLine());
            int i,s=0;
            int m=2*n;
            for(i=2;i<=m;i=i+2)
            {
                s=s+i;
                System.out.print(i+" ");
            }
            System.out.println();
             System.out.println("Sum of the even nos : "+s);
        }
        catch(IOException e){System.out.println(e);}
    }
}
class EvenSum
{
    public static void main(String args[])
    {
        Even e=new Even();
        e.sum();
        
    }
}