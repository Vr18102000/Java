//Here we try to handle the runtime error or simply do not want execution to stop even if runtime error occur

public class RuntimeError 
{
	public static void main(String[] args) 
	{
		int i = 2;
		int j = 2;
		
		try		//it try to execute the statement
		{
			j = 18/i;
		}
		catch(Exception e)		//if something is wrong, exception will throw catchblock
		{
			System.out.println("Something went wrong." + e);		//e show apart from exception other main issue
		}
		System.out.println(j);
		System.out.println("Done");

	}

}
