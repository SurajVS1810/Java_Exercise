//2.Find the minimum of three numbers using a single statementimport java.io.*;
import java.io.*;
import java.lang.*;
class MinOneLine
{
    public static void main(String args[])
    {
        try
        {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("Enter 3 nos : ");
            int x=Integer.parseInt(dis.readLine());
            int y=Integer.parseInt(dis.readLine());
            int z=Integer.parseInt(dis.readLine());
            int max= ((x<=y) && (x<=z)) ? x : ((y<=z) ? y:z);
            System.out.println("Minimum = "+max);
        }
        catch(IOException e){System.out.println(e);}

    }
}