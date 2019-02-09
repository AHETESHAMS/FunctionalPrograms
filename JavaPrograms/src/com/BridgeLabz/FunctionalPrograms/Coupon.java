package com.BridgeLabz.FunctionalPrograms;

import java.util.Random;

public class Coupon {

	public static void main(String []args)
	{
			int cnt=0;
			
			Random r = new Random();
			
			int []arr = new int[20];
				
		    for(int i=0;i<20;i++)
		    {
		    	int val = r.nextInt(100);
		    	
		    	for(int j=0;j<=i;j++)
		    	{
		    		if(arr[j]==val)
		    			cnt++;
		    	}
		    	if(cnt==0)
		    		arr[i] = val;
		    }
		    for(int i=0;i<20;i++)
		    {
		    	System.out.println(arr[i]);
		    }
		    
	}
}
