package interviewprep.concepts.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceLearning {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(2,4,6,2,1,6);
		int total = numberList.stream().reduce(0, (sum,elements) -> sum + elements);
		System.out.println(total);
		Optional<Integer> tot =numberList.stream().reduce((sum,elements) -> sum + elements);
		Optional<Integer> max =numberList.stream().max(Comparator.comparing(num->num));
		System.out.println(max.get());
		Optional<Integer> maxNum =numberList.stream().reduce(Integer::max);
		System.out.println(maxNum);
		
		List<Integer> list =numberList.stream().collect(Collectors.toCollection(LinkedList<Integer>::new));
	}

}
