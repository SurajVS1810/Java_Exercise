//Write a program to implement throw and finally.
import java.util.*;
class SurajException extends Exception{
    public SurajException(String msg){
        super(msg);
    }
}
class Slot8_p3
{
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter th no : ");
            int n=sc.nextInt();
            if(n%2==0) throw new  SurajException("The no is even ");
            else System.out.println("The no is odd");
        }catch(SurajException e)
        {
            System.out.println("Caught Exception");
            System.out.println(e);
        }
        finally{
            System.out.println("The exception happens when the no is even");
        }
    }
}