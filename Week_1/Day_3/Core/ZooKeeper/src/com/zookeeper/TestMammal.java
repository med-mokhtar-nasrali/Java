package com.zookeeper;

public class TestMammal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create instance from Mammal
		Mammal animal1 = new Mammal();
		
		//Test display energy method
		animal1.displayEnergy();
		
		//Create instance of Gorilla
		Gorilla gorilla1 = new Gorilla();
		
		//Test throwSomething Method
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		
		//Test eating method
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		
		//Test climbing method
		gorilla1.climb();;
		
		//Gorilla Energy
		System.out.println("Gorilla Energy:");
		gorilla1.displayEnergy();
		
		//Create instance of GiantBat
		GiantBat bat = new GiantBat(300);
		
		//Test Fly method
		bat.fly();
		bat.fly();
		
		//Test the eat method
		bat.eatHumans();
		bat.eatHumans();
		
		//Test attack method
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		
		System.out.println("Bat Energy:");
		bat.displayEnergy();
		
	}

}
