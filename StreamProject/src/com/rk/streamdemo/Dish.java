package com.rk.streamdemo;

public class Dish {
	private String name;
	private boolean vegetarian;
	public Dish() {
		
	}
	public Dish(String name, boolean vegetarian, int calorie) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calorie = calorie;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetarian=" + vegetarian + ", calorie=" + calorie + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	private int calorie;
}
