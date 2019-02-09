package com.BridgeLabz.FunctionalPrograms;

public class UserNameVerification {
	public static void main(String []args)
	{
		System.out.print("Enter the User Name:=");
		
		String name = Utility.singleStringInput();
		
		Utility.checkUserLength(name);
		
	}
}
