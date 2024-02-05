
// Same methods, different parameters

public class Overloading {

	//class Calculator
	//{
		public int add(int n1, int n2, int n3)
		{
			return n1+n2+n3;
		}
		
		//public int add(int n1, int n2)
		//{
		//	return n1+n2;
		//}
	//}
	
	public static void main(String[] args) 
	{
		//Calculator obj = new Calculator();
		int r1 = add(4,5,9);
		System.out.println(r1);
		//System.out.println(int r2 = obj.add(4,5));

	}

}
