package com.vm.training.java.newfeatures;

interface Validate
{
	void validateLogin();
}

class Car
{
	void myLogin()
	{
		System.out.println("you can login using user name and password");
	}
}

class Bus
{
	static void Login()
	{
		System.out.println("this is login");
	}
}
public class MethodReferenceDemo {
	public static void main(String[] args) {
		Validate v=()-> System.out.println("login validation");
		v.validateLogin();
		
		Car car=new Car();
		Validate v1=car::myLogin;
		v1.validateLogin();
		
		
		Validate v2=Bus::Login;
		v2.validateLogin();
	}

}
