package interviewprep.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Priya","Hari","Devi");
		Map<String,Integer> nameMap = names.stream().collect(Collectors.toMap(name->name,String::length));
		System.out.println(nameMap);
		
		Map<String,Integer> namesMap = names.stream().collect(Collectors.toMap(Function.identity(),String::length));
		System.out.println(nameMap);
	}

}
