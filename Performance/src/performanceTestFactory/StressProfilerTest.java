package performanceTestFactory;

/**
 * Performance stress test of Profiler.
 * 
 */
public abstract class StressProfilerTest extends ProfilerTest {

	public StressProfilerTest() {
		super();
	}
	
	@Override
	public abstract String getProfilerPath();

	@Override
	public void getCharacteristics() {
		setStarLimit(getUserInterface().askForStartLimit());
		setEndLimit(Integer.MAX_VALUE);
		setIncrementLimit(getUserInterface().askForIncrementLimit());
		setMemoryValue(getUserInterface().askForMemoryValue());
	}

}
