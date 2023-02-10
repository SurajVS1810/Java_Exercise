//WAP to calculate sum of digits of a number (functions with argument and return type.)
import java.io.*;
import java.lang.*;
class SumDigit
{
    public static int digit(int n)
    {
        int sum=0,rem;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        DataInputStream dis=new DataInputStream(System.in);
        try
        {
            System.out.print("Enter the number : ");
            int n=Integer.parseInt(dis.readLine());
            int x=digit(n);
            System.out.println("Sum of the digits of the number :"+x);
        }
        catch(IOException e){System.out.println(e);}
    }
}