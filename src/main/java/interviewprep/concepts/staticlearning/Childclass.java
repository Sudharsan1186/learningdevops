package interviewprep.concepts.staticlearning;

public class Childclass extends Baseclass{

	public static void main(String[] args) {
		Baseclass b = new Childclass();
		b.show();
		Childclass c = new Childclass();
		c.show();
	}
	public static void show() {
		System.out.println("Childclass Show");
	}

}
