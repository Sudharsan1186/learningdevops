package interviewprep.concepts;

import java.util.function.Function;

public class FunctionInterface {
	
	public void usage() {
		Function<Integer,Double> usdToInr = usd -> usd * 81.5;
		System.out.println(usdToInr.apply(20));
	}

	public static void main(String[] args) {
		FunctionInterface fn = new FunctionInterface();
		fn.usage();

	}

}
