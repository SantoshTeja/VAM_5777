package com.vm.training.java.multithreading;

class Bottle
{
	synchronized void drink(int time)
	{
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}



class DrinkWater implements Runnable
{
	Bottle bottle=new Bottle();
	@Override
	public void run() {
		bottle.drink(6);
		// TODO Auto-generated method stub
		
	}
}
public class SynchronizationDemo {
	public static void main(String[] args) {
		
		DrinkWater drin=new DrinkWater();
		Thread teja=new Thread(drin);
		Thread santosh=new Thread(drin);
		Thread mani=new Thread(drin);
		Thread john=new Thread(drin);
		Thread mary=new Thread(drin);
		
		teja.setName("teja");
		santosh.setName("santosh");
		mani.setName("mani");
		john.setName("john");
		mary.setName("Mary");
		
		teja.start();
		santosh.start();
		mani.start();
		john.start();
		mary.start();
	}

}

