package interviewprep.corejava;

public class PerfectSquare {

	public static void main(String[] args) {
		int num = 64;
		
		for(int i=1;i*i<=num;i++) {
			if((num%i == 0) && (num/i == i)) {
				System.out.println("perfect square");
			}
		}

	}

}
