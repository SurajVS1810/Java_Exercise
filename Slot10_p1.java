//Write a program to display the contents of a directory by displaying the subdirectory’s name first, then the file names.
import java.io.*;
class Slot10_p1
{
    public static void main(String[] args)
    {
        File fo=new File("D:\\javarecord\\slot 7");
        File[] file_contents=fo.listFiles();
        File[] subdir_contents=fo.listFiles();
        //--display subdirectory names---------------
        System.out.println("---------Subdirectory names list----------");
        for(File object: subdir_contents)
        {
            if(object.isDirectory())
            {
                System.out.println("name of subdirectory is "+object.getName());
            }
        }
        //---display file names-----------------------------
        System.out.println("---------file names list----------");
        for(File object: file_contents)
        {
            if(object.isFile())
            {
                System.out.println("name of file is "+object.getName());
            }
        }
    }
}