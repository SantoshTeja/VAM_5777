package com.vm.training.java.oops;

public class Calculator {
	
	int num1;
	int num3;
	int num2;
	double sum=0;
	long l;
	
	void Add(int num1,int num2)
	{
		l=num1+num2;
		System.out.println(l);
	}
	public double Add(int num1,double num2)
	{
		sum=num1+num2;
		return sum;
	}
public long Add(int num1,int num2,int num3)
{
	sum=num1+num2+num3;
	return l;
}
}
