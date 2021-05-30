package com.vm.training.java.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fs=new FileInputStream("abc.ser");
		ObjectInputStream obj=new ObjectInputStream(fs);
		Employee e=(Employee)obj.readObject();
		
		System.out.println(e.id+"   "+e.name+"   "+e.dept);
	}

}
