import javax.swing.*;

public class factorial {

	public static void main(String[] args) {
		int result = 1;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
		
		for (int i = num; i > 0; i--) {
			result = result * i;
		}
		
		System.out.println("The factorial of " + num + " is: " + result);
		
	}

}
