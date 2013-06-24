package performanceTestFactory;

/**
 * 
 * Performance load test of Profiler. 
 *
 */
public class OriginalProfilerLoadTest extends LoadProfilerTest {
	private static String PROFILER_PATH_LINUX = "lib/OriginalProfilerPruebas.jar";
	private static String PROFILER_PATH_WIN = "lib\\OriginalProfilerPruebas.jar";

	public OriginalProfilerLoadTest () {
		super();
		System.out.println("--- PROFLER VERSION ORIGINAL. PRUEBA DE ESTRES. SALIDA ---");
	}
	
	@Override
	public String getProfilerPath() {
		if (getOperativeSystemName().startsWith("win"))
			return (PROFILER_PATH_WIN);
		else
			return PROFILER_PATH_LINUX;
	}
}
