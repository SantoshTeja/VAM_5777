package com.vm.training.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("Santosh.txt");
		
		FileWriter fw=new FileWriter(f,true);
		fw.write("santosh");
		fw.write("Teja");
		fw.write("is a person \n");
		
		fw.flush();
		//fw.write("good");
		//fw.close();
		System.out.println("Successful");
		
	}

}
