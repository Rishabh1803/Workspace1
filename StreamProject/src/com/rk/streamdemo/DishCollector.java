package com.rk.streamdemo;

import java.util.List;

public class DishCollector {
	public void collectVegetarianDish(List<Dish> list){
		list.stream().filter(dish -> dish.isVegetarian()).forEach(System.out::println);
	}
}
