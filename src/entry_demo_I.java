import java.util.*;

public class entry_demo_I {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Enter your name, please");
		
		String username = entry.nextLine();
		
		System.out.println("Enter age, please");
		
		int age = entry.nextInt();
		
		System.out.println("Hello, " + username + ". The next year, you will be " + (age +1) + " year old.");
		entry.close();
	}

}
