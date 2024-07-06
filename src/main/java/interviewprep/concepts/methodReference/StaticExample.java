package interviewprep.concepts.methodReference;

import java.util.function.BiFunction;
import java.util.function.IntFunction;

public class StaticExample {

	public static int sum(int num1,int num2) {
		return num1 + num2;
	}
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add = StaticExample :: sum;
		System.out.println(add.apply(3, 6));  
	}

}
