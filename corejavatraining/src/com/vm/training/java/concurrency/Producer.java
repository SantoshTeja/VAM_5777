package com.vm.training.java.concurrency;
import java.util.*;
import java.util.concurrent.BlockingQueue;
public class Producer implements Runnable{
    BlockingQueue<Integer> commonqueue;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("PRODUCER : ");
			commonqueue.add(i);
			System.out.println("Elements add :"+i);
			System.out.println("Queue elements are :"+commonqueue);
			System.out.println("====================================");
			
			
		}
		
	}
	public Producer(BlockingQueue<Integer> commonqueue) {
		super();
		this.commonqueue = commonqueue;
	}
	

}
