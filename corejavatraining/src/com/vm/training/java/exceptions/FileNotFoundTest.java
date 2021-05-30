package com.vm.training.java.exceptions;
import java.io.*;

public class FileNotFoundTest {
public static void main(String[] args) {
	File file=new File("D:/Santosh.txt");
	FileInputStream fi=null;
	try 
	{
	    fi=new FileInputStream(file);
		while(fi.read()!=-1)
		{
			System.out.println(fi.read());
		}
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
		}
	catch(IOException e1)
	{
		e1.printStackTrace();
	}
	finally
	{
		try
		{
			fi.close();
		}
		catch(IOException e2)
		{
			e2.printStackTrace();
		}
	}
}
}
