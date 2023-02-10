import java.io.*;
import java.lang.*;
class MethOver
{
    public static void AP(int l,int b)
    {
         int i=l*b;
         System.out.println();
         System.out.print("Area = "+i);
        int j=2*(l+b);
        System.out.println();
         System.out.print("Perimeter = "+j);
         System.out.println();
    }
    public static void AP(double l,double b)
    {
        double i=l*b;
        System.out.println();
         System.out.print("Area = "+i);
        double j=2*(l+b);
        System.out.println();
         System.out.print("Perimeter = "+j);
         System.out.println();
    }
    public static void AP(double l,int b)
    {
         double i=l*b;
         System.out.println();
         System.out.print("Area = "+i);
        double j=2*(l+b);
        System.out.println();
         System.out.print("Perimeter = "+j);
         System.out.println();
    }
    public static void AP(int l,double b)
    {
         double i=l*b;
         System.out.println();
         System.out.print("Area = "+i);
        double j=2*(l+b);
        System.out.println();
         System.out.print("Perimeter = "+j);
         System.out.println();
    }
}
class Rectangle
{
    public static void main(String args[])
    {
        DataInputStream dis=new DataInputStream(System.in);
            MethOver m=new MethOver();
            m.AP(5,4);
            m.AP(5.4,4);
            m.AP(5,4.33);
            m.AP(5.5,4.22);
    }
}