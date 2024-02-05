//Here we try to handle the runtime error or simply do not want execution to stop even if runtime error occur

public class SpecificException 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 2;
		
		int num[] = new int[5];
		
		try		//it try to execute the statement
		{
			j = 18/i;
			System.out.println(num[1]);
			System.out.println(num[5]);
		}
		catch(ArithmeticException e)		//if something is wrong, exception will throw catchblock
		{
			System.out.println("Cannot divide by zero.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Stay in your limit");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		System.out.println(j);
		System.out.println("Done");

	}

}
