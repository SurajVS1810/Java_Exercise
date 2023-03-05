//Write a program to display the contents of a directory including its subdirectory content using recursive function.
import java.io.*;
import java.util.*;
class Slot10_p2
{
    static void listall(String p)
    {
        try
        {
            File f=new File(p);
            File[] fc=f.listFiles();
            for(File A:fc)
            {
                if(A.isFile())
                {
                    System.out.println("File: "+A);
                }
                else
                {
                    System.out.println("Directory: "+A);
                    listall(A.getAbsolutePath());
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        String fname;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the directory path to display its contents:");
        fname=sc.nextLine();
        System.out.println("Contents of the directory '"+fname+"' :-\n----------------------------");
        listall(fname);
    }
}