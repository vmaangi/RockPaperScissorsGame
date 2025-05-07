package day5;

import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) 
	
	
	{
		System.out.println("Welcome to the Rock, Paper, Scissors Game!");
		
		//Users input
		
		Scanner scanner =  new Scanner  (System.in);
		
		System.out.println("Enter your choice");
		System.out.println("0:Rock , 1: Paper, 2: Scissors");
		int userChoice = scanner.nextInt();
		
		
		//validate input
		
		if (userChoice < 0 || userChoice >2)
		{
			
			System.out.println("Invalid choice. Please run the program again and enter 0, 1, or 2");
			return; //exit the program
		}
		
		//Computer's random choice
		
		int computerChoice =  (int)(Math.random()*3);
		System.out.println(computerChoice);
		
		//Determine Winner
		
		if (userChoice == computerChoice) 
		{
			
			System.out.println("It's a tie");
		}
		
		else if ((userChoice== 0 && computerChoice == 2) ||
				(userChoice== 1 && computerChoice == 0) ||
				(userChoice== 2 && computerChoice == 1))
		{
			System.out.println("You Win! - Congratulations!");
			
		}
		else
		
		{
			System.out.println("Computer wins!");
			
	
		}
		scanner.close();
	
		}

	}


