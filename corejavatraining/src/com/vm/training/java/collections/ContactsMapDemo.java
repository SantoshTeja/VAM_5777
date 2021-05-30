package com.vm.training.java.collections;

import java.util.*;

public class ContactsMapDemo {
	static HashMap contacts=new HashMap();
	static HashMap AddElements(String name,String contact)
	{
		contacts.put(name, contact);
		return contacts;
		
	}

	static HashMap RemoveElements(String name)
	{
		contacts.remove(name);
		return contacts;
	}
	static void PrintElements()
	{
		System.out.println(contacts);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*contacts.put("santosh", 927823772);
		contacts.put("teja", 927824353);
		contacts.put("john", 927492730);
		contacts.put("james", 937267273);
		contacts.put("davis", 936253783);
		
		System.out.println("The Conctacts are :"+contacts);
		
		contacts.remove("john");
		
		System.out.println("After removing contacts :");
		*/
		Scanner sc=new Scanner(System.in);
		AddElements("Santosh", "95747643");
		AddElements("teja", "78272929");
		RemoveElements("Santosh");
		PrintElements();
		
		
		
		
		
		
	}

}
