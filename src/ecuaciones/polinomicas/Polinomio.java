package ecuaciones.polinomicas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Polinomio {
	
	
	private int grado;
	private double[] coeficientes;

	
	/**
	 * Constructor parametrizado de la clase
	 * 
	 * @param grado
	 * @param coeficientes
	 */
	public Polinomio(int grado, double[] coeficientes) {
		this.grado = grado;
		this.coeficientes = coeficientes;
	}

	/**
	 * Constructor de la clase mediante la ruta del archivo input
	 * 
	 * @param pathArchivoIn
	 */
	public Polinomio(String pathArchivoIn) {		
		
		
		try {
			// Con scanner leo el contenido del archivo
			Scanner sc = new Scanner(new File(pathArchivoIn));		
			sc.useLocale(Locale.ENGLISH);
			//asigno el grado del polinomio
			this.grado = sc.nextInt();
			//inicializo vecotr de coeficientes
			this.coeficientes = new double[this.grado+1];			
			//asigno los coeficientes del polinomio en el vector
			for (int i = 0; i < this.grado+1 ; i++) {
				this.coeficientes[i] =sc.nextDouble();
			}
		
			sc.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	double evaluarMSucesivas(double x) {
		return x;
	}

	double evaluarRecursiva(double x) {
		return x;
	}

	double evaluarRecursivaPar(double x) {
		return x;
	}

	double evaluarProgDinamica(double x) {
		return x;
	}

	double evaluarMejorada(double x) {
		return x;

	}

	double evaluarPow(double x) {
		return x;

	}

	double evaluarHorner(double x) {
		return x;

	}

	/**
	 * Multiplicacion de dos polinomios
	 * 
	 * @param poli
	 * @return
	 */
	Polinomio productoPolinomio(Polinomio poli) {

		//inicializo vecotr de coeficientes
		double coeficientes[] = new double[this.grado + poli.grado+1];
		//Creo el polinomio resultado
		Polinomio poliResultado = new Polinomio(this.grado + poli.grado,
				coeficientes);
		int gradoA = 0;
		int gradoB = 0;

		for (int i = 0; i < this.grado + 1; i++) {
			for (int j = 0; j < poli.grado + 1; j++) {

				gradoA = this.grado - i;
				gradoB = poli.grado - j;

				poliResultado.coeficientes[gradoA + gradoB] += this.coeficientes[i]
						* poli.coeficientes[j];
			}

		}		
		return    poliResultado;
	}

	/**
	 * Muestra por pantalla el polinomio de la forma 1X^2 + 2X + 6 
	 */
	public void mostrarPolinomio() {

		for (int i = 0; i < (this.grado); i++) {
			System.out.print(this.getCoeficientes()[i]+"X"+"^"+(this.grado-i)+" + ");
		}
		System.out.print(this.getCoeficientes()[this.grado]);
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public double[] getCoeficientes() {
		return coeficientes;
	}

	public void setCoeficientes(double[] coeficientes) {
		this.coeficientes = coeficientes;
	}

}
