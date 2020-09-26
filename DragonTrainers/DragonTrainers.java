/**
 * DRAGON TRAINER WITH METHODS
 * ENTER NUMBER OF MATCHES AND 
 * SELECT A DRAGON THAT WILL BEAT
 * THE COMPUTER
 * @author KATRINA BUSGANO
 * @version MARCH 1 2020
 */
import java.util.Random;
import java.util.Scanner;

public class DragonTrainers {

    /**
     * Constant array to hold the types of the dragon in order. 0 - Plant, 1 -
     * Water, 2 - Fire. Make sure your code does not change these values!
     */
    private static final String[] DRAGONS = { "Plant", "Water", "Fire" };

    /**
     * Prompts the user with the message: "How many matches will we play? " and
     * takes in an integer as input. If the user enters a value that is 0 or
     * negative, displays the error message: "ERROR - number of matches must
     * be positive!" and asks again. Continues looping until the user enters a
     * positive number.
     *
     * @param input
     *            - Scanner to read values from the keyboard
     * @return - an integer value strictly larger than zero.
     */
    public static int getNumberOfMatches(Scanner input) {
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
    	
    	System.out.print("How many matches will we play? ");
    	int num = Integer.parseInt(input.nextLine()); 
    	
    	while(num <= 0) {
    		System.out.println("ERROR - number of matches must be positive!");
    		
    		System.out.print("How many matches will we play? ");
        	num = Integer.parseInt(input.nextLine()); 
    		
    	}
    	
        return num;
    }

    /**
     * Prompts the user with the message "Please select a dragon
     * [Plant/Water/Fire]: " and waits for user input. If the user enters a
     * blank line, prints the error message "ERROR - Dragon prompt cannot be
     * empty" and asks the user again. Repeats until the user enters a non-blank
     * line.
     *
     * @param input
     *            - Scanner to read values from the keyboard
     * @return A non-empty String entered by the user
     */
    public static String promptForDragon(Scanner input) {
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
    	
    	String Dragonletter;
  
    	
    	System.out.print("Please select a dragon [Plant/Water/Fire]: ");
		Dragonletter = input.nextLine();
		
		while (Dragonletter.equals("")) {
		System.out.println("ERROR - Dragon prompt cannot be empty.");
        
        System.out.print("Please select a dragon [Plant/Water/Fire]: ");
        Dragonletter = input.nextLine();
		}
		
    	
		return Dragonletter;
    }

    /**
     * Takes a single UPPERCASE character. If it is a 'W','P' or 'F' returns the
     * appropriate numeric value given the dragon types in the array DRAGON
     * (i.e. 0 for 'P', 1 for 'W', 2 for 'F'). If it is none of these returns a
     * -1 to represent an invalid value.
     *
     * @param dragon
     *            - the UPPERCASE character to look up a value for.
     * @return 0 if dragon is 'P', 1 if dragon is 'W', 2 if dragon is 'F', -1
     *         otherwise
     */
    public static int dragonToNumber(char dragon) {
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
    	
    	int score = 0;
    	
    	if (dragon == 'P') {
    		score = 0;
    	} 
    	
    	if (dragon == 'W') {
    		score = 1;
    	}
    	
    	if (dragon =='F') {
    		score = 2;
    	}
    	
    	if (dragon != 'P' && dragon != 'W' && dragon != 'F') {
    		score = -1;
    	}
    	
    	
    	
        return score;
    }

    /**
     * Takes a number representing the player's choice and another representing
     * the computer's choice. Returns a 0 if they tie, a 1 if the player wins,
     * and a -1 if the player loses. Note that the values map to the indexes of
     * the array DRAGONS above (0 is a Plant dragon, 1 is a Water dragon, 2 is a
     * Fire Dragon).
     *
     * @param player
     *            - value 0-2 representing player dragon choice
     * @param cpu
     *            - value 0-2 representing computer dragon choice
     * @return 1 if the player wins, -1 if the computer wins, 0 if they tie
     */
    public static int determineWinner(int player, int cpu) {
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
    	
    	int returnscore = 0;
    	
    	if (player == cpu) {
    		returnscore = 0;
    	}
    	
    	//fire and water
    	if (player == 2 && cpu == 1 ) {
    		returnscore = -1;
    	}
    	
    	//fire and plant
    	if (player == 2 && cpu == 0 ) {
    		returnscore = 1;
    	}
    	
    	//plant and water
    	if (player == 0 && cpu == 1 ) {
    		returnscore = 1;
    	}
    	
    	//fire and water
    	if (player == 1 && cpu == 2 ) {
    		returnscore = 1;
    	}
    	
    	//fire and plant
    	if (player == 0 && cpu == 2 ) {
    		returnscore = -1;
    	}
    	
    	//plant and water
    	if (player == 1 && cpu == 0 ) {
    		returnscore = -1;
    	}
    	
    	
        return returnscore;
    }

