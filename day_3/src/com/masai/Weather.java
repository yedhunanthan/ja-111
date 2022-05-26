package com.masai;

public class Weather {
	boolean isSnowing = false;
	boolean isRaining = true;
	double temperature = 60.0;
	void fn1() {
		if(isSnowing == false && isRaining == false && temperature <50) 
			System.out.println("Let’s stay home.");
		else
				System.out.println("Let’s go out!");
	}
	public static void main(String[] args) {
		Weather w1 = new Weather();
		w1.fn1();
	}
}
