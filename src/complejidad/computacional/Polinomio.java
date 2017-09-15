package complejidad.computacional;

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
			// asigno el grado del polinomio
			this.grado = sc.nextInt();
			// inicializo vecotr de coeficientes
			this.coeficientes = new double[this.grado + 1];
			// asigno los coeficientes del polinomio en el vector
			for (int i = 0; i < this.grado + 1; i++) {
				this.coeficientes[i] = sc.nextDouble();
			}

			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Utilizo calculo de potencia por multiplicaciones sucesivas. Realizado en
	 * metodo "potencia"
	 * 
	 * Complejidad computacional = O(n2)
	 * 
	 * @param x
	 * @return
	 */
	double evaluarMSucesivas(double x) {

		int resultado = 0;
		int gradoTermino;

		for (int i = 0; i < this.grado + 1; i++) {
			gradoTermino = this.grado - i;

			resultado += this.coeficientes[i] * potencia(x, gradoTermino);
		}
		return resultado;
	}

	/**
	 * Utilizo el calculo de potencias recursivamente sin tener en cuenta si el
	 * exponente si es par o impar. Ultilizo el metodo "potenciaRecursiva"
	 * 
	 * Complejidad Computacional = O(n) + O(n) = O(n)
	 * 
	 * @param x
	 * @return
	 */
	double evaluarRecursiva(double x) {

		int resultado = 0;
		int gradoTermino;

		for (int i = 0; i < this.grado + 1; i++) {
			gradoTermino = this.grado - i;

			resultado += this.coeficientes[i]
					* potenciaRecursiva(x, gradoTermino);
		}
		return resultado;
	}

	/**
	 * Utilizo el calculo de potencias recursivamente teniendo en cuenta si el
	 * exponente es par o impar. Ultilizo el metodo "potenciaRecursivaPar" y
	 * "potenciaRecursiva"
	 * 
	 * Complejidad Computacional = O(n) + O(n) + (LOG n) = O(n) 
	 * 
	 * @param x
	 * @return
	 */
	double evaluarRecursivaPar(double x) {
		int resultado = 0;
		int gradoTermino;

		for (int i = 0; i < this.grado + 1; i++) {
			gradoTermino = this.grado - i;

			if (gradoTermino % 2 == 0)
				resultado += this.coeficientes[i]
						* potenciaRecursivaPar(x, gradoTermino);
			else
				resultado += this.coeficientes[i]
						* potenciaRecursiva(x, gradoTermino);

		}
		return resultado;

	}

	double evaluarProgDinamica(double x) {
		return x;
	}

	double evaluarMejorada(double x) {
		double resultado = 0;
		
		
		return resultado;

	}

	/**
	 * evaluo el calculo del polinomio utilizando el metodo Math.pow
	 * 
	 * Complejidad Computacional = O(n)
	 * 
	 * @param x
	 * @return
	 */
	double evaluarPow(double x) {
		int resultado = 0;
		int gradoTermino;

		for (int i = 0; i < this.grado + 1; i++) {
			gradoTermino = this.grado - i;

			resultado += this.coeficientes[i] * Math.pow(x, gradoTermino);
		}
		return resultado;

	}

	/**
	 * el Algoritmo de Horner, es un algoritmo para evaluar de forma eficiente
	 * funciones polinómicas de una forma monomial.
	 * 
	 * Complejidad Computacional = O(n)
	 * 
	 * @param x
	 * @return
	 */
	double evaluarHorner(double x) {
		double resultado = 0;

		resultado = this.coeficientes[0] * x + this.coeficientes[1];

		for (int i = 2; i < this.getGrado() + 1; i++)
			resultado = (resultado * x) + this.coeficientes[i];

		return resultado;

	}

	/**
	 * Metodo iterativo para calcular la potencia de un numero
	 * 
	 * Complejidad Computacional = O(n)
	 * 
	 * @param base
	 * @param exponente
	 * @return
	 */
	public static double potencia(double base, int exponente) {

		double resultado = 0;

		if (exponente == 0)
			return 1;

		for (int i = 0; i < exponente; i++) {
			resultado *= base;
		}

		return resultado;
	}

	/**
	 * Metodo recursivo para calcular la potencia de un numero sin evaluar que
	 * el exponente sea par o impar
	 * 
	 * Complejidad Computacional = O(n)
	 * 
	 * @param base
	 * @param exponente
	 * @return
	 */
	public static double potenciaRecursiva(double base, int exponente) {

		if (exponente == 0)
			return 1;
		return base * potenciaRecursiva(base, exponente - 1);
	}

	/**
	 * Metodo recursivo para calcular la potencia de un numero evaluando que el
	 * exponente sea par
	 * 
	 * Complejidad Computacional = O(LOG n)
	 * 
	 * @param base
	 * @param exponente
	 * @return
	 */
	public double potenciaRecursivaPar(double base, int exponente) {

		if (exponente == 0)
			return 1;
		return potenciaRecursivaPar(base * base, exponente / 2);
	}

	/**
	 * Muestra por pantalla el polinomio de la forma 1X^2 + 2X + 6
	 */
	public void mostrarPolinomio() {

		for (int i = 0; i < (this.grado); i++) {
			System.out.print(this.getCoeficientes()[i] + "X" + "^"
					+ (this.grado - i) + " + ");
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
