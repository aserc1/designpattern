package com.zxl.designpattern.decoratorpattern;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class StarbuzzCoffee {

	@Test
	public void test1() {
		Beverage beverage=new Espresso();
		System.out.println(beverage.getDescription()+" : $"+beverage.cost());
		TestCase.assertEquals(1.99, beverage.cost(), 0.01);	
	}
	@Test
	public void test2(){
		Beverage beverage=new HouseBlend();
		beverage=new Soy(beverage);
		beverage=new Mocha(beverage);
		beverage=new Whip(beverage);
		System.out.println(beverage.getDescription()+" : $"+beverage.cost());
		TestCase.assertEquals(1.79, beverage.cost(),0.01);
	}

}
