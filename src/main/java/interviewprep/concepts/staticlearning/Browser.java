package interviewprep.concepts.staticlearning;

public interface Browser {

	void browse();
	default void playMedia() {
		System.out.println("Browser");
	}
	public static void get() {
		System.out.println("Browser interface");
	}
}
