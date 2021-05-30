package com.vm.training.java.oops;

class A
{
	static int i=0;
	A()
	{
		i++;
		System.out.println(i);
	}
	void display()
	{
		System.out.println(i);
	}
}

public class teststatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  A a=new A();
	  a.display();
	  A b=new A();
	  b.display();
		
		
	}

}
