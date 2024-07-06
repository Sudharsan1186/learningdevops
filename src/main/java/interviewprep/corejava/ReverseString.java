package interviewprep.corejava;


public class ReverseString {

	public static void main(String[] args) {
		String msg = "Welcome to Java Learning";
		String revMsg;
		
		StringBuilder str = new StringBuilder();
		str.append(msg);
		str.reverse();
		revMsg = str.toString();
		System.out.println(revMsg);
		
		char[] msgArr = msg.toCharArray();
		int index = 0;
		String reverse;
		for(int i = msg.length()-1;i>=0;i--) {
			msgArr[index++] = msg.charAt(i);
		}
		reverse = String.valueOf(msgArr);
		System.out.println(reverse);
	}

}