    /**
     * Takes a number representing the player's choice and another number
     * representing the computer's choice, and a third number that is positive
     * if the player is the winner, negative if the computer is the winner, and
     * 0 if they tied. Then displays the appropriate player defeats computer or
     * computer defeats player or tie message as given in the project
     * description.
     *
     * @param player
     *            index into the DRAGONS array representing the player choice
     * @param cpu
     *            index into the DRAGONS array representing the computer's
     *            choice
     * @param winner
     *            0 for a tie, positive for a player win, negative for a
     *            computer win
     */
    public static void displayMatchResult(int player, int cpu, int winner) {
    	
    	
    	if (player == cpu) {
    		System.out.println("A Tie!");
    	}
    	
    	//fire and water
    	if (player == 2 && cpu == 1 ) {
    		System.out.println(DRAGONS[cpu] + " defeats " + DRAGONS[player] + " - you lose!");
    	}
    	
    	//fire and plant
    	if (player == 2 && cpu == 0 ) {
    		System.out.println(DRAGONS[player] + " defeats " + DRAGONS[cpu] + " - you win!");
    	}
    	
    	//plant and water
    	if (player == 0 && cpu == 1 ) {
    		System.out.println(DRAGONS[player] + " defeats " + DRAGONS[cpu] + " - you win!");
    	}
    	
    	//fire and water
    	if (player == 1 && cpu == 2 ) {
    		System.out.println(DRAGONS[player] + " defeats " + DRAGONS[cpu] + " - you win!");
    	}
    	
    	//fire and plant
    	if (player == 0 && cpu == 2 ) {
    		System.out.println(DRAGONS[cpu] + " defeats " + DRAGONS[player] + " - you lose!");
    	}
    	
    	//plant and water
    	if (player == 1 && cpu == 0 ) {
    		System.out.println(DRAGONS[cpu] + " defeats " + DRAGONS[player] + " - you lose!");
    	}
    	
    	
    	

    	
   
    	
    }

    /**
     * Takes the number of wins, losses and ties and displays the final message
     * and summary statistics as given in the project description.
     *
     * @param wins
     *            number of total wins for the player
     * @param losses
     *            number of total losses for the player
     * @param ties
     *            number of ties
     */
    public static void displayFinalResult(int wins, int losses, int ties) {
        // TODO - complete this method
    	System.out.println("The tournament is over!");
    	System.out.println("We tied " + ties + " matches.");
    	System.out.println("I won " + losses + " matches.");
    	System.out.println("You won " + wins + " matches.");
    	
    	if (losses > wins) {
    		System.out.println("I am the winner!");
    		
    	}
    	
    	else if(wins == losses){
    		System.out.println("Neither of us can claim victory here!");
    		
    	}
    	
    	if (losses < wins) {
    		System.out.println("You are the winner!");
    	}
    	
    }

    /**
     * NOTE: The main method has been completed for you. If you correctly
     * complete the methods above, the main method will "just work" and produce
     * the correct output.
     */
    public static void main(String[] args) {
        // Prompt for a random number seed
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a random seed: ");
        int seed = Integer.parseInt(keyboard.nextLine());
        // Create a Random instance with the seed
        Random rnd = new Random(seed);
       
        // Prompt for number of matches to play
        int totalMatches = getNumberOfMatches(keyboard);
        // kmlb System.out.print(totalMatches);
       
        
        // Start with wins, losses and ties at 0.
        // Repeat until all matches have been played (use the sum of the
        // results so we don't need another variable)
        int wins = 0, losses = 0, ties = 0;
        while ((wins + losses + ties) < totalMatches) {
            // Ask the user for a dragon to use
            String input = promptForDragon(keyboard);

            // Get the first character of the user's input as an uppercase
            // value.
            char dChar = input.toUpperCase().charAt(0);

            // Convert the user's input to an index for the DRAGONS array
            int playerDragon = dragonToNumber(dChar);

            // Generate a choice between 0 and 2 for the computer
            int cpuDragon = rnd.nextInt(3);

            // Display the results
            System.out.println("I chose: " + DRAGONS[cpuDragon] + " dragon.");

            // If the player didn't enter a valid choice, print out an error
            // message and increase the number of losses.
            if (playerDragon == -1) {
                System.out.println("You don't have the " + input + " dragon.");
                System.out.println("So no dragon fights for you.");
                System.out.println("I win by default!");
                losses++;
            } else {
                // Print out the player's choice.
                System.out.println("You chose: " + DRAGONS[playerDragon] + " dragon.");
                
                // Determine who won the match.
                int winner = determineWinner(playerDragon, cpuDragon);
                
                // Display the result of the match.
                displayMatchResult(playerDragon, cpuDragon, winner);

                // Increase the count of wins, losses or ties according to
                // who won the match.
                if (winner > 0) {
                    wins++;
                } else if (winner < 0) {
                    losses++;
                } else {
                    ties++;
                }
            }
            System.out.println();
        }
        // Display the final summary of the match to the screen.
        displayFinalResult(wins, losses, ties);

        // Don't forget to close the Scanner!
        keyboard.close();
    }

}