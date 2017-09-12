package ecuaciones.polinomicas;

public class App {

	public static void main(String[] args) {
		
//		double[] coeficientes = {4,2,1,1};
//		Polinomio polinomio = new Polinomio(3, coeficientes);

		Polinomio polinomio = new Polinomio("C:/workspace/TrabajoPractinoN2/IN/polinomio.in");
		
		double[] coeficientes2 = {2,1,4};
		Polinomio polinomio2 = new Polinomio(2, coeficientes2);
		
		Polinomio pepe = polinomio.productoPolinomio(polinomio2);
		
		pepe.mostrarPolinomio();
		
		
	}

}
