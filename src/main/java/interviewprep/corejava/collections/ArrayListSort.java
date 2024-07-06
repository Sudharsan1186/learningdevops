package interviewprep.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("welcome");
		list.add("sweet");
		list.add("hello");
		list.add("home");
		list.add("people");
		list.addAll(Arrays.asList("Element 1", "Element 2", "Element 3"));
		// Add elements to the ArrayList
		ArrayList<String> list1 = new ArrayList<String>();
//		Collections.addAll(list1, "Element 1", "Element 2", "Element 3");
		Stream.of("Element 1", "Element 2", "Element 3").forEach(list::add);
		Comparator<String> customComparator = new Comparator<String>() {
		    public int compare(String s1, String s2) {
		        // Define custom comparison logic
		        return s1.compareTo(s2);
		    }
		};

		Collections.sort(list, customComparator);
		System.out.println(list);
		
//		WebElement dropdownElement = driver.findElement(By.id("dropdownId"));
//
//        // Create a Select object with the dropdown element
//        Select dropdown = new Select(dropdownElement);
//
//        // Select an option by visible text
//        dropdown.selectByVisibleText("Option 1");
//
//        // Select an option by value attribute
//        dropdown.selectByValue("value1");
//
//        // Select an option by index (0-based)
//        dropdown.selectByIndex(2);
//
//        // Get the selected option
//        WebElement selectedOption = dropdown.getFirstSelectedOption();
	}

}
