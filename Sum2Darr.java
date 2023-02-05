//5.Write a program to print the row wise and column wise sum of a 2D array.
import java.io.*;
import java.lang.*;
class Sum2Darr
{
    public static void main(String args[])
    {
        int a[][],i,j;
        DataInputStream dis= new DataInputStream(System.in);
        try
        {
            System.out.print("Enter the size of row of arr : ");
            int r=Integer.parseInt(dis.readLine());
            System.out.print("Enter the size of column of arr : ");
            int c=Integer.parseInt(dis.readLine());
            a=new int[r][c];
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print("a["+i+"]["+j+"] = ");
                    a[i][j]=Integer.parseInt(dis.readLine());
                }
            }
            int rs[],cs[],rowsum,colsum;
            rs=new int[r];
            cs=new int[c];
            for(i=0;i<r;i++)
            {
                rowsum=0;
                for(j=0;j<c;j++)
                {
                    rowsum=rowsum+a[i][j];
                }
                rs[i]=rowsum;
            }
            for(j=0;j<c;j++)
            {
                colsum=0;
                for(i=0;i<r;i++)
                {
                    colsum=colsum+a[i][j];
                }
                cs[j]=colsum;
            }
            System.out.println("Array elements and their corrsponding sum are : ");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.print(" | "+rs[i]);
                System.out.println();
            }
            System.out.println("__________");
            for(j=0;j<c;j++)
            {
                System.out.print(cs[j]+" ");
            }
        }
        catch(IOException e){System.out.println(e);}
    }
}
