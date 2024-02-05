//Child class

package Cal;		//moving file into a folder/package Cal

public class AdvCalc  extends Calc
{
	public int mult(int n1, int n2)		//we create this public so that we can access it from outside of the folder/package
	{
		return n1 * n2;
	}
	public int div(int n1, int n2)
	{
		return n1/n2;
	}
}
