package interviewprep.corejava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String[] stringArray = { "One", "Two", "Three", "Four" };
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, stringArray);
		System.out.println(list);
	}

}
