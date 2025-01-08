package com.zookeeper;

public class Mammal {
	private int energy = 100;

	//Overload Constructor
	public Mammal(int energy) {
		this.energy = energy;
	}
	
	//Public Constructor
	public Mammal() {}
	
	
	public void displayEnergy() {
		System.out.println(String.format("Energy: %s", this.getEnergy()));
	}

	//Setter & Getters
	public int getEnergy() {
		return energy;
	}

	public int setEnergy(int energy) {
		return this.energy = energy;
	}
	
}
