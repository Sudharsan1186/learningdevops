package interviewprep.corejava;

import java.util.LinkedList;

public class LinkedListInsertAtEnd {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Test1");
		list.add("Test2");
		
		list.add("Test3");
		list.add("Test4");
		list.add(2,"Last");
	
		System.out.println(list);
	}

}
