package complejidad.computacional.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import complejidad.computacional.BinomioDeNewton;
import complejidad.computacional.Polinomio;

public class BinomioDeNewtonTest {

	BinomioDeNewton binomio;
	double nanoSeg = 1E6;

	@Before
	public void setUp() {
		//Probar el tes con grado 2 - 3 - 5 - 10 - 100 - 1000 
		//ejemplo
		binomio = new BinomioDeNewton(2, 3, 2);
//		binomio = new BinomioDeNewton(2, 3, 3);
//		binomio = new BinomioDeNewton(2, 3, 5);
//		binomio = new BinomioDeNewton(2, 3, 10);
//		binomio = new BinomioDeNewton(2, 3, 100);
//		binomio = new BinomioDeNewton(2, 3, 100);

		
		binomio.trianguloPascal();

	}

	@Test
	public void testCoeficienteK() {
//		Assert.assertEquals(9, binomio.coeficienteK(0), 0);
//		Assert.assertEquals(12, binomio.coeficienteK(1), 0);
//		Assert.assertEquals(4, binomio.coeficienteK(2), 0);
		
		double tiempoInicio = System.nanoTime();
		binomio.coeficienteK(2);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarCoeficienteK: \t" + tiempoFin/nanoSeg);
	}

	@Test
	public void testCoeficienteKRecursivo() {
//		Assert.assertEquals(9, binomio.coeficienteKRecursiva(0), 0);
//		Assert.assertEquals(12, binomio.coeficienteKRecursiva(1), 0);
//		Assert.assertEquals(4, binomio.coeficienteKRecursiva(2), 0);
		
		double tiempoInicio = System.nanoTime();
		binomio.coeficienteKRecursiva(2);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarCoeficienteKRecursivo: \t" + tiempoFin/nanoSeg);

	}

	@Test
	public void testCoeficienteKPasacal() {
//		Assert.assertEquals(9, binomio.coeficienteKRecursiva(0), 0);
//		Assert.assertEquals(12, binomio.coeficienteKRecursiva(1), 0);
//		Assert.assertEquals(4, binomio.coeficienteKRecursiva(2), 0);
		
		double tiempoInicio = System.nanoTime();
		binomio.coeficienteKConPascal(2);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarCoeficienteKPasacal: \t" + tiempoFin/nanoSeg);

	}
	@Test
	public void testDesarrolloBinomio() {
		double[] coeficientes={4,12,9};
		Polinomio polinomio = new Polinomio(2, coeficientes);
		
		double tiempoInicio = System.nanoTime();		
		binomio.desarrolloDelBinomio().getCoeficientes();
//		Assert.assertArrayEquals(polinomio.getCoeficientes(), binomio.desarrolloDelBinomio().getCoeficientes(), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarDesarrolloBinomio: \t" + tiempoFin/nanoSeg);
	}

	@Test
	public void testDesarrolloBinomioRecursivo() {
		double[] coeficientes={4,12,9};
		Polinomio polinomio = new Polinomio(2, coeficientes);
		
		double tiempoInicio = System.nanoTime();		
//	binomio.desarrolloDelBinomioRecursiva().getCoeficientes();
		//Assert.assertArrayEquals(polinomio.getCoeficientes(), binomio.desarrolloDelBinomioRecursiva().getCoeficientes(), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarDesarrolloBinomioRecursivo: \t" + tiempoFin/nanoSeg);
	}

	@Test
	public void testDesarrolloBinomioPascal() {
		double[] coeficientes={4,12,9};
		Polinomio polinomio = new Polinomio(2, coeficientes);
		
		double tiempoInicio = System.nanoTime();		
//		binomio.trianguloPascal();
		binomio.desarrolloDelBinomioPascal().getCoeficientes();
		//Assert.assertArrayEquals(polinomio.getCoeficientes(), binomio.desarrolloDelBinomioRecursiva().getCoeficientes(), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarDesarrolloBinomioPascal: \t" + tiempoFin/nanoSeg);
	}
}
