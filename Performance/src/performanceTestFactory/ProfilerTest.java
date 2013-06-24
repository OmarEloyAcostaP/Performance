package performanceTestFactory;

import userInterface.DefaultUserInterface;
import fileManager.DefaultFileManager;

/**
 * 
 * Performance test of Profiler.
 * 
 */
public abstract class ProfilerTest extends PerformanceTest{
		
	public ProfilerTest(){
		super();
		setFileManager(new DefaultFileManager());
		setUserInterface(new DefaultUserInterface());
		getCharacteristics();
	}
	
	/**
	 * To get the executable Profiler path
	 * 
	 * @return The executable Profiler path
	 */
	public abstract String getProfilerPath();
	
	/**
	 * To get the characteristics of the test
	 */
	public abstract void getCharacteristics();
	
	/**
	 * Run a test
	 */
	@Override
	public void run(){
		for (int locationGroups = getStarLimit(); 
				locationGroups <= getEndLimit(); 
				locationGroups += getIncrementLimit()) {
			
			System.out.println("--->" + locationGroups);
			
			getFileManager().autoGenerateFiles(new String[] { "1", locationGroups + "" });
			
			String command = getFileManager().getCommand(getMemoryValue(), getProfilerPath());
			execute(command);
			
			if (getFileManager().isStressed()){
				System.out.println("Punto de estrés encontrado.");
				break;
			}
			
			getFileManager().addResult();
			getFileManager().deleteFiles();
			
			System.out.println("");
		}
		getFileManager().close();
	}	
}
