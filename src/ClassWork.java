import java.util.Scanner;

public class ClassWork {

	public static void main(String[] args) {
		inputOuputData();
	}
	
	public static void inputOuputData() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name, please");
		
		String user_name = input.nextLine();
		
		System.out.println("Enter age, please");
		
		int age = input.nextInt();
		
		System.out.println("Hi " + user_name + ". The next year you will be " + (age + 1) + " years old");
		
	}

}
