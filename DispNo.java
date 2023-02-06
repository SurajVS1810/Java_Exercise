import java .io.*;
import java.lang.*;
class DispnNo
{
    public static void main(String args[])
    {
        DataInputStream dis=new DataInputStream(System.in);
        try 
        {
            System.out.print("Enter m : ");
            int m=Integer.parseInt(dis.readLine());
            System.out.print("Enter n : ");
            int n=Integer.parseInt(dis.readLine());
            while(m<=n)
            {
                System.out.print(m+" ");
                m++;
            }
        }
        catch(IOException e){System.out.println(e);}
    }
}