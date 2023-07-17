
public class manipula_string_III {

	public static void main(String[] args) {
		String student1, student2, student3;
		
		student1 = "Moises";
		student2 = "Moises";
		student3 = "moises";
		
		boolean isEqual = student1.equals(student2);
		boolean isEqualIgnore = student1.equalsIgnoreCase(student3);
		
		System.out.println(isEqual);
		System.out.println(isEqualIgnore);
	}

}
