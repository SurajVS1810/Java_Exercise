//Write a program to implement a Generic method, which can display the elements of various arrays of different data types, and find the length of each array.
import java.io.*;
class Slot11_p2
{
    public static <Gen> void disp(Gen[] a)
    {
        int count=0;
        for (Gen elem:a)
        {
            System.out.println(elem);
            count++;
        }
        System.out.println("Number of elements: "+count);
    }
    public static void main(String args[])
    {
        Integer ai[]={1,2,3,4};
        Double af[]={1.2,2.3,4.7,7.9,5.1};
        String as[]={"ab","yz","gh"};
        System.out.println("Elements of integer array :-");
        disp(ai);
        System.out.println("Elements of double array :-");
        disp(af);
        System.out.println("Elements of string array :-");
        disp(as);
    }
}