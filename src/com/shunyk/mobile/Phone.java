package com.shunyk.mobile;

public class Phone {
	
	String brand="SAMSUNG";
	int price;
	String color;
	int size;
	
	public Phone() {
		//디폴트 생성자, 빈 생성자, 기본 생성자
		//매개변수가 없는 생성자
		//클래스내에 생성자가 하나라도 없으면 
		//컴파일러가 디폴트 생성자를 하나 만들어줌
		this.brand = "LG";
		this.price = 200;
		this.color = "RED";
		this.size = 15;
		System.out.println("Phone 제작이 완료");
		this.info();
	}
	
	public void info() {
		System.out.println("Phone~~~~~~~~~~~~~~~~~~");
	}
}
