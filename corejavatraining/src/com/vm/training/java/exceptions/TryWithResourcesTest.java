package com.vm.training.java.exceptions;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TryWithResourcesTest {
public static void main(String[] args)
{
	try(FileOutputStream fos=new FileOutputStream(new File("D:/Santosh.txt"));Connection con=DriverManager.getConnection("url", "root", "root"))
	{
		String s="Value Momentum";
		byte b[]=s.getBytes();
		fos.write(b);
		System.out.println("Success");
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();;
	}
	catch(IOException e1)
	{
		e1.printStackTrace();
	}
	catch(Exception e2)
	{
		e2.printStackTrace();
	}
}
}
