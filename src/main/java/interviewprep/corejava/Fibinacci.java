package interviewprep.corejava;

public class Fibinacci {

	public static void main(String[] args) {
		int num = 10;
		
		int f = 0;
		int s =1;
		int temp = 0;
		System.out.println(f);
		System.out.println(s);
		
		for(int i=2;i<num;i++) {
			
			temp = f + s;
			f = s;
			System.out.println(temp);
			s= temp;
		}

	}

}
