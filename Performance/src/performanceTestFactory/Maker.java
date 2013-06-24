package performanceTestFactory;

public interface Maker {
	/**
	 * Return a new instance of a Tafat performance test
	 * 
	 * @param kindOfTest The kind if test to be instantiated
	 * @return The an test
	 */
	public abstract PerformanceTest createNewTest(int kindOfTest);
}
