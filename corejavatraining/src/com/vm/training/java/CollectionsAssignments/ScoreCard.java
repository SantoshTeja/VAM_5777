package com.vm.training.java.CollectionsAssignments;
import java.io.*;
import java.util.*;
public class ScoreCard {
	static Map<Integer,String> scorecard=new HashMap<Integer,String>();

	public static void playersBatted()
	{
		for(String mp: scorecard.values())
		{
			System.out.print(mp+" ");
		}
	}
	static void playerScores()
	{
		for(Map.Entry<Integer,String> arr: scorecard.entrySet())
		{
			System.out.println(arr);
		}
	}
	static int totalScore()
	{
	int sum=0;
	for(Integer mp: scorecard.keySet())
	{
        sum=sum+mp;
	}
	return sum;
	}
	
	static int highestScorer()
	{
		int n=Collections.max(scorecard.keySet());
		return n;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter runs :");
		Scanner sc=new Scanner(System.in);
		scorecard.put(20,"rahane");
		scorecard.put(30,"rahul");
		scorecard.put(150, "kohli");
		scorecard.put(50,"dhoni");
		scorecard.put(2,"lokesh");
		
		//System.out.println(scorecard.values());
		System.out.println("Players who batted are :");
		playersBatted();
		System.out.println();
		System.out.println("=================================");
		System.out.println("Scores by players :");
		playerScores();
		System.out.println("==================================");
		System.out.println("Total Score :"+totalScore());
		System.out.println("=============================");
		int n=highestScorer();
		System.out.println("Name of the Highest scorer :"+scorecard.get(n));
	
	
		
		
		

		
		System.out.println();
		
	}

}
