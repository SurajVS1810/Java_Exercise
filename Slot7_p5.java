//Write a program to calculate the prime factors of a given number, using packages.
import java.util.*;
import pack.*;
class Slot7_p5
{
    public static void main(String args[])
    {
        int flag=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        Prime p= new Prime();
        p.factor(n);
    }
}
