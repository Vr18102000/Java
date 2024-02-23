import java.util.Objects;

//class Alien {
//	private final int id;
//	private final String name;
//	
//	public Alien(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String toString() {
//		return "Alien [id=" + id + ", name=" + name + "]";
//	}
//
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Alien other = (Alien) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//
//}

record Alien (int id, String name) {}		//Default Constructor //Converted above code to a single line


public class Record_classes {

	public static void main(String[] args) {
		
		Alien a1 = new Alien(1, "Vishal");
		Alien a2 = new Alien(1, "Vishal");
		
		
		
		System.out.println(a1.equals(a2));	//comparing the values
		System.out.println(a1);

	}

}
