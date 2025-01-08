package com.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla(int energy) {
		super(energy);
	}
	public Gorilla() {}
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something \n Energy: " +this.setEnergy(this.getEnergy()-5));
	}
	
	public void eatBananas() {
		System.out.println("The gorilla eats Banana \n Energy: " +this.setEnergy(this.getEnergy()+10));
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree \n Energy: " +this.setEnergy(this.getEnergy()-10));
	}
		
	

}
