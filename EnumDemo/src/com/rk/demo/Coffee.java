package com.rk.demo;

public enum Coffee {
	MOCHA(200,200,"YEMEN"), LATTE(150,100,"ITALY"), EXPRESSO(100,200,"ITALY"), DEFAULT(0,0,null);
	
	private double price;
	private int quantity;
	private String origin;
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getOrigin() {
		return origin;
	}
	private Coffee(double price, int quantity, String origin) {
		this.price = price;
		this.quantity = quantity;
		this.origin = origin;
	}
	public void display() {
		System.out.println("Coffee Name: "+this.toString() + " Coffee");
		System.out.println("Origin: "+origin);
		System.out.println("Price: "+price);
		System.out.format("Quantity: "+quantity+" ml\n");
	}
}
