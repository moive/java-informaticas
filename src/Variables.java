
public class Variables {
	public static void main(String[] args) {
		//Variables.getAmount();
		//Variables.convertCentimetersToInches();
		Variables.mathSqrt();
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
}
