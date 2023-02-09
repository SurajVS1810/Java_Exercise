import java.io.*;
import java.lang.*;
class Reverse
{
    public static int Fun1(int n)
    {
        int x=n;
        int reve=0;
        int rem;
        while(x!=0)
        {
            rem=x%10;
            reve=(reve*10)+rem;
            x=x/10;
        }
        return reve;
    }
    public static int Fun2(int y,int n)
    {
        if(y==n) return 1;
        else return 0;
    }
}
class IntPalin
{
    public static void main(String ars[])
    {
         DataInputStream dis=new DataInputStream(System.in);
         try
         {
            System.out.print("Enter the number to reversed : ");
            int n=Integer.parseInt(dis.readLine());
            Reverse r=new Reverse();
            int y=r.Fun1(n);
            System.out.println("Reverse of no = "+y);
            int z=r.Fun2(y,n);
            if(z==1) System.out.println("The "+y+" is palindrome");
            else  System.out.println("The "+y+" is not palindrome");
         }
        catch(IOException e){System.out.println(e);}
    }
}