package com.vm.training.java.multithreading;

class Employee extends Thread
{
	public void run()
	{
		System.out.println("this is run method");
	}
	
}
class Student implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
			System.out.println("this is run method");
		
	}
	
}
public class CreateDemo {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.start();
	
	Student st=new Student();
	Thread th=new Thread(st);
	}
}
