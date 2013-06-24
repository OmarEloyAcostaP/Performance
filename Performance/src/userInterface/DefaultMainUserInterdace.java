package userInterface;

import java.util.Scanner;

public class DefaultMainUserInterdace implements MainUserInterface{

	@SuppressWarnings("resource")
	@Override
	public int askForKindOfTest() {
		boolean advisor = false;
		int kindOfTest = 0;

		while (!advisor) {
			System.out
					.println("Seleccione la prueba que desea realizar. \n"
							+ "Para ello, tecleé un número del 1 al 14 y pulse la tecla ENTER.");
			System.out.println("Prueba de Rendimiento");
			System.out.println("|	Herramienta Profiler");
			System.out.println("|	|	Versión original");
			System.out.println("|	|	|	Proceso de Carga");
			System.out.println("|	|	|	|	Prueba de Carga  ---> 1");
			System.out.println("|	|	|	|	Prueba de Estrés ---> 2");
			System.out.println("|	|	|	Proceso de Generación");
			System.out.println("|	|	|	|	Prueba de Carga  ---> 3");
			System.out.println("|	|	|	|	Prueba de Estrés ---> 4");
			System.out.println("|	|	|	Proceso de Carga, Ejecución y Generación");
			System.out.println("|	|	|	|	Prueba de Carga  ---> 5");
			System.out.println("|	|	|	|	Prueba de Estrés ---> 6");
			System.out.println("|	|	Versión mejorada");
			System.out.println("|	|	|	Prueba de Carga  ---> 7");
			System.out.println("|	|	|	Prueba de Estrés ---> 8");
			System.out.println("|	Herramienta Simulador");
			System.out.println("|	|	Versión original");
			System.out.println("|	|	|	Proceso de Carga");
			System.out.println("|	|	|	|	Prueba de Carga  ---> 9");
			System.out.println("|	|	|	|	Prueba de Estrés ---> 10");
			System.out.println("|	|	|	Proceso de Carga y Generación");	
			System.out.println("|	|	|	|	Prueba de Carga  ---> 11");
			System.out.println("|	|	|	|	Prueba de Estrés ---> 12");
			System.out.println("|	|	Versión mejorada");
			System.out.println("|	|	|	Prueba de Carga  ---> 13");
			System.out.println("|	|	|	Prueba de Estrés ---> 14");
			System.out.println("");
			kindOfTest = new Scanner(System.in).nextInt();

			if ((kindOfTest < 1) || (kindOfTest > 14))
				System.out
						.println("El número no es válido. Pruebe otra vez.");
			else
				advisor = true;
		}
		return kindOfTest;
	}
	
	public void goodbyeText() {
		System.out.println("Gracias por utilizar esta aplicación");
	}

	public void welcomeText() {
		System.out
				.println("Esta aplicación ha sido desarrollada para el Proyecto Fin de Carrera: "
						+ "APLICACIÓN DE LA METODOLOGIA DE DISEÑO DIRIGIDO POR LA PRUEBA (TDD) "
						+ "PARA LA MEJORA DEL FRAMEWORK TAFAT. Escuela de Ingeniería Informática de"
						+ " la Universidad de Las Palmas de Gran Canaria. Marzo de 2013");
	}
}
