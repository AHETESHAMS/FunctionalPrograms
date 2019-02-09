package com.BridgeLabz.FunctionalPrograms;
import java.util.*;
public class StopWatch {
	public static long startTimer=0; 
	public static long stopTimer=0;
	public void start()
	{
		startTimer = System.currentTimeMillis();
		
		System.out.println("Start time is:="+startTimer);
	}
	
	public void stop()
	{
		stopTimer = System.currentTimeMillis();
		
		System.out.println("Stop time is:="+stopTimer);
	}
	
	public static void main(String []args)
	{
		StopWatch sw = new StopWatch();
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Press 1 to start:=");
		
		int input = sc.nextInt();
		
		if(input==1)
		{	
			sw.start();
		
		}	
		else
		
	}
}
