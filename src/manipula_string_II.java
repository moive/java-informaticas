
public class manipula_string_II {

	public static void main(String[] args) {
		String phrase = "Today is a great day to learn to program in Java";
		String resString = "learn to program in Java";
		int posLearn = phrase.indexOf(resString);
		String summary_phrase = phrase.substring(posLearn);
		// System.out.println(posLearn);
		System.out.println(summary_phrase);

	}

}
