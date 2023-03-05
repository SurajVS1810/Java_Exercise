//Write a program to search for a given file name in a directory (including its subdirectory) content.
import java.io.*;
import java.util.Scanner;
class Slot10_p3
{
public static void main(String[] args)
{
System.out.println("Enter path of directory");
Scanner sc=new Scanner(System.in);
String folder_path=sc.next();
File folder=new File(folder_path);
if(folder.exists())
{
System.out.println("Enter file path");

String file_path=sc.next();
File filename=new File(file_path);
if(filename.exists())
{
System.out.println("file found");
}
else{
System.out.println("file not found");
}
}
else
{

System.out.println("Directory not found");
}
}
}