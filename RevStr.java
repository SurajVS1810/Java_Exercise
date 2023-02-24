//  Write a program to reverse a string
import java.util.*;
class Reverse
{
    void rev(String s)
    {
        int i,j;
      

        for(i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        
    }
}
class RevStr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Reverse r=new Reverse();
        System.out.println();
        System.out.print("Enter the string : ");
        String s=sc.nextLine();
        r.rev(s);
    }
}