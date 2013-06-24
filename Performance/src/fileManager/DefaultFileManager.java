package fileManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import results.Results;

public class DefaultFileManager extends FileManager {
	private String resultsFolder;
	private String resultsFileName;
	private int varibleIndex;

	public DefaultFileManager() {
		this.varibleIndex = 0;
		this.setResults(new Results());
		makeFileAndFolderResutls();
		System.out.println("\nEl resultado de la ejecución estará " +
				"disponible una vez termine la prueba en: \n" + 
				new File(this.resultsFolder).getAbsolutePath() + "\n");

		this.getResults().createResultFile(this.resultsFileName);
	}

	/**
	 * Create a folder where to save the files.
	 */
	@SuppressWarnings("deprecation")
	private void makeFileAndFolderResutls() {
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		this.resultsFolder = "dia" + cal.getTime().getDate() + "mes"
				+ cal.getTime().getMonth() + "hora" + cal.getTime().getHours()
				+ "-" + cal.getTime().getMinutes()
				+ getOperativeSystemSeparator();
		new File(this.resultsFolder).mkdirs();
		this.resultsFileName = this.resultsFolder + "resultados.xls";
		createNewFile(this.resultsFileName);
	}

	@Override
	public void deleteFiles() {
		new File(getInputFileName()).delete();
		new File(getConsoleFileName()).delete();
		new File(getOutputFileName()).delete();
		new File(getTemporalResultsFileName()).delete();
	}

	/**
	 * Get the name
	 *  of the console file.
	 * 
	 * @return the name of the console file.
	 */
	private String getConsoleFileName() {
		return this.resultsFolder + "console-" + varibleIndex + ".txt";
	}

	/**
	 * Get the name of the input file.
	 * 
	 * @return the name of the input file.
	 */
	private String getInputFileName() {
		return this.resultsFolder + "input-" + varibleIndex + ".xml";
	}

	/**
	 * Get the name of the output file.
	 * 
	 * @return the name of the output file.
	 */
	private String getOutputFileName() {
		return this.resultsFolder + "output-" + varibleIndex + ".xml";
	}

	/**
	 * Get the name of the temporalResults file.
	 * 
	 * @return the name of the temporalResults file.
	 */
	private String getTemporalResultsFileName() {
		return this.resultsFolder + "temporalResults-" + varibleIndex + ".txt";
	}

	/**
	 * Create a profiled file.
	 * 
	 * @param args
	 *            Argument used to create the inputFile. args[0] has the number
	 *            of houseHodlCount and args[1] has the value of houseHoldCount.
	 */
	private void createAndSetProfiledFile(String[] args) {
		FileWriter fstream = null;
		BufferedWriter out = null;
		try {
			fstream = new FileWriter(getInputFileName());
			out = new BufferedWriter(fstream);
			out.write("<?xml version=\"1.0\"?>");
			out.write("<simulation from=\"15/01/1995 00:00:00\" to=\"15/01/1995 23:59:59\">");
			out.write("<scene>");
			for (int index = 1; index <= Integer.parseInt(args[0]); index++) {
				out.write(writeLocationGroup(args[1]));
			}
			out.write("</scene>");
			out.write("<topology>");
			out.write("</topology>");
			out.write("</simulation>");
			out.close();
			fstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Get a location group.
	 * 
	 * @param houseHoldCount
	 *            The houseHoldCount value to set.
	 * @return The location group.
	 */
	private String writeLocationGroup(String houseHoldCount) {
		return "<outdoorfull>\n"
				+ "	<locationsgroupfull id=\""
				+ "idNoDefinided"
				+ "\">\n"
				+ "		<profiler-Household release=\"Statistical\" householdCount=\""
				+ houseHoldCount
				+ "\" "
				+ "hDatFile=\"hSocialgroups.xml\" pcDatFile=\"pcSocialgroups.xml\"/>\n"
				+ "	</locationsgroupfull>\n" + "</outdoorfull>";
	}

	/**
	 * Create a new file.
	 * 
	 * @param filePath
	 *            The path and name of the file to be created.
	 */
	private void createNewFile(String fileName) {
		try {
			new File(fileName).createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void autoGenerateFiles(String[] args) {
		changeContext(args);
		createAndSetProfiledFile(args);
		createNewFile(getConsoleFileName());
		createNewFile(getOutputFileName());
		createNewFile(getTemporalResultsFileName());
	}

	/**
	 * Change the context for a new test.
	 * 
	 * @param args
	 *            Argument for the creation of the inputFile.
	 */
	private void changeContext(String[] args) {
		if (Integer.parseInt(args[0]) == 1)
			this.varibleIndex = Integer.parseInt(args[1]);
		else
			this.varibleIndex = Integer.parseInt(args[0]);
	}

	/**
	 * Get the operative system separator.
	 * 
	 * @return <code>\\</code> if Windows <code>/</code> otherwise.
	 */
	private String getOperativeSystemSeparator() {
		if (getOperativeSystem().startsWith("win"))
			return new String("\\");
		else
			return new String("/");
	}

	/**
	 * Get the system operative name
	 * 
	 * @return The system operative name
	 */
	private String getOperativeSystem() {
		return System.getProperty("os.name").toLowerCase();
	}

	@Override
	public String getCommand(int ramValue, String jarPath) {
		String path = new File("").getAbsolutePath();
		return new String("java -Xmx" + ramValue + "m -jar " + path
				+ getOperativeSystemSeparator() + jarPath + " " + path
				+ getOperativeSystemSeparator() + getInputFileName() + " "
				+ path + getOperativeSystemSeparator() + getOutputFileName()
				+ " " + path + getOperativeSystemSeparator()
				+ getConsoleFileName() + " " + path
				+ getOperativeSystemSeparator() + getTemporalResultsFileName());
	}

	@Override
	public void addResult() {
		getResults().addResult(getTemporalResultsFileName(), this.varibleIndex);
	}

	@Override
	public void close() {
		getResults().close();
	}

	@Override
	public boolean isStressed() {
		return new File(getTemporalResultsFileName()).length() == 0;
	}
}
