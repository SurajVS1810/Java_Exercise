//3.WAP to search for a given element in an array
import java.io.*;
import java.lang.*;
class Search
{
    public void sear(int a[],int n)
    {
        DataInputStream dis = new DataInputStream(System.in);
        int e,i;
        int flag = 0;
        System.out.println();
        System.out.print("Enter the element to be searched : ");
        try
        {
        e=Integer.parseInt(dis.readLine());
        for(i=0;i<n;i++)
         {
            if(a[i]==e)
            {
            flag=1;
            break;
            }
         }
         if(flag==1)
         System.out.println("The element "+e+"is found at "+i+"th position");
         else
         System.out.println("Not found");
        }
        catch(IOException d){System.out.println(d);}
    }
}
class SearArr
{
    public static void main(String args[])
    {
        DataInputStream dis = new DataInputStream(System.in);
        try
        {
            int a[],i;
            System.out.print("Enter the size of the array : ");
            int n=Integer.parseInt(dis.readLine());
            a = new int[n];
            System.out.println("Enter the elements of array : ");
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(dis.readLine());
            }
            System.out.println("Array elements");
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
            Search s=new Search();
            s.sear(a,n);
        }
        catch(IOException e){System.out.println(e);}
    }
}