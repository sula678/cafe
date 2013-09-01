package com.neil;

public class starbuzzCoffee {
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}
