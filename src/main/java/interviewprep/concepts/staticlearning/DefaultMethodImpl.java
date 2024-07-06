package interviewprep.concepts.staticlearning;

public class DefaultMethodImpl implements Browser,Window{

	public static void main(String[] args) {
		DefaultMethodImpl.get();
		Browser.get();

	}
	public static void get() {
		System.out.println("class get");
	}

	@Override
	public void playMedia() {
		// TODO Auto-generated method stub
		Window.super.playMedia();
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		
	}

}
