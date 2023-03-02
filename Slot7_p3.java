/*Write a program to create a menu driven program for performing the following operations.
•        Length of a given string
•        Compare for equality
•        Extract a substring from a string.
•        Convert to uppercase and lowercase*/
import java.util.Scanner;
class Slot7_p3
{
    public static Scanner sc = new Scanner(System.in);
    public static void substr(String str)
    {
        int beg,end,length=str.length();
        do
        {
            System.out.println("Enter Beginning : ");
            beg=sc.nextInt();
            System.out.println("Enter End : ");
            end=sc.nextInt();
            if(beg<0 || end>length)
            System.out.println("!Invalid Values!");
        }while(beg<0 || end>length);
        System.out.println(str.substring(beg,end));
    }
    public static void main(String[] args) 
    {
        String str,str1;
        int ch;
        System.out.println("Enter String : ");
        str=sc.nextLine();
        do
        {
            System.out.print("String Functions\n1.Length\n2.Compare\n3.Substring\n4.To Uppercase\n5.To Lowercase\n6.Exit\nEnter Option : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1 :
                        System.out.println("String Length : " + str.length());
                        break;
                case 2 :
                        System.out.println("Enter Second String : ");
                        str1=sc.next();
                        if(str.equals(str1))
                        System.out.println("Strings are SAME");
                        else
                        System.out.println("...Strings are not same...");
                        break;
                case 3 :
                        substr(str);
                        break;
                case 4 :
                        System.out.println(str.toUpperCase());
                        break;
                case 5 :
                        System.out.println(str.toLowerCase());
                        break;
                case 6 :
                        System.out.println("...Exiting...");
                        break;
                default :
                        System.out.println("!Invalid Choice!");
                        break;
            }
        }while(ch!=6);
    }
}