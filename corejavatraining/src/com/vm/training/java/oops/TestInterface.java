package com.vm.training.java.oops;

public class TestInterface {
	public static void main(String[] args) {
		IVehicle vehicle=new IBus();
		vehicle.accelerator();
		vehicle.brakes();
		vehicle.clutches();
		vehicle.gears();
		vehicle.steering();
		
		ICar car=new BMW();
		car.ac();
		car.accelerator();
		car.brakes();
		car.clutches();
		car.gears();
		car.indicators();
		car.steering();

		}

}
