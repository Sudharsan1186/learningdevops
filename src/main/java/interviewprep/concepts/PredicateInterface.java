package interviewprep.concepts;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		Predicate<Integer> UGScore = score -> score > 70;
		Predicate<Integer> PGScore = score -> score > 50;
		
		System.out.println(UGScore.and(PGScore).test(70));
		

	}

}
