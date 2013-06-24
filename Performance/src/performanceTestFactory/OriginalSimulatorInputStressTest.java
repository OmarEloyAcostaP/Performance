package performanceTestFactory;

/**
 * 
 * Performance stress test of Simulator. Load process. 
 *
 */
public class OriginalSimulatorInputStressTest extends StressSimulatorTest {
	private static String SIMLATOR_PATH_LINUX = "lib/OriginalSimuladorPruebas.jar";
	private static String SIMLATOR_PATH_WIN = "lib\\OriginalSimuladorPruebas.jar";
	private static String PROFILER_PATH_LINUX = "lib/OriginalProfiler.jar";
	private static String PROFILER_PATH_WIN = "lib\\OriginalProfiler.jar";

	public OriginalSimulatorInputStressTest() {
		super();
		System.out.println("--- SIMULADOR VERSION ORIGINAL. PRUEBA DE ESTRESS. ENTRADA. ---");

	}

	@Override
	public String getProfilerPath() {
		if (getOperativeSystemName().startsWith("win"))
			return (PROFILER_PATH_WIN);
		else
			return PROFILER_PATH_LINUX;
	}

	@Override
	public String getSimulatorPath() {
		if (getOperativeSystemName().startsWith("win"))
			return (SIMLATOR_PATH_WIN);
		else
			return SIMLATOR_PATH_LINUX;
	}
}
