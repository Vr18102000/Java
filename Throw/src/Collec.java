import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
	}

}
