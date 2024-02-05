
class Person			//Always private intense variable. It can only be access directly by me and no one else
{
	private int age;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int a)
	{
		age = a;
	}
}


public class Encapsulation 
{

	public static void main(String[] args) 
	{
		Person obj = new Person();
		obj.setAge(23);
		System.out.println(" : "+ obj.getAge());

	}

}
