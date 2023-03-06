//Implement the Producer- Consumer Problem, using Threads.
class item
{
int i ;
boolean produced = false;
synchronized void Produce( int x)
	{
	if(produced)
	try
	{wait();} catch (InterruptedException e){System.out.println(e);}
    i=x; // making
    System.out.println("Produced " +i);
    produced =true;
    notify();
}


 synchronized int Consume()
{
if(!produced)
try
	{wait();} catch (InterruptedException e){System.out.println(e);}
	System.out.println("Consumed " +i);
    produced =false;
    notify();
    return i;
}
}


class Producer extends Thread
{
	item q;
	Producer(item qq){q=qq;}
	public void run()
	{
		int i =0;
		while(true) q.Produce(i++);
	}
}

class Consumer extends Thread
{
	item q;
	Consumer(item qq){q=qq;}
	public void run()
	{
			while(true) q.Consume();
	}
}

class Slot9_p4
{
public static void main(String args[])
{
	item i = new item();
	Producer p = new Producer(i); p.start();
	Consumer c = new Consumer(i); c.start();
}
}
