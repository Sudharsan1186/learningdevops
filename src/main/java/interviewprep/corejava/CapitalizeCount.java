package interviewprep.corejava;

public class CapitalizeCount {

	public static void main(String[] args) {
		String text = "WelCome To AutoMation Testing";
		String trimTxt = text.replaceAll("\\s", "");
		int count = 0;
		for(int i = 0;i<trimTxt.length();i++) {
			if(trimTxt.charAt(i)>='A' && trimTxt.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
