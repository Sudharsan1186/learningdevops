package interviewprep.corejava;

public class ShortAndLongWord {

	public static void main(String[] args) {
		String sen = "Welcome to automation testing world";
		String[] words = sen.trim().split("\\s");
		String shortest = words[0];
		String longest = words[0];
		for(String word : words) {
			if(word.length()<shortest.length()) {
				shortest = word;
			}
			if(word.length()>longest.length()) {
				longest = word;
			}
		}
		System.out.println(shortest);
		System.out.println(longest);
	}

}
