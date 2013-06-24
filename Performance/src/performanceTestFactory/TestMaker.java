package performanceTestFactory;

/**
 * Performance test creator.
 * 
 */
public class TestMaker implements Maker{
	
	/**
	 * Return an instance of a performance test
	 */
	@Override
	public PerformanceTest createNewTest(int kindOfTest) {
		switch (kindOfTest) {
		case 1:
			return new OriginalProfilerInputLoadTest();
		case 2:
			return new OriginalProfilerInputStressTest();
		case 3:
			return new OriginalProfilerOutputLoadTest();
		case 4:
			return new OriginalProfilerOutputStressTest();
		case 5:
			return new OriginalProfilerLoadTest();
		case 6:
			return new OriginalProfilerStressTest();
		case 7:
			return new ImprovedProfilerLoadTest();
		case 8:
			return new ImprovedProfilerStressTest();
		case 9:
			return new OriginalSimulatorInputLoadTest();
		case 10:
			return new OriginalSimulatorInputStressTest();
		case 11:
			return new OriginalSimulatorGenerationLoadTest();
		case 12:
			return new OriginalSimulatorGenerationStressTest();
		case 13:
			return new ImprovedSimulatorGenerationLoadTest();
		case 14:
			return new ImprovedSimulatorGenerationStressTest();
		default:
			return null;
		}
	}
}

