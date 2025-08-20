package maintest;

import org.junit.jupiter.api.Test;

import main.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testMainPrintsHello() {
        // Capture System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main
        Main.main(new String[]{});

        // Restore original System.out
        System.setOut(originalOut);

        // Check output
        String expected = "Hello" + System.lineSeparator(); // because println adds a newline
        assertEquals(expected, outContent.toString());
    }
}
