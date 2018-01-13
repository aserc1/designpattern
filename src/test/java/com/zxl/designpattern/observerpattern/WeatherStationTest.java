package com.zxl.designpattern.observerpattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherStationTest {

	@Test
	public void test() {
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay currentDisplay=
				new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
