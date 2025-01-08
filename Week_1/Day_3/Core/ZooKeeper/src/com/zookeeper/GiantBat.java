package com.zookeeper;

public class GiantBat extends Mammal {

	//Overload Constructor
	public GiantBat(int energy) {
		super(energy);
		  
	}
	
	//Public Constructor
	public GiantBat() {}
	

	public void fly() {
		System.out.println("The bat is airborne \n Energy: " +this.setEnergy(this.getEnergy()-50));
	}
	
	public void eatHumans(){
		System.out.println("The bat has eat a human \n Energy: " +this.setEnergy(this.getEnergy()+25));
	}
	
	public void attackTown(){
		System.out.println("The bat has attacked a town \n Energy: " +this.setEnergy(this.getEnergy()-100));
	}
}
