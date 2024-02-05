
class A{
	public void show() throws ClassNotFoundException
	{
		Class.forName("Calc");
	}
	
}
public class DuckingThrow {

	static{
		System.out.println("Class done");
	}
	
	public static void main(String[] args) {
		A obj = new A();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	//Print entire stack
		}
		
	}

}
