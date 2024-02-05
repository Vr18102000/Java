//Multilevel inheritance happening here.
//In AdvCalc it extends to or inheritance Calc part

package Cal;		//moving file into a folder/package Cal


public class SciCalc extends AdvCalc
{
	public double power(int n1, int n2)
	{
		return Math.pow(n1,n2);
	}

}
