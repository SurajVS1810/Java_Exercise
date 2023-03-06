//Write a program to implement Synchronization using inter-thread communication.
class First
{
    synchronized public void disp(String msg)
    {
        System.out.print("["+msg);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.print("]");
        System.out.println();
    }
}
class Second extends Thread
{
    First ff;
    String ss;
    Second(First f,String s)
    {
        ff=f;
        ss=s;
    }
    public void run()
    {
        ff.disp(ss);
    }
}
class Slot9_p3
{
    public static void main(String args[])
    {
        First fnew=new First();
        Second s1=new Second(fnew,"Apple");
        s1.start();
        Second s2=new Second(fnew,"Orange");
        s2.start();
        Second s3=new Second(fnew,"Grapes");
        s3.start();
    }
}