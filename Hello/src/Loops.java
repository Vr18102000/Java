import java.util.Scanner;

public class Loops 
{
	public static void main(String[] args) 
	{
		//for loop
		for(int count=1; count<11; count++)
		{
			System.out.println(count);
		}
		
		//while loop
		int i = 11;
		while(i < 21) {
			System.out.println(i);
			i = i+1;
		}
		
		//do-while loop it work atleast once
		int j =21;
		do {
			System.out.println(j);
			j = j+1;
		} while(j<31);
		
		//Print the sum of first n Natural numbers
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int k =0; k<n;k++)
		{
			sum = sum + k;
		}
		System.out.println(sum);
		
		//Printing Table of n integer
		for (int l =1; l<11;l++)
		{
			System.out.println(l*n);
		}
		
		//Printing all even numbers till n
		for
	}
}
