package jp.itacademy.samples.oop;

import jp.itacademy.samples.oop.car.Car;

public class Truck extends Car {
	
	public int getFuelCost() {
		return 5;
	}
	
	protected char getWheelRuts() {
		return '��';
	}
}
