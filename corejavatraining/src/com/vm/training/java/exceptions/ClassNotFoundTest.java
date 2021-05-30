package com.vm.training.java.exceptions;

public class ClassNotFoundTest {
	public static void main(String[] args) {
		try {
			Class.forName("Name");
			System.out.println("good");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
