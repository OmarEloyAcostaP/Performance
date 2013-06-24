package performanceTestFactory;

/**
 * 
 * Performance load test of Profiler. Generation process. 
 *
 */
public class OriginalProfilerOutputLoadTest extends LoadProfilerTest  {

	private static String PROFILER_PATH_LINUX = "lib/OriginalProfilerSalidaPruebas.jar";
	private static String PROFILER_PATH_WIN = "lib\\OriginalProfilerSalidaPruebas.jar";

	public OriginalProfilerOutputLoadTest(){
		super();
		System.out.println("--- PROFLER VERSION ORIGINAL. PRUEBA DE CARGA. SALIDA. ---");
	}
	
	@Override
	public String getProfilerPath() {
		if (getOperativeSystemName().startsWith("win"))
			return (PROFILER_PATH_WIN);
		else
			return PROFILER_PATH_LINUX;
	}

}
