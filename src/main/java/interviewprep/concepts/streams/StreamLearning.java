package interviewprep.concepts.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamLearning {

	public static void main(String[] args) {
		Dish d1 = new Dish("Chicken 65",false,200);
		Dish d2 = new Dish("Panneer Pakoda",true,150);
		Dish d3 = new Dish("Mutton Briyani",false,300);
		Dish d4 = new Dish("Fish fry",false,250);
		Dish d5 = new Dish("Gobi manchurian",true,180);
		
		List<Dish> menu = new ArrayList<Dish>();
		Collections.addAll(menu, d1,d2,d3,d4,d5);
		
		long nonVegCount = menu.stream().filter(dish->dish.isVeg() == false).count();
		System.out.println(nonVegCount);
		Optional<Dish> d = menu.stream().filter(dish->dish.isVeg() == false).max(Comparator.comparingInt(Dish :: getPrice));
		System.out.println(d.get().getDishName());
		
		List<String> vegItems = menu.stream().filter(Dish :: isVeg).map(dish -> dish.getDishName())
				.collect(Collectors.toList());
		System.out.println(vegItems);
		
	menu.stream().filter(Dish :: isVeg).map(dish -> dish.getDishName()).limit(1)
	.forEach(name-> System.out.println(name));
			menu.stream().map(Dish :: getDishName).forEach(System.out :: println);
	}

}
