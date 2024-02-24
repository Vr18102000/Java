import java.util.*;

public class Ifelseif 
{

	public static void main(String[] args) 
	{
//		int x = 15;
//		int y = 12;
//		int z = 9;
//		
//		if (x>y && x>z)
//			System.out.println(x);
//		else if (y>z)
//			System.out.println(y);
//		else
//			System.out.println(z);
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > y)
		{
			System.out.println("X is greater than Y");
		}
		else if(y > x)	{
			System.out.println("Y is greater than X");
		}
		else {
			System.out.println("Both are equal");
		}
		
	}

}
