package performanceTestFactory;

/**
 * 
 * Performance stress test of Profiler. Load process. 
 *
 */
public class OriginalProfilerInputStressTest extends StressProfilerTest {

	private static String PROFILER_PATH_LINUX = "lib/OriginalProfilerEntradaPruebas.jar";
	private static String PROFILER_PATH_WIN = "lib\\OriginalProfilerEntradaPruebas.jar";

	public OriginalProfilerInputStressTest() {
		super();
		System.out.println("--- PROFLER VERSION ORIGINAL. PRUEBA DE ESTRES. ENTRADA ---");
	}

	@Override
	public void run() {
		for (int locationGroups = getStarLimit();
				locationGroups <= getEndLimit();
				locationGroups += getIncrementLimit()) {

			System.out
					.println("---------------------------------------------------");
			System.out.println("--->" + locationGroups);

			getFileManager().autoGenerateFiles(
					new String[] {locationGroups+"", locationGroups + ""});

			String command = getFileManager().getCommand(getMemoryValue(),
					getProfilerPath());
			execute(command);

			if (getFileManager().isStressed()) {
				System.out.println("Punto de estrés encontrado.");
				break;
			}

			getFileManager().addResult();
			getFileManager().deleteFiles();

			System.out.println("");
		}
		getFileManager().close();
	}

	@Override
	public String getProfilerPath() {
		if (getOperativeSystemName().startsWith("win"))
			return (PROFILER_PATH_WIN);
		else
			return PROFILER_PATH_LINUX;
	}
}
