//Read numbers into an array. Perform validations using multiple catch statements / predefined Exceptions.
import java.util.*;
public class Slot8_p1 {  
  
    public static void main(String[] args) {  
          
           try{    
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter th size of array : ");
                int n=sc.nextInt();
                int a[]=new int[n];    
                for(int i=0;i<n-1;i++){
                    System.out.print("Enter a["+i+"] : ");
                    a[i]=sc.nextInt();
                }  
                a[n-1]=30/0;
                a[n+1]=20;
               }    
                 catch(ArithmeticException e1)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }
               catch(ArrayIndexOutOfBoundsException e2)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }     
    }  
} 