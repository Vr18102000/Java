//class Z overrides class X
//In override method have same name, same parameter but different behavior
class X
{
	
	public void show() {
		
		System.out.println("in show");
		
	}
	public void config()
	{
		System.out.println("in X Config");
	}
}

class Z extends X
{
	public void show()
	{
		System.out.println("in Z Show");

	}
}

public class Overriding {

	public static void main(String[] args) {
		Z obj = new Z();
		obj.show();
		obj.config();

	}

}
