package com.rk.streamdemo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		DishCollector collect = new DishCollector();
		List<Dish> list = new ArrayList<Dish>();
		list.add(new Dish("Meat",false,300));
		list.add(new Dish("Egg",false,150));
		list.add(new Dish("Dal",true,100));
		list.add(new Dish("Rice",true,120));
		collect.collectVegetarianDish(list);

	}

}
