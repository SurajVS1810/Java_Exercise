//2.Find the minimum of three numbers using a single statementimport java.io.*;
import java.lang.*;

class MaxOneLine
{
    public static void main(String args[])
    {
        DataInputStream dis = new DataInputStream(System.in);
        try
        {
            System.out.println("Enter 3 nos : ");
            int x=Integer.parseInt(dis.readLine());
            int y=Integer.parseInt(dis.readLine());
            int z=Integer.parseInt(dis.readLine());
            int max= ((x>=y) && (x>=z)) ? x : ((y>=z) ? y:z);
            System.out.println("max = "+max);
        }
        catch(IOException e){System.out.println(e);}

    }
}