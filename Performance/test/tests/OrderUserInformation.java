package tests;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import userInterface.DefaultMainUserInterdace;
import userInterface.DefaultUserInterface;
import userInterface.MainUserInterface;
import userInterface.UserInterface;

/**
 * Used case test. Asking the user for information related to the test.
 * 
 */
public class OrderUserInformation {

	MainUserInterface mainUserInterface;
	UserInterface userInterface;
	Scanner scanner;
	String answer;

	@Test
	public void test() {
		this.mainUserInterface = new DefaultMainUserInterdace();
		this.userInterface = new DefaultUserInterface();
		this.scanner = new Scanner(System.in);
		this.answer = new String();

		welcomeText();
		askForKindOfTest();
		askForStartLimit();
		askForEndLimit();
		askForIncrementLimit();
		askForMemoryValue();
	}

	/**
	 * Case use test. Asking for memory value.
	 */
	private void askForMemoryValue() {
		this.userInterface.askForMemoryValue();
		System.out
				.println("¿Has sido preguntado para introducir el valor de la memoria? (1: Sí, 2: No)");
		this.answer = scanner.next();
		assertEquals(answer, "1");
	}

	/**
	 * Case use test. Asking for increment limit.
	 */
	private void askForIncrementLimit() {
		this.userInterface.askForIncrementLimit();
		System.out
				.println("¿Has sido preguntado para para introducir el incremento? (1: Sí, 2: No)");
		this.answer = scanner.next();
		assertEquals(answer, "1");
	}

	/**
	 * Case use test. Asking for end limit.
	 */
	private void askForEndLimit() {
		this.userInterface.askForEndLimit();
		System.out
				.println("¿Has sido preguntado para introducir el límite final? (1: Sí, 2: No)");
		this.answer = scanner.next();
		assertEquals(answer, "1");
	}

	/**
	 * Case use test. Asking for start limit.
	 */
	private void askForStartLimit() {
		this.userInterface.askForStartLimit();
		System.out
				.println("¿Has sido preguntado para introducir el límite final? (1: Sí, 2: No)");
		this.answer = scanner.next();
		assertEquals(answer, "1");
	}

	/**
	 * Case use test. Showing welcome test
	 */
	private void welcomeText() {
		this.mainUserInterface.welcomeText();
		System.out
				.println("¿Has visto un mensaje de bienvenida? (1: Sí, 2: No)");
		this.answer = scanner.next();
		assertEquals(answer, "1");
	}

	/**
	 * Case use test. Asking for kind of test
	 */
	private void askForKindOfTest() {
		this.mainUserInterface.askForKindOfTest();
		System.out
				.println("¿Has sido preguntado para seleccionar una prueba? (1: Sí, 2: No)");
		this.answer = scanner.next();
		assertEquals(answer, "1");

	}

}
