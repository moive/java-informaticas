
public class Variables {
	public static void main(String[] args) {
		//Variables.getAmount();
		//Variables.convertCentimetersToInches();
		//Variables.mathSqrt();
		
		//mathRound();
		mathPow();
	}
	
	private static void getAmount() {
		int cost = 11;
		int discount = 2;
		
		float amount = Float.intBitsToFloat(cost) / Float.intBitsToFloat(discount);
		// amount ++;
		System.out.println(amount);
	}
	
	private static void convertCentimetersToInches() {
		final double inche = 2.54;
		
		double cm = 6;
		
		double result = cm/inche;
		
		System.out.println("In " + cm + " cm there is " + result + " inches.");
	}
	
	private static void mathSqrt() {
		double sqrt = Math.sqrt(9);
		System.out.println(sqrt);
	}
	
	private static void mathRound() {
		float num1 = 5.45f;		
		int result = Math.round(num1);
		System.out.println("The num1 rounded is: " + result);
		
		final double PI = Math.PI;
		int roundPI = (int)Math.round(PI);
		System.out.println("The number PI rounded is: " + roundPI);
	}
	
	private static void mathPow() {
		int base = 7;
		int exponent = 3;
		
		int result = (int)Math.pow(base, exponent);
		
		System.out.println("The power of " + base + " raised to the exponent " + exponent + " is " + result);
	}
}
