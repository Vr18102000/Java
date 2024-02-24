package Codes;

import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//Printing rectangle
		for(int i =0; i<a; i++) {
			for(int j = 0; j<b; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Printing hollow rectangle
		for(int i =1; i<=a; i++) {
			for(int j = 1; j<=b; j++) {
				if(i==1 || j==1 || i==a || j==b) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//Printing half triangle
		for(int k =1; k<=a; k++) {
			for(int l = 1; l<=k; l++) {
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Printing half triangle reverse
		for(int i =a; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Printing Inverted half triangle reverse
		for(int i =1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) {
					System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//Printing half pyramid with numbers
		for(int i =1; i<=a; i++) {
			for(int j=1; j<=i; j++)	{
					System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Printing Inverted half pyramid with numbers
		for(int i=a; i>=1; i--) {
			for(int j=1; j<=i; j++) {
					System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Printing Floyd's Triangle
		int num=1;
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num++;	
			}
			System.out.println();
		}
		System.out.println();
		
		//Printing 0-1 Triangle
		for(int i=0; i<=a; i++) {
			for(int j=0; j<=i; j++) {
				if((i+j)%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Printing Rhombus
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//Print a number pyramid
		for(int i =1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) {
					System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
					System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Print a palindromic number pyramid
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a-i; j++ ) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		//Butterfly Pattern
		//upper-half
		for(int i =1; i<=a; i++) {
			for(int j=1; j<=i; j++) {		//1st part
				System.out.print("*");
			}
			int space = 2*(a-i);
			for(int j=1;j<=space;j++) {		//space
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {		//2nd part
				System.out.print("*");
			}
			System.out.println();
		}		
		//lower-half
		for(int i =a; i>=1; i--) {
			for(int j=1; j<=i; j++) {		//1st part
				System.out.print("*");
			}
			int space = 2*(a-i);
			for(int j=1;j<=space;j++) {		//space
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {		//2nd part
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();
		
		//Printing Diamond Pattern
		//1st-half
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) {		//for space
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd-half
		for(int i=a; i>=1; i--) {
			for(int j=1; j<=a-i; j++) {		//for space
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	

}
