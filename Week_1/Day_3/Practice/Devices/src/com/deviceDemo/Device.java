package com.deviceDemo;

public class Device {
	int battery = 100;

	
	
	public Device(int battery) {
		this.battery = battery;
	}

	public Device() {
	}
	
	public void displayBattery() {
		System.out.println(String.format("Battery: %s", this.battery)+"%");
	}
	
	//Getter & Setters
	public int getBattery() {
		return battery;
	}

	public int setBattery(int battery) {
		return this.battery = battery;
	}
	
	
	

}
