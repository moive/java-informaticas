import javax.swing.*;

public class entry_demo_II {

	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Enter your name");
		String age_string = JOptionPane.showInputDialog("Enter your age");
		
		int age = Integer.parseInt(age_string);
		age ++;
		
		System.out.println("Hi, " + username + ", you will be " + age + " years old.");
	}

}
