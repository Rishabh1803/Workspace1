package com.rk.popcorn;

public class Shopping {
	
	private Popcorn popcorn;
	public void buy(int choice) {
		Popcorn chocolate = new ChocolatePopcorn();
		Popcorn caramel = new CaramelPopcorn();
		Popcorn butter = new ButterPopcorn();
		switch(choice) {
		case 1:chocolate.pop();
		break;
		case 2:caramel.pop();
		break;
		case 3:butter.pop();
		break;
		}
	}
	public Popcorn getPopcorn() {
		return popcorn;
	}
	public void setPopcorn(Popcorn popcorn) {
		this.popcorn = popcorn;
	}
}