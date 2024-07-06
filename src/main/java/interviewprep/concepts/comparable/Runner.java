package interviewprep.concepts.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interviewprep.concepts.comparable.Mobile.Brand;

public class Runner {

	public static void main(String[] args) {
		Mobile m1 = new Mobile(Brand.APPLE,"13 Pro Max",1300);
		Mobile m2 = new Mobile(Brand.APPLE,"14 Pro Max",2100);
		Mobile m3 = new Mobile(Brand.SAMSUNG,"Galaxy A12",1000);
		Mobile m4 = new Mobile(Brand.NOKIA,"G10",800);
		Mobile m5 = new Mobile(Brand.NOKIA,"5.3",600);
		
		List<Mobile> mobileList = new ArrayList<Mobile>();
		Collections.addAll(mobileList, m1,m2,m3,m4,m5);
		Collections.sort(mobileList); //for comparable interface
		for(Mobile mobile : mobileList) {
			System.out.println(mobile.getBrand() + " " + mobile.getPrice());
		}
		System.out.println("-------------------------------------");
		Collections.sort(mobileList,new SortComparator());
		for(Mobile mobile : mobileList) {
			System.out.println(mobile.getBrand() + " " + mobile.getPrice());
		}
	}

}
