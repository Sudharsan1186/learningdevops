package interviewprep.concepts.comparable;

import java.util.Comparator;

public class SortComparator implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
//		return o1.getPrice()-o2.getPrice(); // for ascending order
//		return o2.getPrice()-o1.getPrice(); // for descending order
//		but above methods may create integer overflow/underflow so use
//		return Integer.compare(o1.getPrice(), o2.getPrice())
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
