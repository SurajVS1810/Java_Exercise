//WAP with nested functions to find the maximum of three numbers. Function1 should take in two arguments and find the maximum. Function2 should take in the third number and the maximum from function1 to find the maximum.
import java.io.*;
import java.lang.*;
class Max
{
    public static void Fun1(int a,int b)
    {
      int x=a>b?a:b;
      Fun2(x);
    }
    public static void Fun2(int x)
    {
        DataInputStream dis=new DataInputStream(System.in);
        try
        {
            System.out.print("Enter the third numbers : ");
            int c=Integer.parseInt(dis.readLine());
            int y=x>c?x:c;
            System.out.print("maximum : "+y);
        }
        catch(IOException e){System.out.println(e);}
    }
}
class NesMax
{
     public static void main(String args[])
    {
        DataInputStream dis=new DataInputStream(System.in);
        try
        {
            System.out.print("Enter the two numbers : ");
            int a=Integer.parseInt(dis.readLine());
            int b=Integer.parseInt(dis.readLine());
             Max m=new Max();
            m.Fun1(a,b);
            
        }
        catch(IOException e){System.out.println(e);}
    }
}