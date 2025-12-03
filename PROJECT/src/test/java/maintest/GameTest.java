package maintest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;

import main.Game;

class GameTest {

	@Test
	public void testUserInput() {

		// Simulate input for System.in (e.g., user inputs "5")
		String input = "5";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in); // Redirect System.in to use our simulated input

		// Create an instance of the class and call the method
		Game game = new Game();
		int result = game.takeGuess();

		// Assert that the square of 5 is 25
		assertEquals(5, result);
	}
}
