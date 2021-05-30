package com.vm.training.java.io;
import java.util.*;
import java.io.*;
public class ReverseTheFile {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Lenovo\\Documents\\santo.txt");
	//File f=new File("Santosh.txt");
	FileReader fr=new FileReader(f);
	int readchar=fr.read();
	String str="";
	while(readchar!=-1)
	{
		str+=(char)readchar;
		System.out.println((char)(readchar));
		readchar=fr.read();
		
	}
	System.out.println(str);
	FileWriter fw=new FileWriter(f);
	//fw.write(str);
	for(int i=str.length()-1;i>=0;i--)
	{
		fw.write(str.charAt(i));
	}
	fw.flush();
	fw.close();
//	
}
}
