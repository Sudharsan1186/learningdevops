package interviewprep.corejava;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hollo";
		
		if(str1.length() == str2.length()) {
			char[] str1Arr = str1.toCharArray();
			char[] str2Arr = str2.toCharArray();
			
			Arrays.sort(str1Arr);
			Arrays.sort(str2Arr);
			if(Arrays.equals(str1Arr, str2Arr)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not an Anagram");
			}
		}

	}

}
