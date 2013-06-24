package performanceTestFactory;

import java.io.IOException;
import userInterface.UserInterface;
import fileManager.FileManager;

/**
 * 
 * Performance Test of Tafat.
 *
 */
public abstract class PerformanceTest {

	private int starLimit;
	private int endLimit;
	private int incrementLimit;
	private int memoryValue;	
	private UserInterface userInterface;
	private FileManager fileManager;
	
	public PerformanceTest() {
		this.endLimit = 0;
		this.starLimit = 0;
		this.incrementLimit = 0;
		this.memoryValue = 0;
	}
	
	/**
	 * To get the user interface
	 * 
	 * @return The user interface
	 */
	protected UserInterface getUserInterface() {
		return userInterface;
	}

	/**
	 * To set the user interface
	 * 
	 * @param userInterface The user interface to be set
	 */
	protected void setUserInterface(UserInterface userInterface) {
		this.userInterface = userInterface;
	}

	/**
	 * To get the FileManager
	 * 
	 * @return The FileManager
	 */
	protected FileManager getFileManager() {
		return fileManager;
	}

	/**
	 * To ser the FileManager
	 * @param fileManager
	 */
	protected void setFileManager(FileManager fileManager) {
		this.fileManager = fileManager;
	}	
	
	/**
	 * To set the start limit of  the test
	 * 
	 * @param starLimit The limit to be set
	 */
	protected void setStarLimit(int starLimit) {
		this.starLimit = starLimit;
	}
	
	/**
	 * To set the end limit of  the test
	 * 
	 * @param endLimit The limit to be set
	 */
	protected void setEndLimit(int endLimit) {
		this.endLimit = endLimit;
	}

	/**
	 * To set the increment of the limit of the test
	 * 
	 * @param incrementLimit The increment to be set
	 */
	protected void setIncrementLimit(int incrementLimit) {
		this.incrementLimit = incrementLimit;
	}

	/**
	 * To set the value of the Heap memory area
	 * 
	 * @param memoryValue The value to be set
	 */
	protected void setMemoryValue(int memoryValue) {
		this.memoryValue = memoryValue;
	}

	/**
	 * To get the start limit of the test
	 * 
	 * @return The limit
	 */
	protected int getStarLimit() {
		return starLimit;
	}

	/**
	 * To get the start end of the test
	 * 
	 * @return The limit
	 */
	protected int getEndLimit() {
		return endLimit;
	}

	/**
	 * To get the increment limit of the test
	 * 
	 * @return The increment
	 */
	protected int getIncrementLimit() {
		return incrementLimit;
	}

	/**
	 * To get the value of the Heap memory area
	 * 
	 * @return The Heap memory value
	 */
	protected int getMemoryValue() {
		return memoryValue;
	}

	/**
	 * Get the system operative name
	 * 
	 * @return The system operative name
	 */
	protected String getOperativeSystemName() {
		return System.getProperty("os.name").toLowerCase();
	}

	/**
	 * Execute a test and wait for it to end.
	 * 
	 * @param command
	 *            The command to be executed.
	 */
	protected void execute(String command) {
		Process proc;
		try {
			proc = Runtime.getRuntime().exec(command);
			proc.waitFor();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Run the test
	 */
	public abstract void run();
}
