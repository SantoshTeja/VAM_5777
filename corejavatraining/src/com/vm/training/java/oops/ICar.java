package com.vm.training.java.oops;

public abstract class ICar implements IVehicle{

	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Power Steering");
	}

	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("Automatic");
	}

	public void accelerator() {
		// TODO Auto-generated method stub
		System.out.println("high");
	}

	public void clutches() {
		// TODO Auto-generated method stub
		System.out.println("based on gears");
	}

	public int gears() {
		// TODO Auto-generated method stub
		return 5;
	}
	abstract void ac();
	abstract void indicators();

}
