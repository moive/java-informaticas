import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClassWork {

	public static void main(String[] args) {
		//inputOuputData();
		//inputOutputJOptionPane();
		inputOutputNumber();
	}
	
	public static void inputOuputData() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name, please");
		
		String user_name = input.nextLine();
		
		System.out.println("Enter age, please");
		
		int age = input.nextInt();
		
		System.out.println("Hi " + user_name + ". The next year you will be " + (age + 1) + " years old");
		
	}
	
	public static void inputOutputJOptionPane() {
		String username = JOptionPane.showInputDialog("Enter name");
		
		String strAge = JOptionPane.showInputDialog("Enter age");
		
		int age = Integer.parseInt(strAge);
		age ++;
		
		System.out.println("Hello, " + username + ". Next year you will be " + age + " years old.");
	}
	
	public static void inputOutputNumber() {
		String strNumber = JOptionPane.showInputDialog("Enter a number");
		
		double numb = Double.parseDouble(strNumber);
		
		System.out.print("Sqrt of " + numb + " is ");
		System.out.printf("%1.4f", Math.sqrt(numb));
	}

}
