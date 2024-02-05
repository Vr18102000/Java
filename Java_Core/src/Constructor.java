
class Person
{
	private int age;
	private String name;
	
	public Person()		//Default constructor
	{
		age = 23;
		name = "Vishal";
	}
	
	public Person(String name)		//Parameterized Constructor
	{
		this.age = 21;
		this.name = name;
	}
	
	public Person(int age, String name)		//Parameterized Constructor
	{
		this.age = age;
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
}


public class Constructor {

	public static void main(String[] args) 
	{
		Person obj = new Person();
		Person obj1 = new Person("Vishal");
		Person obj2 = new Person(20, "Vishal");
		System.out.println(obj.getName() + " : " + obj.getAge());
		System.out.println(obj1.getName() + " : " + obj1.getAge());
		System.out.println(obj2.getName() + " : " + obj2.getAge());
		
	}

}
