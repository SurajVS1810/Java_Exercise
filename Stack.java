import java.io.*;
import java.lang.*;
class operation
{
    public int push(int a[],int p,int n,int top)
    {
        if(top!=n-1)
        {
        top++;
        a[top]=p;
        }
        else{System.out.println("Stack is full");}
        return top;
    }

    public int pop(int a[],int n,int top)
    {
        if(top!=-1)
        {
        System.out.println(a[top]);
        top--;
        }
        else{System.out.println("Stack is full");}
        return top;
    }

    public void peek(int a[],int n,int top)
    {
        if(top!=-1)
        {
        System.out.print(a[top]);
        }
        else{System.out.println("Stack is empty");}
    }
}
class disp
{
   public disp(int a[],int n,int top)
    {
        int i=0;
        for(i=0;i<=top;i++)
        {
        System.out.print(a[i]+" ");
        }
    }
}
class Stack
{
    public static void main(String args[])
    {
        DataInputStream dis=new DataInputStream(System.in);
        try
        {
        operation o=new operation();
        int a[];
        System.out.print("Enter the size of the array : ");
        int n=Integer.parseInt(dis.readLine());
        a=new int[n];
        int top=-1;
        int ch;
        do{     
        {
            System.out.println();
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Quit");
            System.out.print("Enter the choice : ");
            ch=Integer.parseInt(dis.readLine());
            switch(ch){
            case 1:
            System.out.print("Enter the no to be pushed : ");
            int p=Integer.parseInt(dis.readLine());
            top=o.push(a,p,n,top);
            break;
            case 2:
            top=o.pop(a,n,top);
            break;
            case 3:
            o.peek(a,n,top);
            break;
            case 4:
            disp d=new disp(a,n,top);
            break;
            }
        }
        }while(ch!=5);
        }
        catch(IOException e){System.out.println(e);}
    }
}