package com.rk.circularcheck;

import com.rk.wiley.Power;

public class CircularNumber {

	private int number;
	private boolean circular;

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isCircular() {
		checkCircular();
		return circular;
	}

	public void checkCircular() {
		Power power = new Power();
		int unit = number % 10;
		int temp1 = number * unit;
		int numberTemp = number / 10;
		int numberOfDigits = String.valueOf(numberTemp).length();
		power.setBase(10);
		power.setExponential(numberOfDigits);
		int temp2 = unit * power.getResult() + numberTemp;
		if (temp2 == temp1)
			circular = true;
	}

}
