package com.zxl.designpattern.strategypattern;

import org.junit.Test;

public class DuckTest {
	@Test
	public void test() throws Exception {
		Duck mallard = new MallarDuck();
		mallard.performQuack();
		mallard.performFly();
	}
}
