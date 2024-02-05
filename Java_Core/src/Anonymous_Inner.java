
/*class Ab
{
	public void show()
	{
		System.out.println("in Ab Show");
	}
}

public class Anonymous_Inner 
{

	public static void main(String[] args) 
	{
		Ab obj = new Ab()	//Anonymous Inner
		{
			public void show()
			{
				System.out.println("in new Show");
			}
		};
		obj.show();

	}

}*/

//Abstract and Anonymous Inner Class

abstract class Ab
{
	public abstract void show();
}

public class Anonymous_Inner 
{

	public static void main(String[] args) 
	{
		Ab obj = new Ab()	//Anonymous Inner
		{
			public void show()
			{
				System.out.println("in new Show");
			}
		};
		obj.show();

	}

}




