import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>
{
	int age;
	String name;
	public Students(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Students [age=" + age + ", name=" + name + "]";
	}

	
	public int compareTo(Students that) {			//Comparable
		
		if(this.age > that.age)
			return 1;
		else
			return -1;
	}
	
}


public class Sorting_Cam_Com {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(47);
		nums.add(66);
		nums.add(12);
		nums.add(78);
		nums.add(51);
		
		Comparator<Integer> com = new Comparator<Integer>()		//Comparator is an interface to do sorting with own rules
			{									//anonymous class
				public int compare(Integer i, Integer j)
				{
					if(i%10 > j%10)
						return 1;
					else
						return -1;
				}
			};
			
			Collections.sort(nums, com);			//sorting
		
		List<Students> studs = new ArrayList<>();
		studs.add(new Students(24, "Vishal"));
		studs.add(new Students(22, "Jenu"));
		studs.add(new Students(26, "Rakh"));
		studs.add(new Students(20, "Vish"));
		studs.add(new Students(27, "Visha"));
				
		Comparator<Students> coms = new Comparator<Students>()		//Comparator is an interface to do sorting with own rules
				{									//anonymous class
					public int compare(Students i, Students j)
					{
						if(i.age > j.age)
							return 1;
						else
							return -1;
					}
				};
		
				Collections.sort(studs);			//sorting	
			
		
		
		System.out.println(nums);
		for(Students s : studs)
			System.out.println(s);
		
	}

}
