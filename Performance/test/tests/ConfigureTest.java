package tests;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import performanceTestFactory.PerformanceTest;
import performanceTestFactory.TestMaker;
import userInterface.DefaultMainUserInterdace;

/**
 * Used case test. Test the configuration performance test.
 * 
 */
public class ConfigureTest {

	@Test
	public void test() {
		DefaultMainUserInterdace defaultMainUserInterface = new DefaultMainUserInterdace();
		int kindOfTest = defaultMainUserInterface.askForKindOfTest();
		run(kindOfTest);
		System.out.println("¿Se han solicitado información para configurar la prueba? (1: Sí, 2: No)");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		assertEquals(answer,"1");
		System.out.println("¿La prueba se ha ejecutado correctamente para los parametros introducidos? (1: Sí, 2: No)");
		answer = scanner.next();		
		assertEquals(answer,"1");
		System.out.println("¿Se ha proporcionado información para acceder a los resultados? (1: Sí, 2: No)");
		answer = scanner.next();		
		assertEquals(answer,"1");
		scanner.close();
	}

	/**
	 * Run a test
	 * 
	 * @param kindOfTest The kind of test to be executed
	 */
	private static void run(int kindOfTest) {
		TestMaker testMaker = new TestMaker();
		PerformanceTest performanceTest = testMaker.createNewTest(kindOfTest);
		performanceTest.run();
	}

}
