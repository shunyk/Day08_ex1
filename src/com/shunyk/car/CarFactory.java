package com.shunyk.car;

public class CarFactory {
	
	public void makeCar() {
		EngineAdd ea = new EngineAdd();
		WheelAdd wa = new WheelAdd();
		CarView cv = new CarView();
		ColorPaint cp = new ColorPaint();
		
		Car car = new Car();//메소드
		car = ea.setEngine(car);
		car = wa.setWheel(car);
		cp.setColor(car);//주소값이 같은 경우 return 생략 가능
		//cv.view(car);
		car.info("Blue");
		Car car2 = new Car();
		car2.color = "White";
		car2.info("Red");

	}
	
}
