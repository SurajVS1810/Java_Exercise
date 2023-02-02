//4.WAP to sort elements in an array in ascending order
import java.io.*;
import java.lang.*;
class Sort
{
    public void sor(int a[],int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        System.out.println();
        System.out.println("After sort Array elements");
         for(i=0;i<n;i++)
          {
            System.out.print(a[i]+" ");
          }
    }
}
class ArrSort
{
    public static void main(String args[])
    {
        int a[],n,i,j;
        DataInputStream dis=new DataInputStream(System.in);
        try
        {
        System.out.print("Enter the size of array : ");
        n=Integer.parseInt(dis.readLine());
        a=new int[n];
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
          Sort s=new Sort();
          s.sor(a,n);
        }
        catch(IOException e){System.out.println(e);}
    }

}