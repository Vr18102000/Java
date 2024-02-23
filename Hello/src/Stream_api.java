import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_api {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5,2,4,6,9,3);
		
//		Stream<Integer> s1 = nums.stream();
//		Stream<Integer> s2 = s1.filter(n -> n%2==0);
//		Stream<Integer> s3 = s2.map(n -> n*2);
//		int result = s3.reduce(0, (c,e) -> c+e);
		
//		s1.forEach(n -> System.out.println(n));
//		s2.forEach(n -> System.out.println(n));
//		s3.forEach(n -> System.out.println(n));
		
		int result= nums.stream()
							.filter(n -> n%2==0)			//It need an object of predicate, which is a interface which return a boolean value after filtering
							.map(n -> n*2)					//It need an object of function, which is an interface, it accept two types, and have apply method 
							.reduce(0, (c,e) -> c+e);		//Takes two parameter,and extends bifunction, which has a method called apply
						
		Stream<Integer> sortedValues = nums.stream()
				.filter(n -> n%2==0)
				.sorted();
		
//		Stream<Integer> sortedValues = nums.parallelStream()		//For multi-threading
//				.filter(n -> n%2==0);
		

		System.out.println(result);
		sortedValues.forEach(n -> System.out.println(n));
	}

}
