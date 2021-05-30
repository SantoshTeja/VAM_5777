package com.vm.training.java.newfeatures;

interface Test
{
	void display();
	
}
public class LamdaExpression {
public static void main(String[] args) {
	Test t= ()->
	{
		
		System.out.println("Hello World");
		System.out.println("Java");
	};
	t.display();
	
	Test t1= ()-> System.out.println("good job");
	t1.display();
}
}
