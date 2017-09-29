package complejidad.computacional;

public class BinomioDeNewton {

	private int a;
	private int b;
	private int exponente;
	private double[][] pascal;

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
	 * Complijidad Computacional = O(n)*O(n)*O(n) = O(n3)
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
	 * Complejidad Computacional = O(n)*O(n)*O(n)=O(n3)
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
	 * Comlejidad Computacional = O(n)
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public int combinatoria(int m, int n) {
		int resultado = 0;
		if ((factorial(m - n) * factorial(n) > 0))
			resultado = factorial(m) / (factorial(m - n) * factorial(n));
		return resultado;
	}

	/**
	 * combinatoria en forma recursiva
	 * 
	 * Complejidad Computacional = O(n)
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
	 * Complejidad computacional = O(n)
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
	 * Complejidad Computacional = O(n)
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
	 * Complejidad Computacional = O(n)
	 * 
	 * @return
	 */
	public Polinomio desarrolloDelBinomio() {

		double[] coeficientes = new double[this.exponente + 1];

		for (int i = 0; i < this.exponente + 1; i++) {
			coeficientes[i] = this.coeficienteK(this.exponente - i);
		}
		Polinomio polinomio = new Polinomio(this.exponente, coeficientes);

		return polinomio;
	}

	/**
	 * Metodo que desarrolla el binomio en forma recursiva y obtiene todos los
	 * coeficientes del polinomio
	 * 
	 * Complejidad Computacional = O(n)*O(n3) = O(n4)
	 * 
	 * @return
	 */
	public Polinomio desarrolloDelBinomioRecursiva() {

		double[] coeficientes = new double[this.exponente + 1];
		for (int i = 0; i < exponente + 1; i++) {
			coeficientes[i] = this.coeficienteKRecursiva(this.exponente - i);
		}
		Polinomio polinomio = new Polinomio(this.exponente, coeficientes);
		return polinomio;
	}

	
	/**
	 * Se desarrolla el calculo del triangulo de pascal
	 * 
	 * Complejidad Computacional = O(n2)
	 * 
	 */
	public void trianguloPascal() {
		this.pascal = new double[this.exponente + 1][this.exponente + 1];

		for (int i = 0; i < this.exponente + 1; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					this.pascal[i][j] = 1;
				else
					this.pascal[i][j] = this.pascal[i - 1][j]
							+ this.pascal[i - 1][j - 1];

			}
		}
	}

	
	/**
	 * Metodo que desarrolla el binomio mediante pasacal
	 * 
	 * Complejidad Computacional = O(n)*O(n3) = O(n4)
	 * 
	 * @return
	 */
	public Polinomio desarrolloDelBinomioPascal() {

		double[] coeficientes = new double[this.exponente + 1];
		for (int i = 0; i < exponente + 1; i++) {
			coeficientes[i] = this.coeficienteKConPascal(this.exponente - i);
		}
		Polinomio polinomio = new Polinomio(this.exponente, coeficientes);
		return polinomio;
	}


	/**
	 * Obtengo el coeficiente del termino K mediate el triangulo de pascal
	 * 
	 * @param k
	 * @return
	 */
	public double coeficienteKConPascal(double k) {
		return (this.pascal[this.exponente][(int) k] * Math.pow(this.a, this.exponente - k) * Math.pow(this.b,k));
	}
}
