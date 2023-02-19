//WAP to find the factorial of n, using recursion.
import java.io.*;
import java.lang.*;
class Fact
{
   public static int rec(int n)
   {
        if(n>1)
        return n*rec(n-1);
        else 
        return 1;
   }
}
class FactNo
{
    public static void main(String args[])
    {
    DataInputStream dis = new DataInputStream(System.in);
    try
    {
    System.out.print("Enter n : ");
    int n = Integer.parseInt(dis.readLine());
    Fact f=new Fact();
    int x=f.rec(n);
    System.out.print("Factorial of no is "+x);
    }
    catch(IOException e){System.out.println(e);}
    }
}