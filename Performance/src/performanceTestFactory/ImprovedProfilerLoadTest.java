package performanceTestFactory;

/**
 * 
 * Performance load test of Profiler improved version 
 *
 */
public class ImprovedProfilerLoadTest extends LoadProfilerTest{
	private static String PROFILER_PATH_LINUX = "lib/ImprovedProfilerPruebas.jar";
	private static String PROFILER_PATH_WIN = "lib\\ImprovedProfilerPruebas.jar";
	
	public ImprovedProfilerLoadTest () {
		super();
		System.out.println("--- PROFLER NUEVA VERSION. PRUEBA DE CARGA. ---");
	}
	
	@Override
	public String getProfilerPath() {
		if (getOperativeSystemName().startsWith("win"))
			return (PROFILER_PATH_WIN);
		else
			return PROFILER_PATH_LINUX;
	}
}
