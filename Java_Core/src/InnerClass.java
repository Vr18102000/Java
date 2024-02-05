
class Aa
{
	int age;		//variable
	
	public void show()		//method
	{
		System.out.println("in show");
	}
	
	class Bb		//Dependent on class A, Inner class
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) 
	{
		Aa obj = new Aa();
		obj.show();
		
		Aa.Bb obj1 = obj.new Bb();		//Creating obj of inner class
		obj1.config();

	}

}
