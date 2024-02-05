//Every constructor has a method, which is hidden, super();. By default every constructor has first statement super();
//Every class in java extends an object class.
//this() call the constructor of same class.

class A extends Object		//(extends Object remain hidden)			//Super-class
{
	public A()			//Default Constructor
	{
		System.out.println("int A");
	}
	public A(int n)		//Parameterized Constructor
	{
		System.out.println("in A int");
	}
}

class B extends A		//Sub-class
{
	public B()			//Default constructor
	{
		super();		//Call the constructor of a super-class (default one)
		System.out.println("int B");
	}
	public B(int n)		//Parameterized Constructor
	{
		super(5);		//Call the parameterized constructor of a super-class (parameterized one)
		System.out.println("in B int");
	}
}

public class This_Super {

	public static void main(String[] args) 
	{
		B obj = new B();

	}

}
