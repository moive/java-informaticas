import javax.swing.*;

public class entry_number {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Enter number");
		double num2 = Double.parseDouble(num1);
		
		System.out.print("The sqr of " + num2 + " is: ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
