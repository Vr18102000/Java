import java.util.Scanner;

class Switch
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		float a = sc.nextInt();
		float b = sc.nextInt();
		System.out.println("Please enter the number for the operation you want to perform");
		System.out.println("1. +  2. -  3. *  4. /  5. %");
		int button = sc.nextInt();
		
		switch(button) {
		case 1 : System.out.println(a+b);
		break;
		case 2 : System.out.println(a-b);
		break;
		case 3 : System.out.println(a*b);
		break;
		case 4 : System.out.println(a/b);
		break;
		case 5 : System.out.println(a%b);
		break;
		}
	
	}
}