package performanceTestFactory;

/**
 * 
 * Performance load test of Profiler. 
 *
 */
public abstract class LoadProfilerTest extends ProfilerTest {

	public LoadProfilerTest() {
		super();
	}
	
	@Override
	public abstract String getProfilerPath();

	@Override
	public void getCharacteristics() {
		setStarLimit(getUserInterface().askForStartLimit());
		setEndLimit(getUserInterface().askForEndLimit());
		setIncrementLimit(getUserInterface().askForIncrementLimit());
		setMemoryValue(getUserInterface().askForMemoryValue());
	}	
}
