package interviewprep.corejava;

public class ReverseArray {

	public static void main(String[] args) {
		char[] charArr = {'e','t','i','f','s','v','k','a'};
		
		int left = 0;
		int right = charArr.length - 1;
		
		while(left<right) {
			char temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;
			left++;
			right--;
		}
		System.out.println(charArr);
	}

}
