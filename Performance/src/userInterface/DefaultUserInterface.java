package userInterface;

import java.util.Scanner;

public class DefaultUserInterface implements UserInterface {

	@Override
	public int askForStartLimit() {
		System.out.println("Insertar el limite inicial.");
		return getValue();
	}

	@Override
	public int askForEndLimit() {
		System.out.println("Insertar el limite final.");
		return getValue();
	}

	@Override
	public int askForIncrementLimit() {
		System.out.println("Insertar el incremento.");
		return getValue();
	}

	@Override
	public int askForMemoryValue() {
		System.out.println("Insertar el valor de la memoria en Megabytes.");
		return getValue();
	}
	
	/**
	 * 
	 * Scan a integer by console.
	 * 
	 * @return The value scanned by console.
	 */
	@SuppressWarnings("resource")
	private int getValue() {
		boolean advisor = false;
		while (!advisor) {
			int value = new Scanner(System.in).nextInt();
			if (value < 1)
				System.out
						.println("Número incorrecto. Insertar un Número Natural.");
			else {
				return value;
			}
		}
		return 0;
	}
}
