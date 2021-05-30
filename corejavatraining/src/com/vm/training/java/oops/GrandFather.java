package com.vm.training.java.oops;

public class GrandFather {
int age;

public GrandFather(int age) {
	super();
	this.age = age;
}
void walk()
{
	System.out.println("I cannot walk"+age);
}
}

class Father extends GrandFather
{
int myage;
	public Father(int age,int myage) {
		super(age);
		this.myage=myage;
		// TODO Auto-generated constructor stub
	}
	void walk()
	{
		System.out.println("I can walk"+myage);
	}
}

class Son extends Father
{
	int youngage;
	public Son(int age,int myage,int youngage)
	{
		super(age,myage);
		this.youngage=youngage;
	}
	void walk()
	{
		System.out.println("I can run"+youngage);
	}
}
