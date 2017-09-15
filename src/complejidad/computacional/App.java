package complejidad.computacional;

public class App {

	public static void main(String[] args) {
		
//		double[] coeficientes = {4,2,1,1};
//		Polinomio polinomio = new Polinomio(3, coeficientes);

		double[] coeficientes2 = {2,1,4};
		Polinomio polinomio2 = new Polinomio(2, coeficientes2);

		Polinomio polinomio = new Polinomio("C:/workspace/TrabajoPractinoN2/IN/polinomio.in");
		
//		System.out.println(polinomio.evaluarMSucesivas(0));
//		System.out.println(polinomio.evaluarMSucesivas(1));
//		System.out.println(polinomio.evaluarMSucesivas(2));
		
		BinomioDeNewton binomio = new BinomioDeNewton(2, 1, 2);
		System.out.println(binomio.coeficienteK(2));
		
		
		System.out.println(binomio.combinatoria(7, 3));
		
	}

}
