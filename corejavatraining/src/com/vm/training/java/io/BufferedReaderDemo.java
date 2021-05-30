package com.vm.training.java.io;
import java.util.*;
import java.io.*;
public class BufferedReaderDemo {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("Santosh.txt");
	BufferedReader br=new BufferedReader(fr);
	
	String readchar=br.readLine();
	while(readchar!=null)
	{
		System.out.println((readchar));
		readchar=br.readLine();
		
	}
}
}
