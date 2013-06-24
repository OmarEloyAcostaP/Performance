package performanceTestFactory;

import userInterface.DefaultUserInterface;
import fileManager.DefaultFileManager;

/**
 * 
 * Performance load test of Simulator. 
 *
 */
public abstract class SimulatorTest extends PerformanceTest {

	public SimulatorTest(){
		super();		
		setFileManager(new DefaultFileManager());
		setUserInterface(new DefaultUserInterface());
		getCharacteristics();
	}	
	
	/**
	 * To get the characteristics of a test 
	 */
	public abstract void getCharacteristics();

	/**
	 * To get the executable Profiler path
	 * 
	 * @return The executable Profiler path
	 */
	public abstract String getProfilerPath();
	
	/**
	 * To get the executable Simulator path
	 * 
	 * @return The executable Simulator path
	 */
	public abstract String getSimulatorPath();
	
	@Override
	public void run(){
		for (int locationGroups = getStarLimit(); locationGroups <= getEndLimit(); locationGroups += getIncrementLimit()) {

			System.out.println("--->" + locationGroups);

			getFileManager().autoGenerateFiles(new String[] {"1", locationGroups + "" });
			System.out.println("Generando modelo.");
			String profilerCommand = getFileManager().getCommand(getMemoryValue() + 128, getProfilerPath());
			execute(profilerCommand);

			System.out.println("Ejecutando Simulador.");
			String simulatorCommand = getFileManager().getCommand(getMemoryValue(), getSimulatorPath());
			execute(simulatorCommand);

			if (getFileManager().isStressed()) {
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
