package javaLearning;
import java.util.Random;
import java.util.Scanner;
//import java.io.IOException;

public class MainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
		do
		{
			//Playing
			playDiviner(scan);
			System.out.println("Play again ? (1/else)");
			
		}while(scan.nextInt() == 1);
		scan.close();*/
		
		Client
			moi = new Client("Tom", "Vautray"),
			billy = new Client("Bill", "Gates");
		
		for(int i = 0; i < 50; i++)
			billy.openAccount(i, 10000000);
		
		moi.openAccount(1, 3);
		
		System.out.println("moi: " + moi + "\n\rBilly: " + billy);
		
	}

	public static void playDiviner(Scanner scan)
	{
		Random rand = new Random();
		int
			toGuess = 0,
			guessing = 0,
			attempts = 0,
			maxAttempts = 6,
			maxValue = 100;
		
		//Setting up game
		System.out.println("Select difficulty (1/2/else)");
		switch(scan.nextInt())
		{
		case 1:
			maxAttempts = 6;
			maxValue = 100;
			break;
			
		case 2:
			maxAttempts = 12;
			maxValue = 1000;
			break;
			
		default:
			maxAttempts = 18;
			maxValue = 10000;
		}
		
		System.out.println("2 players ? (1/else)");
		if(scan.nextInt() == 1)
		{
			System.out.println("Player 1: Enter a value");
			toGuess = (scan.nextInt() % maxValue + 1) - 1;
			System.out.println("Number is " + toGuess);
			//scan.next();
			//System.out.flush();
		}
		else
			toGuess = rand.nextInt(maxValue) + 1;
			
		
		//Playing
		System.out.println("Guess for a number between 1 and " +  maxValue + ":");
		do
		{
			guessing = scan.nextInt();
			++attempts;
			System.out.println("Attempt " + attempts + "/" + maxAttempts);
			if(attempts == maxAttempts)
				System.out.println("Loose ! Value was " + toGuess);
			else if(toGuess > guessing)
				System.out.println("It's higher");
			else if(toGuess < guessing)
				System.out.println("It's lower");
			else
				System.out.println("Win !");
		}while(toGuess != guessing && attempts < maxAttempts);
	}
}
