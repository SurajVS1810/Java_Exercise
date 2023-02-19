//WAP to calculate area of a circle (functions with no argument and no return type.)
import java.io.*;
import java.lang.*;
class Area
{
    public static void cal()
    {
         DataInputStream dis=new DataInputStream(System.in);
         try
         {
            System.out.print("Enter the radius of the circle : ");
            double r=Integer.parseInt(dis.readLine());
            double Area=3.14*r*r;
            System.out.println("Area of the circle = "+Area);
         }
        catch(IOException e){System.out.println(e);}
        
    }

}
class AreaCircle
{
    public static void main(String ars[])
    {
        Area a=new Area();
        a.cal();
    }
}