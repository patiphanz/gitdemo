package oop4_guessing_game;

import java.util.Random;
/**
 * Game of guessing a secret number.
 * @author Patiphan Srisook
 */
public class GuessingGame {
	/* properties of a guessing game */
	private int upperBound;
	private int secret;
	private String hint;
	int count=0;

	/**
	 * Initialize a new game.
	 * @param upperbound is the max value for the secret number (>1).
	 */
	public GuessingGame (int upperbound){ //this is a constructor
		this.upperBound = upperbound;
		this.secret = getRandomNumber(upperBound);
		setHint(String.format("I'm thinking of a number between 1 and %d",upperBound));
	}

	/**
	 * Create a random number between 1 and limit
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit){
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}
	/**
	 * Input guess number and check boolean
	 * @param number - The number that user input to the game
	 * @return guess - return a results in boolean
	 */

	public boolean guess(int number){
		this.count+=1;
		if(secret == number){
			setHint(String.format("Right! The secret is %d",secret));
			return true;
		}
		else{
			if(secret>number){
				setHint("Sorry, your guess is too small.");
			}
			else{
				setHint("Sorry, you're guess is too large.");
			}
			return false;
		}

	}
	
	/**
	 * Set hint to Right , too small or too large.
	 * @param hint - set hint string to tell player.
	 */
	protected void setHint(String hint){
		this.hint = hint;
	}

	/**
	 * Return a hint based on the most recent guess.
	 * @return hint based on most recent guess
	 */
	public String getHint(){
		return this.hint;
	}
	
	/**
	 * Return counts how many guesses the user makes.
	 * @return counts how many guesses the 
	 */
	public int getCount(){
		return this.count;
	}
}
