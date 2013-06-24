package fileManager;

import results.Results;


public abstract class FileManager {
	
	private Results results;
	
	/**
	 * Create a executable java command.
	 * 
	 * @param ramValue The value of the heap memory for the process.
	 * @param jarPath The path of the jar file.
	 * @return The command.
	 */
	public abstract String getCommand(int ramValue, String jarPath);
	
	/**
	 * Delete the files: input, output, temporalResutls and console.
	 */
	public abstract void deleteFiles();
	
	/**
	 * Close the class. It is need in order to close the file readers and writers.
	 */
	public abstract void close();
	
	/**
	 * Add a new result to the results file.
	 */
	public abstract void addResult();
	
	/**
	 * Auto-generate and set the next files: inputFile, outputFile, consoleFile and resultsFile,
	 * temporalResults.
	 * 
	 * @param args Argument for the creation of the inputFile. The length of the vector implies 
	 * the number of groups, and the value the value of HouseHoldCount.
	 */
	public abstract void autoGenerateFiles(String[] args);

	/**
	 * Check whether the test is stressed or not.
	 * 
	 * @return <code>true</code> if stressed <code>false</code> otherwise.
	 */
	public abstract boolean isStressed();

	/**
	 * Get the instance of the results manager.
	 * 
	 * @return The results manager.
	 */
	public Results getResults() {
		return results;
	}

	/**
	 * To set the results manager.
	 * 
	 * @param results The result manager to be set.
	 */
	public void setResults(Results results) {
		this.results = results;
	}
}
