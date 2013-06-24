package performanceTestFactory;

/**
 * 
 * Performance load test of Simulator. Load process. 
 *
 */
public class OriginalSimulatorInputLoadTest extends LoadSimulatorTest {
	private static String SIMLATOR_PATH_LINUX = "lib/OriginalSimuladorPruebas.jar";
	private static String SIMLATOR_PATH_WIN = "lib\\OriginalSimuladorPruebas.jar";
	private static String PROFILER_PATH_LINUX = "lib/OriginalProfiler.jar";
	private static String PROFILER_PATH_WIN = "lib\\OriginalProfiler.jar";

	public OriginalSimulatorInputLoadTest() {
		super();
		System.out
				.println("--- SIMULADOR VERSION ORIGINAL. PRUEBA DE CARGA. ENTRADA. ---");

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
