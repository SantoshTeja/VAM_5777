package com.vm.training.java.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {
	public static void main(String[] args) throws IOException {
		Employee emp=new Employee(12,"santosh");
		FileOutputStream fs=new FileOutputStream("abc.ser");
		ObjectOutputStream obj=new ObjectOutputStream(fs);
		emp.dept="cse";
	
		obj.writeObject(emp);
		System.out.println("++++++Serialization Done+++++");
	}

}
