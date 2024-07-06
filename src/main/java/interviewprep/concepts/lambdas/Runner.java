package interviewprep.concepts.lambdas;

public class Runner {

	public static void main(String[] args) {
		
//		Car car = () -> System.out.println("Lambda exp");
//		car.start();
		
		Car car = (num1,num2) -> num1 + num2;
		System.out.println(car.add(23, 78));
	}

}
