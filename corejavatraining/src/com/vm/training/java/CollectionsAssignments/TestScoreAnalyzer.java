package com.vm.training.java.CollectionsAssignments;

import java.io.*;
import java.util.*;
public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScoreAnalyzer score=new ScoreAnalyzer();
		System.out.println("Enter runs: ");
		boolean repeat=true;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int n=sc.nextInt();
			if(n==-1)
			{
				break;
			}
			score.addRunsToList(n);

		}
		System.out.print("Runs Scored : ");
		score.displayRuns();
		System.out.println();
		System.out.println("Run rate :"+score.calcRunRate());
		System.out.print("Lowest runs scored :"+score.lowestRunsScored());
		System.out.println("Total no of players :"+score.CountPlayers());

		
		
		
		
	}

}
