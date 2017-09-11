package ecuaciones.polinomicas;

import java.util.Arrays;

public class Polinomio {
	private int grado;
	private double[] coeficientes;

	public Polinomio(int grado, double[] coeficientes) {
		this.grado = grado;
		this.coeficientes = coeficientes;
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
