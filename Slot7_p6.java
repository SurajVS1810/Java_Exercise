//Write a program to calculate the value of nCr for given value of n & r, using packages.
import pack.*;
import java.util.*;
class Slot7_p6
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int n=sc.nextInt();
    System.out.print("Enter the value of r : ");
    int r=sc.nextInt();
    Comb c=new Comb();
    System.out.print("The nCr value of given no is : "+c.nCr(n,r));
    }
}