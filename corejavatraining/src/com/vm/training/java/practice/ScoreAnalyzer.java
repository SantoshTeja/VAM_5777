package com.vm.training.java.practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ScoreAnalyzer {
private LinkedList<Integer> runsData=new LinkedList<Integer>();

public ScoreAnalyzer() {
	super();
}
public ScoreAnalyzer(LinkedList<Integer> runsData) {
	super();
	this.runsData = runsData;
}
void addRunsToList(int runs)
{
	runsData.add(runs);
}
double calcRunRate()
{
	double run=0;
	Iterator<Integer> iterator=runsData.iterator();
	while(iterator.hasNext())
	{
		run=run+iterator.next();
	}
	return (run/50);
	
}
int lowestRunsScored()
{
	return Collections.min(runsData);
}

void displayRuns()
{
	for(Integer s: runsData)
	{
		System.out.print(s+" ");
	}
}

int CountPlayers()
{
	return runsData.size();
}


} 
