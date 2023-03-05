//Write a menu driven program to demonstrate Random Access File handling, with options for creating, deleting, writing, appending and reading the file.
import java.io.*;
import java.util.Scanner;
class Slot11_p1
{
    public static void main(String[] args) throws Exception
    {
        int ch;
        boolean bool = false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file : ");
        String a=sc.nextLine();
        do
        {
            System.out.println("\n1.Creating file\n2.Writing to file\n3.Append to file\n4.Read from file\n5.Close file\n6.Exit\nEnter your choice\n");

            ch=sc.nextInt();
            switch (ch) 
            {
                case 1:

                    RandomAccessFile file =new RandomAccessFile(a,"rw");
                    break;
                case 2:
                    RandomAccessFile file1 =new RandomAccessFile(a,"rw");
                    file1.writeBytes("\nHi everyone");
                    System.out.println("successfully written");
                    break;
                case 3:
                    RandomAccessFile file2 =new RandomAccessFile(a,"rw");
                    file2.seek(file2.length());
                    file2.writeBytes("\nhello world");
                    break;
                case 4:
                    RandomAccessFile file3 =new RandomAccessFile(a,"rw");
                    file3.seek(0);
                    byte[] bytes=new byte[30];
                    file3.read(bytes);
                    System.out.println(new String(bytes));
                    break;
                case 5:
                	RandomAccessFile file4 = new RandomAccessFile(a,"r");
                	file4.close();
                	System.out.println("File closed ");
                	break;
                case 6:
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }

        }while(ch!=6);
        sc.close();
    }
}
