package oop4_guessing_game;

import java.util.Scanner;
/**
 * This is GameConsole
 * @author patiphansrisook
 *
 */
public class GameConsole {
	
	Scanner input = new Scanner (System.in);
	/**
	 * The play method plays a game using input from a user.
	 * @param number is a number that you're guessed.
	 * @param game is create a number and guess you.
	 * @return a number that equals a guessing number.
	 */
	public int play(GuessingGame game){
		System.out.println(game.getHint());
		int number = 0;
		boolean checkGuess = true;
		do{
			System.out.print("Your guess? ");
			number = Integer.parseInt(input.nextLine());
			checkGuess = game.guess(number);
			System.out.println(game.getHint());
		}while(!checkGuess);
		System.out.printf("Correct. You used %d guesses",game.getCount());
		return number;
	}
}
