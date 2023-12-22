package org.cuatrovientos.dam.ed.ejemplo2ev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */

/**
 *
 */
public class Calculadora {
	private static Logger logger = LogManager.getLogger();
	/**
	 * Método main de ejecución, esxribe un log y hace una suma param argd rl nomre
	 * a pintar en el LOG, ojo que tiene que tener un solo valor el array
	 */
	private String operacionEnCurso;

	public Calculadora(String operacionEnCurso) {
		super();
		this.operacionEnCurso = operacionEnCurso;
	}

	public String getOperacionEnCurso() {
		return operacionEnCurso;
	}

	public void setOperacionEnCurso(String operacionEnCurso) {
		this.operacionEnCurso = operacionEnCurso;
	}

	public static int main(String[] args) {
		System.out.println("Hello World!");
		logger.error("Otro Hello World 1DAM" + args[1]);
		// TODO: Crear una función que haga suma
		Calculadora miCalculadora = new Calculadora(operacionEnCurso);
		switch (args(0)) {
		case "sumar":
			int resultado = sumar(args(1)+args(0));
			break;

		default:
			break;
		}

	
	int sumar(String numero1;String numero2) {
	int numero1Int= Integer.valueOf(numero1);
	int numero2Int= Integer.valueOf(numero2);
	return numero1Int+ numero2Int+1;
	
	
}

}

	private static int sumar(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int args(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
