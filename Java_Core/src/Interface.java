
interface Computer		//interface is same as abstract
{
	void code();
}

class Laptop implements Computer		//implements is used instead on extends
{
	public void code()
	{
		System.out.println("code, compile, run");
	}
}

class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run, faster");
	}
}

class Developer
{
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Interface 
{

	public static void main(String[] args) 
	{
		Computer lap = new Laptop();
		Computer desk = new Desktop();
		
		Developer Vishal = new Developer();
		Vishal.devApp(lap);

	}

}
