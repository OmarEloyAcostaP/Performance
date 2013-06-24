package performanceTestFactory;

/**
 * 
 * Performance load test of Simulator. 
 *
 */
public abstract class LoadSimulatorTest extends SimulatorTest {

	public LoadSimulatorTest() {
		super();
	}
	
	@Override
	public void getCharacteristics() {
		setStarLimit(getUserInterface().askForStartLimit());
		setEndLimit(getUserInterface().askForEndLimit());
		setIncrementLimit(getUserInterface().askForIncrementLimit());
		setMemoryValue(getUserInterface().askForMemoryValue());
	}

	@Override
	public abstract String getProfilerPath();

	@Override
	public abstract String getSimulatorPath();
	
}
