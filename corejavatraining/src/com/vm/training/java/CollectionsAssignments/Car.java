package com.vm.training.java.CollectionsAssignments;

public class Car {
protected String make;
protected int yearmodel;
protected int speed;
public Car(int yearmodel) {
	super();
	this.yearmodel = yearmodel;
	this.speed=0;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public int getYearmodel() {
	return yearmodel;
}
public void setYearmodel(int yearmodel) {
	this.yearmodel = yearmodel;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}

public int Accelerate()
{
	return this.speed+=5;
}
public int Brake()
{
   return this.speed-=5;
}
public static void main(String[] args) {
	Car car=new Car(1965);
	car.setMake("Bat Mobile");
	System.out.println("Car Name :"+car.getMake());
	System.out.println("Built year :"+car.getYearmodel());
	System.out.println("Current Speed Of the car after accelerating :"+car.Accelerate());
	System.out.println("Current Speed Of the car after accelerating :"+car.Accelerate());
	System.out.println("Current Speed Of the car after accelerating :"+car.Accelerate());
	System.out.println("Current Speed Of the car after accelerating :"+car.Accelerate());
	System.out.println("Current Speed Of the car after accelerating :"+car.Accelerate());

	
    System.out.println("Current speed of the car after applying the brake :"+car.Brake());
    System.out.println("Current speed of the car after applying the brake :"+car.Brake());
    System.out.println("Current speed of the car after applying the brake :"+car.Brake());
    System.out.println("Current speed of the car after applying the brake :"+car.Brake());
    System.out.println("Current speed of the car aftte applying the brake :"+car.Brake());
    System.out.println("Current speed of the car aftte applying the brake :"+car.Brake());


    

}

}

