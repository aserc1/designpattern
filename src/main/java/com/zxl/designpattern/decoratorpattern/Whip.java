package com.zxl.designpattern.decoratorpattern;

public class Whip extends Condiment {
	Beverage beverage;
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.4;
	}

}
