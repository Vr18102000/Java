

class D
{
	public void show()
	{
		System.out.println("in D Show");	
	}
}
class E extends D
{
	public void show()
	{
		System.out.println("in E Show");	
	}
}
class F extends E
{
	public void show()
	{
		System.out.println("in F Show");	
	}
}

public class Dynamic_Method {

	public static void main(String[] args) //Dynamic method Despatch, which method it will call we don't know. Only work when we have inheritance.
	{
		//D obj = new E();		//we can reference child(E) by parent(D)
		D obj = new D();
		obj.show();
		
		obj = new E();
		obj.show();
		
		obj = new F();
		obj.show();
		
	}

}
