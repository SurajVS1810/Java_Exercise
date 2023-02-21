import java.io.*;
import java.lang.*;
class Swap
{
    public void test(float n1,float n2)
    {
        float c=n1;
        n1=n2;
        n2=c;
        System.out.println("After swap n1 : "+n1+", n2 : "+n2);
    }
}
class Slot6_p3
{
    public static void main(String args[])
    {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            System.out.print("Enter the nos : ");
            float n1=Float.parseFloat(dis.readLine());
            float n2=Float.parseFloat(dis.readLine());
            System.out.println("Before swap n1 : "+n1+", n2 : "+n2);
            Swap s=new Swap();
            s.test(n1,n2);
        }
        catch(IOException e){System.out.println(e);}
    }
}