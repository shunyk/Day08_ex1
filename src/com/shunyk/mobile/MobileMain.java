package com.shunyk.mobile;

public class MobileMain {
	public static void main(String [] args) {
		PhoneView pv = new PhoneView();
		
		Phone phone = new Phone();
		
		pv.view(phone);
	}
}
