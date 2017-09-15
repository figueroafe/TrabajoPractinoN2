package complejidad.computacional;

public class BinomioDeNewton {

	private int a;
	private int b;
	private int exponente;

	/**
	 * Constructor de la clase parametrizado
	 * 
	 * @param a
	 * @param b
	 * @param n
	 */
	public BinomioDeNewton(int a, int b, int exponente) {
		this.a = a;
		this.b = b;
		this.exponente = exponente;
	}

	/**
	 * Obtengo el coeficiente del termino K del binomio utilizando metodos
	 * iterativos
	 * 
	 * @param k
	 * @return
	 */
	public double coeficienteK(int k) {
		return (combinatoria(this.exponente, k) * Polinomio.potencia(this.a, k) * Polinomio
				.potencia(this.b, this.exponente - k));
	}

	/**
	 * Obtengo el coeficiente del termino K del binomio utilizando metodos
	 * recursivos
	 * 
	 * @param k
	 * @return
	 */
	public double coeficienteKRecursiva(int k) {
		return (combinatoriaRecursiva(this.exponente, k)
				* Polinomio.potenciaRecursiva(this.a, k) * Polinomio
					.potenciaRecursiva(this.b, this.exponente - k));
	}

	/**
	 * Combinatoria en forma iterativa, utilizando metodo factorial
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public int combinatoria(int m, int n) {
		return factorial(m) / (factorial(m - n) * factorial(n));
	}

	/**
	 * combinatoria en forma recursiva
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public int combinatoriaRecursiva(int m, int n) {
		if (m == 0 || m == n || n == 0)
			return 1;
		return combinatoriaRecursiva(m - 1, n - 1)
				+ combinatoriaRecursiva(m - 1, n);
	}

	/**
	 * Calcula el factorial en forma iterativa
	 * 
	 * @param n
	 * @return
	 */
	public int factorial(int n) {
		int factorial = 1;
		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

	/**
	 * Calcula el factorial recursivamente
	 * 
	 * @param n
	 * @return
	 */
	public int factorialRecursivo(int n) {
		if (n == 1)
			return 1;
		return n * factorialRecursivo(n - 1);

	}

	/**
	 * Metodo que desarrolla el binomio en forma iterativa y obtiene todos los
	 * coeficientes del polinomio
	 * 
	 * @return
	 */
	public Polinomio desarrolloDelBinomio() {

		double[] coeficientes = new double[this.exponente + 1];
		Polinomio polinomio = new Polinomio(this.exponente, coeficientes);
		for (int i = 0; i < exponente + 1; i++) {
			coeficientes[i] = this.coeficienteK(i);
		}
		return polinomio;
	}

	/**
	 * Metodo que desarrolla el binomio en forma recursiva y obtiene todos los
	 * coeficientes del polinomio
	 * 
	 * @return
	 */
	public Polinomio desarrolloDelBinomioRecursiva() {

		double[] coeficientes = new double[this.exponente + 1];
		Polinomio polinomio = new Polinomio(this.exponente, coeficientes);
		for (int i = 0; i < exponente + 1; i++) {
			coeficientes[i] = this.coeficienteKRecursiva(i);
		}
		return polinomio;
	}

}
