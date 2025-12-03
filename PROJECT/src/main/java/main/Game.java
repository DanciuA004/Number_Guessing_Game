package main;

import java.util.Random;
import java.util.Scanner;

/**
 * The main game controller.
 */
public class Game {
	private Scanner scanner = new Scanner(System.in);
	private Random rand = new Random();

	/**
	 * Method to read a number from the user and check if it is correct.
	 * @return
	 */
	public int takeGuess() {
		int guess = scanner.nextInt(); // Read an integer from the user
		return guess; // Return the square of the number
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game();
		int result = game.takeGuess();
	}
}
