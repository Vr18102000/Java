//Here we try to handle the runtime error or simply do not want execution to stop even if runtime error occur

class VishalException extends Exception		//Creating custom exception
{
	public VishalException(String string)
	{
		super(string);		//calling string from superclass
	}
}

public class Throw
{
	public static void main(String[] args) 
	{
		int i = 20;
		int j = 0;
		
		try		//it try to execute the statement
		{
			j = 18/i;
			if(j==0)
				//throw new ArithmeticException("Numerator should be greater than denominator");	//we throw exception here
				throw new VishalException("Numerator should be greater than denominator");
		}
		
		//catch(ArithmeticException e)		//if something is wrong, exception will throw catchblock
		catch(VishalException e)
		{
			j=18/1;
			System.out.println("Cannot divide by zero " + e);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		System.out.println(j);
		System.out.println("Done");

	}

}
