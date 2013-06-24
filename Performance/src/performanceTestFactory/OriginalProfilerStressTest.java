package performanceTestFactory;

/**
 * 
 * Performance stress test of Profiler. 
 *
 */
public class OriginalProfilerStressTest extends StressProfilerTest {
	private static String PROFILER_PATH_LINUX = "lib/OriginalProfilerPruebas.jar";
	private static String PROFILER_PATH_WIN = "lib\\OriginalProfilerPruebas.jar";

	public OriginalProfilerStressTest() {
		super();
		System.out.println("--- PROFLER VERSION ORIGINAL. PRUEBA DE ESTRES. ---");

	}

	@Override
	public  String getProfilerPath() {
		if (getOperativeSystemName().startsWith("win"))
			return (PROFILER_PATH_WIN);
		else
			return PROFILER_PATH_LINUX;
	}

}
