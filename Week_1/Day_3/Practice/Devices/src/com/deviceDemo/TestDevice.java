package com.deviceDemo;

public class TestDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Device device1 = new Device();
		 device1.displayBattery();
	
		Phone phone1 = new Phone(); 
		
		//3 phone calls
		phone1.call();
		phone1.call();
		phone1.call();
		
		//Play game twice
		phone1.playGame();
		phone1.playGame();
		
		//charge the phone
		phone1.charge();
	}
}
