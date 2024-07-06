package interviewprep.concepts.comparable;

public class Mobile implements Comparable<Mobile>{

	private Brand brand;
	private String model;
	private int price;
	public enum Brand {
		APPLE,NOKIA,SAMSUNG,LG
	}
	public Mobile(Brand brand, String model, int price) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public Brand getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getPrice() {
		return price;
	}
	@Override
	public int compareTo(Mobile mobile) {
		if(this.getPrice()>mobile.getPrice()) {
			return 1;
		} else if(this.getPrice()<mobile.getPrice()) {
			return -1;
		} else
			return 0;
	}
	
	
}
