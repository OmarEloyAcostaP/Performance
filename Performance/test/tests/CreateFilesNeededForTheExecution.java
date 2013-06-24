package tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import fileManager.DefaultFileManager;
import fileManager.FileManager;

/**
 * Used case test. Creation of the needed files for to execute a test.
 * 
 */
public class CreateFilesNeededForTheExecution {
	FileManager fileManager;
	
	@Test
	public void test() {
		this.fileManager = new DefaultFileManager();
		String[] args = new String[]{"1","1"};		
		fileManager.autoGenerateFiles(args);
		String command = fileManager.getCommand(0, "jarPath");
		String[] commandSplitted = command.split(" ");
		assertTrue(new File(commandSplitted[4]).exists());
		assertTrue(new File(commandSplitted[5]).exists());
		assertTrue(new File(commandSplitted[6]).exists());
		assertTrue(new File(commandSplitted[7]).exists());
		fileManager.deleteFiles();
		fileManager.close();		
	}

}
