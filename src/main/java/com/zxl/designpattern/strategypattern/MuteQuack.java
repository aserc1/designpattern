package com.zxl.designpattern.strategypattern;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<<Slience>>");

	}

}
