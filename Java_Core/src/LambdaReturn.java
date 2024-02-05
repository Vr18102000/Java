@FunctionalInterface		//are the interface which only has one method
interface Ad	
{
	int add(int i, int j);
}


public class LambdaReturn 
{

	public static void main(String[] args) 
	{
		/*Ad obj = new Ad()			// anonymous enum method
		{
		public int add(int i, int j)
			{
				return i+j;
			}
		};
		int result = obj.add(10, 4);
		System.out.println(result);
			
		*/
		
		Ad obj = (int i, int j) ->	i+j;		// () ->, lambda expression
		int result = obj.add(10, 4);			//call the method
		System.out.println(result);					
	}

}
