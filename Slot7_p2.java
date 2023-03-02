//Write a program to implement object cloning for the class Distance which has inch and feet as data membersimport java.io.*;
import java.lang.*;
import java.io.*;
import java.util.*;
class Distance
{
    int foot;
    int inch;
    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("Distance is cloned");
            return this;
        }
    }
}
class Slot7_p2
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Scanner sc=new Scanner(System.in);
        Distance h1= new Distance();
        System.out.println();
        System.out.println("Enter distance details ");
        System.out.print("Enter foot : ");
        h1.foot=sc.nextInt();
        System.out.print("Enter inch : ");
        h1.inch=sc.nextInt();
        Distance h2=(Distance)h1.clone();
        System.out.println("The height is "+h1.foot+" foot and "+h1.inch+" inches");
        System.out.println("The cloned height is "+h2.foot+" foot and "+h2.inch+" inches");
    }
}