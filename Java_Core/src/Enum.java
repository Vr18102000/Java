
enum Status
{
	Running, Failed, Pending, Success;
}

public class Enum 
{

	public static void main(String[] args) {
		Status s = Status.Pending;
		System.out.println(s.getClass().getSuperclass());
		
		switch(s)		//Switch is good if we work for enum/constants
		{
		case Running:
				System.out.println("All Good");
			break;
		case Failed:
			System.out.println("Try Again");
			break;
		case Pending:
			System.out.println("Please Wait");
			break;
		case Success:
			System.out.println("Done");
		}
		
		if (s==Status.Running)
			System.out.println("All Good");
		else if(s==Status.Failed)
			System.out.println("Try Again");
		else if(s==Status.Pending)
			System.out.println("Please Wait");
		else
			System.out.println("Done");

	}

}
