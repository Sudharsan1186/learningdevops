package interviewprep.concepts.methodReference;

import java.util.function.Consumer;

public class InstanceExample {

	public void concat(String name) {
		System.out.println("Welcome " + name);
	}

	public static void main(String[] args) {
		InstanceExample insObj = new InstanceExample();
		Consumer<String> msg = insObj :: concat;
		msg.accept("Durga");
	}

}
