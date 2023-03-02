//Create a class for Cstring having a string data member and provide functions for read , display, compare(return Boolean value),add and concatenate.
import java.util.*;
class Cstring
{
    String str;
    void read(Cstring s)
    {
        Scanner sc=new Scanner(System.in);
        s.str=sc.nextLine();
    }
    void display(Cstring s)
    {
        System.out.println(s.str);
    }
    boolean compare(Cstring s)
    {
        if(((this.str).compareTo(s.str))==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void concatenate(Cstring s)
    {
        System.out.println((this.str).concat(s.str));
    }
}
class Slot7_p1
{
    public static void main(String args[])
    {
        Cstring s1=new Cstring();
        Cstring s2=new Cstring();
        int ch;
        boolean res;
        do
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("\nString Operations\n******************************\n");
            System.out.println("1.Read \n2.Display \n3.Compare \n4.Concatenate \n5.Exit");
            System.out.println("\nEnter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                        System.out.println("\n--------------------------------\nEnter first string:");
                        s1.read(s1);
                        System.out.println("Enter second string:");
                        s1.read(s2);
                        System.out.println("--------------------------------\n");
                        break;
                case 2:
                        System.out.println("\n--------------------------------\nString 1: ");
                        s1.display(s1);
                        System.out.println("String 2: ");
                        s2.display(s2);
                        System.out.println("--------------------------------\n");
                        break;
                case 3:
                        System.out.print("\n--------------------------------\nComparing 2 strings:\n");
                        res=s1.compare(s2);
                        if(res==true)
                        {
                            System.out.println(s1.str+" is equal to "+s2.str);
                        }
                        else
                        {
                            System.out.println(s1.str+" is not equal to "+s2.str);
                        }
                        System.out.println("--------------------------------\n");
                        break;
                case 4:
                        System.out.println("\n--------------------------------\nConcatenating 2 strings:");
                        s1.concatenate(s2);
                        System.out.println("--------------------------------\n");
                        break;
                case 5:
                        break;
                default:
                        System.out.println("\n--------------------------------Enter a valid choice...........--------------------------------\n");
                        break;
            }
        }while(ch!=5);
    }
}