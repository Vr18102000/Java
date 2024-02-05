@FunctionalInterface		//are the interface which only has one method
interface Aaa	
{
	void show(int i);
}


public class Lambda 
{

	public static void main(String[] args) 
	{
		/*Aaa obj = new Aa()			// anonymous enum method
		{
		public void show(int i)
			{
			System.out.println("in show " + i);
			}
		};
		obj.show(6);			//call the method
	*/
		
		
		Aaa obj = i ->	System.out.println("in show " + i);		// () ->, lambda expression
				obj.show(6);			//call the method

	}

}
