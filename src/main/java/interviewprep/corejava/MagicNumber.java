package interviewprep.corejava;

import java.util.ArrayList;
import java.util.Collections;

public class MagicNumber {

	public static void main(String[] args) {
		int num = 1081;
		int sum = 0;
		System.out.println(num);
		while((num>0) || (sum>9)) {
			if(num == 0) {
				num = sum;
				sum = 0;
			}
			sum = sum + (num%10);
			num = num/10;	
		}
		System.out.println(sum);
		if(sum == 1) {
			System.out.println("Magic Number");
		}
}

}
