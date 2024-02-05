
abstract class Car
{
	public abstract void drive();	//declaring a method or giving an abstract method
	
	public void playMusic()
	{
		System.out.println("play music");
	}
}

class WagonR extends Car		//Concrete class
{
	public void drive()
	{
		System.out.println("Driving");
	}
}


public class Abstract {

	public static void main(String[] args) 
	{
		Car obj = new WagonR();
		obj.drive();
		obj.playMusic();

	}

}
