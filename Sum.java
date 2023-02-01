//3.WAP to read two numbers and display the output in the form of ‘Sum of 2 and 3 is 5
import java.io.*;
import java.lang.*;
class Sum
{
    public static void main(String args[])
    {
        int x;
        int y;
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter the nos : ");
            x=Integer.parseInt(dis.readLine());
            y=Integer.parseInt(dis.readLine());
            int z=x+y;
            System.out.println("Sum of "+x+" and "+y+" is "+z);
        }
        catch(IOException e){System.out.println(e);}
    }
}