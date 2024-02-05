
enum Lap
{
	Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1000);
	
	private int price;
	
	private Lap(int price) 		//private parameterized constructor
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
}

public class EnumClass {

	public static void main(String[] args) {
		//Lap lap = Lap.Macbook;
		//System.out.println(lap + " : " + lap.getPrice());

		for(Lap lap : Lap.values())
		{
			System.out.println(lap + " : " + lap.getPrice());
		}
	}

}
