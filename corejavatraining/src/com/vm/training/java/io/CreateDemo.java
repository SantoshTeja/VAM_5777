package com.vm.training.java.io;

import java.io.*;

public class CreateDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("Santosh.txt");
		File f2=new File("C:\\Users\\Lenovo\\Documents\\teja.txt");
		if(f2.exists())
		{
			System.out.println("The file has been already existed.");
		}
		else
		{
			System.out.println("We are creating a new file");
			f.createNewFile();
			System.out.println("File created");
		}
	}

}
