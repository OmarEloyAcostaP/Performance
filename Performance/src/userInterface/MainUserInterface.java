package userInterface;

public interface MainUserInterface {
	/**
	 * Ask for the kind of test.
	 * 
	 * @return The kind of test typed by the user.
	 */
	public int askForKindOfTest();
	
	/**
	 * Give the user the goodbye message.
	 */
	public void goodbyeText();
	
	/**
	 * Give the user the welcome message.
	 */
	public void welcomeText();
}
