package performanceTestFactory;

/**
 * 
 * Performance stress test of Simulator improved version. Load and Generation process. 
 *
 */
public class ImprovedSimulatorGenerationStressTest extends StressSimulatorTest {
	private static String SIMLATOR_PATH_LINUX = "lib/ImprovedSimuladorGeneracionPruebas.jar";
	private static String SIMLATOR_PATH_WIN = "lib\\ImprovedSimuladorGeneracionPruebas.jar";
	private static String PROFILER_PATH_LINUX = "lib/OriginalProfiler.jar";
	private static String PROFILER_PATH_WIN = "lib\\OriginalProfiler.jar";

	public ImprovedSimulatorGenerationStressTest() {
		super();
		System.out.println("--- SIMULADOR NUEVA VERSION. PRUEBA DE ESTRES. ENTRADA Y GENERACION DEL MODELO DE SIMULACION ---");
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
