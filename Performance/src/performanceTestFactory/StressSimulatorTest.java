package performanceTestFactory;

/**
 * Performance stress test of Simulator.
 * 
 */
public abstract class StressSimulatorTest extends SimulatorTest {

	public StressSimulatorTest() {
		super();
	}
	
	@Override
	public void getCharacteristics() {
		setStarLimit(getUserInterface().askForStartLimit());
		setEndLimit(Integer.MAX_VALUE);
		setIncrementLimit(getUserInterface().askForIncrementLimit());
		setMemoryValue(getUserInterface().askForMemoryValue());
	}

	@Override
	public abstract String getProfilerPath();

	@Override
	public abstract String getSimulatorPath();

}
