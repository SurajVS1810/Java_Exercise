//2.WAP to display two numbers received as command line argument, and print its product
import java.io.*;
import java.lang.*;
class ComLine
{
    public static void main(String args[])
    {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = i*j;
        System.out.println("product of "+i+" and "+j+" is " +k);
    }
}