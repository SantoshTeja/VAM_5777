package com.vm.training.java.multithreading;

class ProjectCall extends Thread
{
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Name :"+Thread.currentThread().getName());
			}
	}
}
class ProjectDeal extends Thread
{
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Name :"+Thread.currentThread().getName());
			}
	}
}
class ProjectExpo extends Thread
{
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Name :"+Thread.currentThread().getName());
			}
	}
}
public class JoinThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		ProjectCall pc=new ProjectCall();
		ProjectDeal pd=new ProjectDeal();
		ProjectExpo pe=new ProjectExpo();
		
		pc.setName("Project Call");
		pd.setName("Project deal");
		pe.setName("Project Expo");
		
		pc.start();
	//	pc.join();
		
		pd.start();
		pe.start();
	}

}
