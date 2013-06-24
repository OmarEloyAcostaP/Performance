package performanceTestFactory;

/**
 * 
 * Performance stress test of Profiler improved version 
 *
 */
public class ImprovedProfilerStressTest extends StressProfilerTest {
	private static String PROFILER_PATH_LINUX = "lib/ImprovedProfilerPruebas.jar";
	private static String PROFILER_PATH_WIN = "lib\\ImprovedProfilerPruebas.jar";

	public ImprovedProfilerStressTest() {
		super();
		System.out.println("--- PROFLER NUEVA VERSION. PRUEBA DE ESTRES. ---");
	}

	@Override
	public String getProfilerPath() {
		if (getOperativeSystemName().startsWith("win"))
			return (PROFILER_PATH_WIN);
		else
			return PROFILER_PATH_LINUX;
	}
}
