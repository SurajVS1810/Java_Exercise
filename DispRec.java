//WAP to display numbers from n to 1 and vice versa, using recursion.
import java.io.*;
import java.lang.*;
class  Rec
{
    public static void disp(int n,int i)
    {
      
        if(n!=0)
        {
        System.out.print(n+" ");
        System.out.println(i+" ");
        i++;
        disp(n-1,i);
        }
    }
}
class DispRec
{
    public static void main(String args[])
    {
        DataInputStream dis=new DataInputStream(System.in);
        try
        {
            System.out.print("Enter the value n : ");
            int n=Integer.parseInt(dis.readLine());
            Rec r=new Rec();
            r.disp(n,1);
        }
        catch(IOException e){System.out.println(e);}
    }
}