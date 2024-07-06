package interviewprep.concepts.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapLearning {

	public static void main(String[] args) {
		List<String> basket1 = Arrays.asList("Apples","Banana","Orange");
		List<String> basket2 = Arrays.asList("Grapes","Pear");
		List<String> basket3 = Arrays.asList("Guava","Chickoo","PineApple","PomeGranate");
		
		List<List<String>> fruitBaskets = new ArrayList<List<String>>();
		Collections.addAll(fruitBaskets, basket1,basket2,basket3);
		
		List<String> fruitList = fruitBaskets.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());	
System.out.println(fruitList);
}
}
