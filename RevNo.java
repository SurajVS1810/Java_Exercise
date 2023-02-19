//WAP to reverse a number (functions with argument and no return type.)
import java.io.*;
import java.lang.*;
class Reverse
{
    public static void rev(int n)
    {
        int reve=0;
        int rem;
        while(n!=0)
        {
            rem=n%10;
            reve=(reve*10)+rem;
            n=n/10;
        }
        System.out.println("Reverse of no = "+reve);
    }

}
class RevNo
{
    public static void main(String ars[])
    {
         DataInputStream dis=new DataInputStream(System.in);
         try
         {
            System.out.print("Enter the number to reversed : ");
            int n=Integer.parseInt(dis.readLine());
            Reverse r=new Reverse();
            r.rev(n);
         }
        catch(IOException e){System.out.println(e);}
    }
}