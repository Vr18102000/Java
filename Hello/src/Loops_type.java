import java.util.Arrays;
import java.util.List;

public class Loops_type {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5,2,4,6,9,3);
		
//		for(int i=0; i<nums.size();i++)			//Normal for loop
//		{
//			System.out.println(nums.get(i));
//		}
//		
//		for(int n : nums)						//Advance for loop
//		{
//			System.out.println(n);
//		}

		nums.forEach(n -> System.out.println(n));		//forEach() method of ArrayList is used to perform a certain operation for each element in ArrayList.
	}

}
