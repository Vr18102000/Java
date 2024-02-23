import java.util.HashMap;
import java.util.Map;

public class Mapp {

	public static void main(String[] args) {
		Map<String, Integer> students = new HashMap<>();
		
		students.put("Vishal", 88);
		students.put("Jenu", 93);
		students.put("Rakhecha", 83);
		students.put("Jenu", 80);		//Keys cannot be repeated. Therefore, Jenu will only print once
		
		
		System.out.println(students);
		System.out.println(students.get("Vishal"));
		System.out.println(students.keySet());
		
		for(String key : students.keySet())
		{
			System.out.println(key + " : " + students.get(key));
		}
	}

}
