package com.zxl.designpattern.observerpattern;

import org.junit.Test;

public class WeatherStationInnerTest {
	@Test
	public void test() {
		WeatherDataInner weatherData=new WeatherDataInner();
		CurrentConditionsDisplayInner currentDisplay=
				new CurrentConditionsDisplayInner(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
