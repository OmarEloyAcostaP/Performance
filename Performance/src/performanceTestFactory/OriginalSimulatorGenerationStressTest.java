package performanceTestFactory;

/**
 * 
 * Performance stress test of Simulator. Generation process. 
 *
 */
public class OriginalSimulatorGenerationStressTest extends StressSimulatorTest {
	private static String SIMLATOR_PATH_LINUX = "lib/OriginalSimuladorGeneracionPruebas.jar";
	private static String SIMLATOR_PATH_WIN = "lib\\OriginalSimuladorGeneracionPruebas.jar";
	private static String PROFILER_PATH_LINUX = "lib/OriginalProfiler.jar";
	private static String PROFILER_PATH_WIN = "lib\\OriginalProfiler.jar";

	public OriginalSimulatorGenerationStressTest() {
		super();
		System.out.println("--- SIMULADOR VERSION ORIGINAL. PRUEBA DE ESTRESS. ENTRADA Y GENERACIÓN DEL SIMULADOR. ---");

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
