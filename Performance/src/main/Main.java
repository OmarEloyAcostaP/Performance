package main;

import performanceTestFactory.PerformanceTest;
import performanceTestFactory.TestMaker;
import userInterface.DefaultMainUserInterdace;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultMainUserInterdace defaultMainUserInterface = new DefaultMainUserInterdace();
		defaultMainUserInterface.welcomeText();
		int kindOfTest = defaultMainUserInterface.askForKindOfTest();
		run(kindOfTest);
		defaultMainUserInterface.goodbyeText();
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
