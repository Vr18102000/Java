class Student
{
	int rollno;
	String name;
	int marks;
}


public class Array_of_objects 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "Vishal";
		s1.marks = 92;
		
		Student s2 = new Student();
		s2.rollno = 2;
		s2.name = "Maths_Geni";
		s2.marks = 79;

		Student s3 = new Student();
		s3.rollno = 3;
		s3.name = "Jenu";
		s3.marks = 94;
		
		Student students[] = new Student[3];
		students[0]= s1;
		students[1]= s2;
		students[2]= s3;
		
		for(int i=0; i<students.length; i++)
		{
			System.out.println(students[i].name + " : " + students[i].marks);
		}
		
		
		for(Student stud : students)		//Enhanced for loop for arrays and collection
		{
			System.out.println(stud.name + " : " + stud.marks);
		}
	
		
		
	}

}
