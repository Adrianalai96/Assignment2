//Class: CMSC-203-32295
//Instructor: Ahmed Tarek 
//Assignment 2
//Description: This project represents a game where the user tries to guess a random number between 0 to 100.
//				The program will tell the user that the guess is too high or too low. Also, the user will be asked if he/she wants to go again.
//Due Date: 02/23/2020
//I pledge that I have completed the programming assignment independently.
// I have not copied the code from a student or any source.
// I have not given my code to any student.
//Print your Name here: Adrian Carmona	



import java.util.Random;
import java.util.Scanner;

public class RandomGuessingGame 
{

	public static void main(String[] args) 
	{
		
		
		Random rand = new Random();
		int randnum = rand.nextInt(100);
		boolean userguess = false;
		int numberoftries = 0;
		Scanner input = new Scanner(System.in);
		
		int userinput;
		int highguess=100;
		int lowguess=0;
		int repeat;
		
	
		while ( !userguess) 
		{
			numberoftries = numberoftries +1;
			
			System.out.println("Enter your guess: ");
			
			userinput = input.nextInt(); 
			System.out.println("Number of guesses: " + numberoftries);
			
			if (userinput > highguess)
			{
				System.out.println("	>>> Guess must be betweeen " + lowguess + " and " + highguess);
			}
			
			if (userinput < lowguess)
			{
				System.out.println("	>>> Guess must be betweeen " + lowguess + " and " + highguess);
			}
			
			
			
			if ((userinput < randnum) & !(userinput < lowguess)) 
			{
				
				System.out.println("your guess is too low");
				lowguess = userinput; 
				
				System.out.println("Enter your next guess between " + lowguess + " and " + highguess);
				
			}
			
			if (userinput == randnum) 
			{
				System.out.println("Congradulations, you guessed correctly");
				System.out.println("Try again? type ( 1 ) for yes or (2) for no");
				repeat = input.nextInt();  
				if (repeat == 1) 
				{
					userguess = false;
					numberoftries = 0;
					lowguess = 0;
					highguess = 100;
					randnum = rand.nextInt(100);
					
					input.nextLine();
					
					
					
					
				}
				if (repeat == 2)
				{
					System.out.println("Thanks for playing...");
					System.out.println("Programer's name: Adrian Carmona");
					userguess = true;
					
					
					
					
					
				}
								
			}  
			
			if ((userinput > randnum) & !(userinput > highguess))
			{
				System.out.println("your guess is too high");
				highguess = userinput;
				System.out.println("Enter your next guess between " + lowguess + " and " + highguess);
				
				
			}
			
			
		}
		
		

	}

}

