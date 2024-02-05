//Calling AdvCalc class here
// Single inheritance: AdvCalc inheritance Calc class by extends, check AdvCalc.java for detail
//Multilevel inheritance: SciCalc class

//import Cal.SciCalc;		//import SciCalc class from other package/folder

import Cal.*;			//* is use to import all files in Cal folder/package not the folders

public class Inheritance 
{

	public static void main(String[] args) 
	{
		SciCalc obj = new SciCalc();
		int r1 = obj.add(4,  5);
		int r2 = obj.sub(10, 5);
		int r3 = obj.mult(10, 5);
		int r4 = obj.div(10, 5);
		double r5 = obj.power(2, 5);
		System.out.println(r1 + ", " + r2 + ", " + r3 + ", " + r4);
		System.out.println(r5);

	}

}
