import java.util.*;

public class INPUT {

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		
		//next() only take one word at a time.
		//Therefore we use nextLine() for one line input
		//String name = sc.next();	//It means the object we have created of scanner in which next is a function for taking input
		String name = sc.nextLine();
		//nextInt(), nextFloat()
		System.out.println(name);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		
		
	}

}
