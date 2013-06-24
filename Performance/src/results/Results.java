package results;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Results extends ResultsManager {

	private Writer fstream;
	private BufferedWriter out;

	/**
	 *  Make a file to put the results of the test
	 */
	@Override
	public void createResultFile(String path) {
		try {
			this.fstream = new FileWriter(new File(path));
			this.out = new BufferedWriter(fstream);
			this.out.write("HouseHoldCount#TotalMemoryBefore(MB)#FreeMemoryBefore(KB)"
					+ "#Time(S)#FreeMemoryAfter(MB)#TotalmemoryAfter(MB)#MemoryConsumed(KB)");
			this.out.newLine();
			this.out.flush();
		} catch (IOException e) {
			e.printStackTrace();
			Runtime.getRuntime().exit(0);
		}
	}

	@Override
	public void addResult(String path, int houseHoldCount) {
		try {
			FileInputStream resultFileReader = new FileInputStream(
					path);
			DataInputStream in = new DataInputStream(resultFileReader);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine = null;

			strLine = houseHoldCount + "#";
			out.write(strLine);
			
			strLine = br.readLine();
			out.write(strLine + "#");
			System.out.println("Previo a la ejecución. Memoria Total (MB): " + strLine);
			
			strLine = br.readLine();
			out.write(strLine + "#");			
			System.out.println("Previo a la ejecución. Memoria libre (MB): " + strLine);
			
			strLine = br.readLine();
			out.write(strLine + "#");			
			System.out.println("Tiempo transcurrido durante la ejecución (Segundos): " + strLine);
			
			strLine = br.readLine();
			out.write(strLine + "#");
			System.out.println("Posterior a la ejecución. Memoria libre (MB): " + strLine);
			
			strLine = br.readLine();
			out.write(strLine + "#");
			System.out.println("Posterior a la ejecución. Memoria Total (MB): " + strLine);
			
			strLine = br.readLine();
			out.write(strLine + "#");
			System.out.println("Consumo de memoria durante la ejecución (MB): " + strLine);

			out.newLine();
			out.flush();
			br.close();
			in.close();
			resultFileReader.close();

		} catch (FileNotFoundException e1) {
			close();
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		try {
			out.close();
			fstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
