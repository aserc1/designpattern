package com.zxl.designpattern.observerpattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayInner implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	public CurrentConditionsDisplayInner(Observable observable) {
		this.observable=observable;
		this.observable.addObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");

	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherDataInner){
			WeatherDataInner weatherData=(WeatherDataInner)o;
			this.temperature=weatherData.getTemperature();
			this.humidity=weatherData.getHumidity();
			display();
		}

	}

}
