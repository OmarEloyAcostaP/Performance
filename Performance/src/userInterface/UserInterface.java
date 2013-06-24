package userInterface;

/**
 * 
 * User interface to be used for asking the test characteristics.
 *
 */
public interface UserInterface {
	/**
	 * Ask the user the start limit.
	 * 
	 * @return The start limit.
	 */
	public abstract int askForStartLimit();
	
	/**
	 * Ask the user the end limit.
	 * 
	 * @return The end limit.
	 */
	public abstract int askForEndLimit();
	
	/**
	 * Ask the user the increment of limit
	 * 
	 * @return The increment of the limit
	 */
	public abstract int askForIncrementLimit();
	
	/**
	 * Ask the user the values of the memory to be used as maximum heap memory process.
	 * 
	 * @return The heap memory value.
	 */
	public abstract int askForMemoryValue();	
}
