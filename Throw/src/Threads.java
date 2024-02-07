
class Aa extends Thread
{
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println("hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
								e.printStackTrace();
			}		//waiting stage like for 10 seconds
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println("hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
								e.printStackTrace();
			}		//waiting stage like for 10 seconds
		}
	}
}

public class Threads {

	public static void main(String[] args) {
		
		Aa obj1 = new Aa();
		B obj2 = new B();
		
		obj2.setPriority(Thread.MAX_PRIORITY);		//Setting Priority
				
		obj1.start();
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
							e.printStackTrace();
		}		//waiting stage like for 10 seconds
		obj2.start();

	}

}
