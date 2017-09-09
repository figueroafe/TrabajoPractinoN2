package ecuaciones.polinomicas;

public class App {

	public static void main(String[] args) {
		
		double[] coeficientes = {4,2,1,1};
		Polinomio polinomio = new Polinomio(3, coeficientes);

		double[] coeficientes2 = {2,1,4};
		Polinomio polinomio2 = new Polinomio(2, coeficientes2);
		
		Polinomio pepe = polinomio.productoPolinomio(polinomio2);
		
		for(int i=0; i < 6 ; i++){
			System.out.println(pepe.getCoeficientes()[i]);
		}
		
		
	}

}
