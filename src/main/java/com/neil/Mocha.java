package com.neil;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public double cost() {
		return 0.20 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

}
