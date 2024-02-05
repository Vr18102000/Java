
class K
{
	public void show1()
	{
		System.out.println("in K Show");
	}
}
class L extends K
{
	public void show2()
	{
		System.out.println("in L Show");
	}
}

public class UpcastingDowncasting {

	public static void main(String[] args) 
	{
		K obj = (K)new L();		//Upcasting		//A obj:parent reference	//(K)newl() :child object
		obj.show1();
		
		L obj1 = (L)obj;		//Downcasting
		obj1.show2();

	}

}
