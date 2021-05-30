package com.vm.training.java.multithreading;

public class ThreadPriority {
	public static void main(String[] args) {
		//MultiTaskingDemo demo=new MultiTaskingDemo();
		Santosh st=new Santosh();
		ManiTeja mn=new ManiTeja();
		System.out.println(st.getPriority());
		System.out.println(mn.getPriority());
		
		//st.start();
		//mn.start();
		st.setName("Santosh");
		mn.setName("ManiTeja");
		
		st.setPriority(8);
		mn.setPriority(2);
		st.start();
		mn.start();
		
		
	}

}
