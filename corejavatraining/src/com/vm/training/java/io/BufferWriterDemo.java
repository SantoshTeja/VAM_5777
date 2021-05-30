package com.vm.training.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw=new FileWriter("Santosh.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("Santosh");
		bw.write("Teja");
		bw.flush();
		bw.close();
	}

}
