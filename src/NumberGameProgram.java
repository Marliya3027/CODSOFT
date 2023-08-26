import java.util.Scanner;
import java.util.Random;

public class NumberGameProgram 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int minRange = 1;
		int maxRange = 100;
		int maxAttempts = 10;
		int score = 0;
		
		boolean playAgain = true;
		
		while(playAgain)
		{
			 int targetNumber = ran.nextInt(maxRange - minRange + 1) + minRange;
	            System.out.println("Welcome to the Number Game!");
	            System.out.println("I have selected a number between " + minRange + " and " + maxRange + ".");
	            
	            int attempts = 0;
	            boolean guessedCorrectly = false;
	            
	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = sc.nextInt();
	                attempts++;
	                
	                if (userGuess == targetNumber) {
	                    System.out.println("Congratulations! You've guessed the number correctly" + targetNumber + " in " + attempts + " attempts.");
	                    score++;
	                    guessedCorrectly = true;
	                    break;
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Your guess is too low. Try again.");
	                } else {
	                    System.out.println("Your guess is too high. Try again.");
	                }
	            }
	            
	            if (!guessedCorrectly) {
	                System.out.println("Sorry, you've used all your attempts. The number was: " + targetNumber);
	            }
	            
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgainResponse = sc.next();
	            playAgain = playAgainResponse.equalsIgnoreCase("yes");
	        }
	        
	        System.out.println("Game over. Your total score is: " + score);
	        sc.close();	
	}

}
