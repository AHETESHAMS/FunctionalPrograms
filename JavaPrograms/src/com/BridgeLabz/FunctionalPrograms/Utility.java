package com.BridgeLabz.FunctionalPrograms;

import java.util.Scanner;
import java.util.Random;

public class Utility {
	public static Scanner sc = new Scanner(System.in);

	/* Single Integer Input */

	public static int singleIntegerInput() {
		return (sc.nextInt());
	}

	/* Single Double Input */

	public static double singleDoubleInput() {
		return (sc.nextDouble());
	}

	/* Single Boolean Input */

	public static boolean singleBooleanInput() {
		return (sc.nextBoolean());
	}

	/* Single String Input */

	public static String singleStringInput() {
		return (sc.next());
	}
	
	/*Calculating power*/
	
	public static double calPower(int v,double topower)
	{
		double temp = Math.pow(v, topower);
		return temp;
	}
	
	/*Starting StopWatch*/
	
	public static Long start()
	{
		return(System.currentTimeMillis());
	}
	
	/*Stoping StopWatch*/
	
	public static Long stop()
	{
		return(System.currentTimeMillis());
	}

	/*Calculatng Time Ellapse of StopWatch*/
	
/*Stoping StopWatch*/
	
	public static Long timeEllapse(Long start,Long stop)
	{
		return((stop-start)/1000);
	}

	/* Checking Leap Year */

	public static void checkLeapYear(int year) {
		if (year % 400 == 0)
			System.out.print("It is a Leap Year!");
		else if (year % 4 == 0)
			System.out.print("It is a Leap Year!");
		else if (year % 100 == 0)
			System.out.print("It is not a Leap Year!");
		else
			System.out.print("It is not a Leap Year!");

	}

	/* Counting Leap Year Digits */

	/**
	 * @param year
	 * @return
	 */
	public static int countLeapYear(int year) {
		int cnt = 0;
		while (year > 0) {
			year = year / 10;
			cnt++;
		}
		return (cnt);
	}

	/* Generating Random Value */

	public static boolean randomValue() {
		double result = Math.random();

		if (result <= .5)
			return true;
		else
			return false;

	}

	/* Calculating percentage of head and tail */

	public static int calPercentage(int self, int iterations) {
		return (self * 100 / iterations);
	}

	/* User Verification */

	public static void checkUserLength(String name) {

		if (name.length() <= 3) {
			System.out.println("Please enter charachters more than three");

			UserNameVerification.main(null);

		} else {
			System.out.println("Hello " + name);
		}

	}

	/* Check Rows tic tac toe */

	public static boolean checkRows(char game[][]) {
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(game[i][j] == 'x' && game[i][j] == 'x' && game[i][j] == 'x')
				{
					return(true);
				}
				else
					return(false);			
			}
		}
		return false;

	}

	/* Check Columns tic tac toe */

	public static int checkColumns(int player1sign, int game[][]) {
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			cnt = 0;
			for (int j = 0; j < 3; j++) {
				if (game[j][i] == player1sign)
					cnt++;
			}
		}
		return (cnt);

	}

	/* Check Right Diagonal tic tac toe */

	public static int checkRightDiagonal(int player1sign, int game[][]) {
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			if (game[i][i] == player1sign)
				cnt++;
		}

		return cnt;

	}

	/* Check Left Diagonal tic tac toe */

	public static int checkLeftDiagonal(char player1sign, char game[][]) {
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			int j = 2;

			if (game[i][j] == player1sign)
				cnt++;

			j--;
		}

		return cnt;

	}

	/* Display tic tac toe */

	public static void displayGame(char[][] game) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(game[i][j] + " ");
			}
			System.out.println();
		}
	}

	/* tic tac toe Game input */
	public static void gameInput(int player, char[][] game) {
		int x, y;
		Random r = new Random();

		Utility.displayGame(game);
		for (int i = 0; i < 9; i++) {
			if (player == 1) {
				System.out.println("Player1's turn:=");

				x = Utility.singleIntegerInput();
				y = Utility.singleIntegerInput();
				if (game[x][y] == 'x' || game[x][y] == 'o') {
					System.out.println("Position is alrady filled!");
					System.out.println("");
					Utility.gameInput(player, game);
				} 
				else 
				{
					boolean temp;
					game[x][y] = 'x';
					temp = Utility.checkRows(game);
					if(temp==true)
					{
						System.out.print("Player 1 won");
						break;
					}	
					player = 2;
				}
			} 
			else 
			{
				x = r.nextInt(3);
				y = r.nextInt(3);
				if (game[x][y] == 'x' || game[x][y] == 'o') {
					Utility.gameInput(player, game);
				} 
				else 
				{
					int cnt=0;
					game[x][y] = 'o';
					player = 1;
				}
			}

			System.out.println();
			Utility.displayGame(game);
		}
	}

}
