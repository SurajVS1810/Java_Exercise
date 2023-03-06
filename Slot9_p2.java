//Write a program to implement threads by implementing the Runnable interface.
class ThreadInterface implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}
class Slot9_p2
{
    public static void main(String[] args)
    {
        ThreadInterface m=new ThreadInterface();
        Thread t1=new Thread(m);
        t1.start();
    }
}