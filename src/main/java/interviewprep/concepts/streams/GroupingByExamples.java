package interviewprep.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

class Employee {
	private String name;
	private int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
}
public class GroupingByExamples {

	public static void main(String[] args) {
		Employee e1 = new Employee("John", 38);
		Employee e2 = new Employee("Tim", 33);
		Employee e3 = new Employee("Andrew", 33);
		Employee e4 = new Employee("Peter", 38);
		Employee e5 = new Employee("Nathan", 22);
		Employee e6 = new Employee("George", 23);
		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6);
		Map<Integer, List<Employee>> employeesByAge = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
		 System.out.println(employeesByAge); 
		 
		 List<String> fruitNames = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		 Map<String, Long> result = fruitNames.stream()
			        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 System.out.println(result);

	}

}
