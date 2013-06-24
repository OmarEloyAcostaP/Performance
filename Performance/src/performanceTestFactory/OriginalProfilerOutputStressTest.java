package performanceTestFactory;

/**
 * 
 * Performance stress test of Profiler. Generation process. 
 *
 */
public class OriginalProfilerOutputStressTest extends StressProfilerTest {

	private static String PROFILER_PATH_LINUX = "lib/OriginalProfilerSalidaPruebas.jar";
	private static String PROFILER_PATH_WIN = "lib\\OriginalProfilerSalidaPruebas.jar";

	public OriginalProfilerOutputStressTest() {
		super();
		System.out.println("--- PROFLER VERSION ORIGINAL. PRUEBA DE ESTRES. SALIDA. ---");

	}

	@Override
	public  String getProfilerPath() {
		if (getOperativeSystemName().startsWith("win"))
			return (PROFILER_PATH_WIN);
		else
			return PROFILER_PATH_LINUX;
	}
}
