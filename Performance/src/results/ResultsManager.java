package results;

public abstract class ResultsManager {
	/**
	 * Create and set a new resultFile.
	 * 
	 * @param path The path and name of resultFile.
	 */
	public abstract void createResultFile(String path);
	/**
	 * Add a a new result.
	 * 
	 * @param path Path of the temporalFile to be added as result.
	 * @param houseHoldCount The value of houseHoldCount
	 */
	public abstract void addResult(String path, int houseHoldCount);
	
	/**
	 * Close the results manger. It is needed to do after all results has been added.
	 */
	public abstract void close();
}
