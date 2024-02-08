class Counter
{
	int count;
	public synchronized  void increment()	//synchronized means one thread wait while other run, or it two or more threads to run at same time
	{
		count++;
	}
}

public class Race_condition {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		
		Runnable obj1 = () ->
		{
			for(int i=1; i<=10000;i++)
			{
				c.increment();
			}
		};
		Runnable obj2 = () ->
		{
			for(int i=1; i<=10000;i++)
			{
				c.increment();		
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();		//wait for the other thread to come back and join
		t2.join();

		System.out.println(c.count);
	}

}
