package com.vm.training.java.exceptions;

class Training
{
	void train() throws Exception
	{
		System.out.println("Donot know angular");
	}
	void trainAllSubjects() throws Exception
	{
		specificTraining();
		System.out.println("can train anything thereotically");
	}
	void specificTraining() throws Exception
	{
		train();
		System.out.println("Do know only java and angular");
	}
}

public class ThrowsTest {
public static void main(String[] args) throws Exception{
	Training tr=new Training();
	tr.trainAllSubjects();
}
}
