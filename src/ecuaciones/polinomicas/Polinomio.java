package ecuaciones.polinomicas;

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
		
		double[] vec = {0,0,0,0,0,0};
		Polinomio poliResultado = new Polinomio(this.grado + poli.grado , vec);
		int gradoA=0;
		int gradoB=0;
		
		for(int i=0; i < this.grado ; i++){
			for(int j=0; j < poli.grado ; j++){
				
				gradoA = this.grado-i;
				gradoB = poli.grado-j;
				
				poliResultado.coeficientes[gradoA+gradoB] += this.coeficientes[i] * poli.coeficientes[j]; 
			}
			
			return poliResultado;
		}
		
		
		return poliResultado;

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
