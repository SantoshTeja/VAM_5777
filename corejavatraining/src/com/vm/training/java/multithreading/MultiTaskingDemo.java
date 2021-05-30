package com.vm.training.java.multithreading;

class ManiTeja extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==4)
			{
				try
				{
					sleep(5000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			//System.out.println("Mani Teja :"+i);
			System.out.println("Name :"+Thread.currentThread().getName()+i);

		}
		
	}
}
class Santosh extends Thread
{
	public void run()
	{
		for(int i=11;i<=30;i++)
		{
			//System.out.println("Santosh :"+i);
			System.out.println("Name :"+Thread.currentThread().getName()+i);

		}
		
	}
}
class Shashank extends Thread
{
	public void run()
	{
		for(int i=31;i<=50;i++)
		{
			//System.out.println("Shashank :"+i);
			System.out.println("Name :"+Thread.currentThread().getName()+i);
		}
		
	}
}
public class MultiTaskingDemo {
public static void main(String[] args) {
	ManiTeja mn=new ManiTeja();
	Santosh st=new Santosh();
	Shashank sk=new Shashank();
	
	//mn.run();
	//st.run();
	//sk.run();
	mn.setName("ManiTeja");
	st.setName("Santosh");
	sk.setName("Shashank");
	mn.start();
	st.start();
	sk.start();
}
}
