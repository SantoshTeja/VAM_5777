package com.vm.training.java.io;
import java.util.*;
import java.io.*;
public class FileWriterExample{
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	int id;
	String phno,name,choice;
	File f=new File("Student.txt");
	FileWriter fw=new FileWriter(f);
	if(!f.exists())
	{
		f.createNewFile();
	}
	
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("ID \t\t  Name \t\t  PhNo");
	bw.newLine();
	
	do
	{
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter phno");
		phno=sc.next();
		
		bw.write(id+"\t\t"+name+"\t\t"+phno);
		bw.newLine();
		
		System.out.println("Do you still want to enter the details(yes/no) :");
		choice=sc.next();
		
	}while(choice.equals("yes"));
	System.out.println("Successfully completed");
	bw.close();
}
}
