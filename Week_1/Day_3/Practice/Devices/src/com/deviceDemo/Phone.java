package com.deviceDemo;

public class Phone extends Device{

	public void call() {
		System.out.println("You are calling \n Battery remaining: " +this.setBattery(this.getBattery()-5)+"%");
	}
	
	public void playGame() {
		System.out.println("You play a game \n Battery remaining: " + this.setBattery(this.getBattery()-20)+"%");
	}
	
	public void charge() {
		System.out.println("Phone is charging \n" + this.setBattery(this.getBattery()+50)+"%");
	}
}
