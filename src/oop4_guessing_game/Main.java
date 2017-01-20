package oop4_guessing_game;

/**
 * This is MainClass of the game.
 * @author patiphansrisook
 *
 */
public class Main {
/** create objects and start the game */

	public static void main(String args[]){
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
