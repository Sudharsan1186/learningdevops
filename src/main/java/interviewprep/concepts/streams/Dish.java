package interviewprep.concepts.streams;

public class Dish {
	private String dishName;
	private boolean isVeg;
	private int price;
	public Dish(String dishName, boolean isVeg, int price) {
		super();
		this.dishName = dishName;
		this.isVeg = isVeg;
		this.price = price;
	}
	public String getDishName() {
		return dishName;
	}
	public boolean isVeg() {
		return isVeg;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "dishName=" + dishName + ", isVeg=" + isVeg + ", price=" + price;
	};
	
}
