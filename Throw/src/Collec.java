import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Collec {

	public static void main(String[] args) {
		/*Collection<Integer> nums = new ArrayList<Integer>();
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		
		for(int n : nums)
		{
			System.out.println(n);
		}
		*/
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		
		System.out.println(nums.indexOf(5));		//To find index number of the value
		
		System.out.println(nums.get(2));			//To get value of index number 2
	
		
		Set<Integer> num = new HashSet<Integer>();	//Collection of unique values, and not catch index values
		num.add(4);
		num.add(8);
		num.add(8);
		num.add(3);
		num.add(1);
		
		for(int m : num)
		{
			System.out.println(m);
		}
		
		
		Set<Integer> num1 = new TreeSet<Integer>();	//It sort the collection
		num1.add(48);
		num1.add(60);
		num1.add(62);
		num1.add(42);
		
		for(int m : num1)
		{
			System.out.println(m);
		}
		
		Iterator<Integer> values = num1.iterator();
		while(values.hasNext())			//creating a loop, which will run by checking whether next values is available or not
			System.out.println(values.next());
		
	}

}
