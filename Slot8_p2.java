// Write a program to implement a user defined Exception, which will throw an Exception when a given number is prime.
import java.util.Scanner;
import java.lang.*;
class SurajException extends Exception
{
    public SurajException(String msg){
        super(msg);
    }
}
class Slot8_p2
{
    public static void main(String[] args)
    {
        try {
            int flag=0,i;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number : ");
            int n=sc.nextInt();
            if (n == 0 || n == 1)
            flag = 1;
            for (i = 2; i < n/2 ; ++i) {
            // if n is divisible by i, then n is not prime
            // change flag to 1 for non-prime number
             if (n % i == 0) {
            flag = 1;
            break;
             }
          }
          if(flag==1){
            System.out.println("The no is not prime");
          }
          if(flag==0) throw new SurajException("The no is prime");
        } catch (SurajException e) {
            System.out.println("Caught SurajException");
            System.out.println(e);
        }
    }
}