package com.vm.training.java.io;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class FileReaderDemo {
public static void main(String[] args) throws IOException {
	File f=new File("Santosh.txt");
	FileReader fr=new FileReader(f);
	System.out.println(fr.read());// prints only one character
	int readchar=fr.read(); 
	while(readchar!=-1)
	{
		System.out.println((char)(readchar));// returns as a integer so convert into char
		readchar=fr.read();
		
	}
	
}
}
