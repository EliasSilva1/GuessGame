import java.util.Scanner;
import java.util.Random;

public class GuessGame {
	
	public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        int input, computer_number,replay,played = 1, good_guess = 0, bad_guess = 0,single_perc, all_perc;
        Random game = new Random();
        computer_number = game.nextInt(9);
        
        
        do
        {
        	
        	System.out.println("Enter your number 1 - 10");
            	input = x.nextInt();
            if ( input == computer_number)
            	{
            	System.out.println("Guess correct number");
            	single_perc = 100;
            	good_guess = good_guess + 1;
            	}
            else
            {
            	System.out.println("Your number is not equal than the computer number");
            	single_perc = 0;
            	bad_guess = bad_guess + 1;
            }
            
            all_perc = good_guess / played;
            System.out.printf("Good guesses:%d\n",good_guess);
            System.out.printf("Bad guesses:%d\n",bad_guess);
            System.out.printf("Played Games:%d\n",played);
            System.out.printf("Your guess is %d percent\n",single_perc);
            System.out.printf("All guesses %d percent\n",all_perc);
    
            System.out.println("Do you wanto play again? Yes(0) or N0 (1)");
            	replay = x.nextInt();        	
            played++;
        }while (replay == 0);
        
    }

}

/// I am looking for percentage of guess right, high and low.
