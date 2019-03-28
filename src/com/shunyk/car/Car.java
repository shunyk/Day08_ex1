package com.shunyk.car;

public class Car {
	Engine engine;
	Wheel [] wheels;
	String color;
	
	public void info(String color) {
		System.out.println(color);
		System.out.println(this.color);
		info2(); //this 생략 가능
	}
	
	public void info2() {
		System.out.println("car~~~~~~~~");
	}
	
}
