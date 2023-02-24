//WAP to find the sum of the series 1+(1+2)+(1+2+3)+............ +(1+2+3+…+n) using a single while loop.
import java.io.*;
import java.lang.*;
class SumSeries
{
    public void sum(int n)
    {
        
    }
} 
class Slot3_p3
{
    public static void main(String args[])
    {
        try
        {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("Enter the value of n : ");
            int n= Integer.parseInt(dis.readLine());
            SumSeries s= new SumSeries();
            s.sum(n);
        }catch(IOException e){System.out.println(e);}
    }
}