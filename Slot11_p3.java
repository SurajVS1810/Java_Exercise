//Write a program to implement a Generic class, and display the types of various parameters passed.
import java.io.*;
import java.util.*;
class Genericclass <T1,T2>
{
public void disp(T1 v1,T2 v2)
{
System.out.println("\nVar1 is "+v1+" of type "+v1.getClass());
System.out.println("Var2 is "+v2+" of type "+v2.getClass());
}

}
class Slot11_p3
{
    public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Genericclass<String,Integer> ob1 = new Genericclass<String,Integer>();
Genericclass<String,Float> ob2 = new Genericclass<String,Float>();
Genericclass<String,Double> ob3 = new Genericclass<String,Double>();
System.out.print("Enter a string value for ob1: ");
String str1 = sc.nextLine();
System.out.print("Enter an integer value for ob1: ");
Integer i = Integer.parseInt(sc.nextLine());
ob1.disp(str1,i);
System.out.print("\nEnter a string value for ob2: ");
String str2 = sc.nextLine();

System.out.print("Enter a float value for ob1: ");
Float f = Float.parseFloat(sc.nextLine());
ob2.disp(str2,f);
System.out.print("\nHEnter a string value for ob3: ");
String str3 = sc.nextLine();
System.out.print("Enter an double value for ob3: ");
Double d = Double.parseDouble(sc.nextLine());
ob3.disp(str3,d);
}
}