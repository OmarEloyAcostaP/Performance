package tests;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import userInterface.DefaultMainUserInterdace;
import userInterface.MainUserInterface;

/**
 * Used case test. Informing the user about the final test results.
 * 
 */
public class ToInformTheUser {
	
	MainUserInterface mainUserInterface;
	
	/**
	 * Cause use test. Showing goodbyte text.
	 */
	@Test	
	public void test() {
		mainUserInterface = new DefaultMainUserInterdace();
		mainUserInterface.goodbyeText();
		System.out.println("¿Has visto un mensaje de despedida? (1: Sí, 2: No)");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		scanner.close();
		assertEquals(answer,"1");
	}
}
