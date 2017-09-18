package complejidad.computacional.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import complejidad.computacional.BinomioDeNewton;
import complejidad.computacional.Polinomio;

public class BinomioDeNewtonTest {

	BinomioDeNewton binomio;
	double nanoSeg = 10E-9;

	@Before
	public void setUp() {
		binomio = new BinomioDeNewton(2, 3, 2);

	}

	@Test
	public void testCoeficienteK() {
		Assert.assertEquals(9, binomio.coeficienteK(0), 0);
		Assert.assertEquals(12, binomio.coeficienteK(1), 0);
		Assert.assertEquals(4, binomio.coeficienteK(2), 0);
		
		double tiempoInicio = System.nanoTime();
		binomio.coeficienteK(2);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarCoeficienteK: \t" + tiempoFin
				* nanoSeg);
	}

	@Test
	public void testCoeficienteKRecursivo() {
		Assert.assertEquals(9, binomio.coeficienteKRecursiva(0), 0);
		Assert.assertEquals(12, binomio.coeficienteKRecursiva(1), 0);
		Assert.assertEquals(4, binomio.coeficienteKRecursiva(2), 0);
		
		double tiempoInicio = System.nanoTime();
		binomio.coeficienteKRecursiva(2);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarCoeficienteKRecursivo: \t" + tiempoFin
				* nanoSeg);

	}

	@Test
	public void testDesarrolloBinomio() {
		double[] coeficientes={4,12,9};
		Polinomio polinomio = new Polinomio(2, coeficientes);
		
		double tiempoInicio = System.nanoTime();		
		Assert.assertArrayEquals(polinomio.getCoeficientes(), binomio.desarrolloDelBinomio().getCoeficientes(), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarDesarrolloBinomio: \t" + tiempoFin
				* nanoSeg);
	}

	@Test
	public void testDesarrolloBinomioRecursivo() {
		double[] coeficientes={4,12,9};
		Polinomio polinomio = new Polinomio(2, coeficientes);
		
		double tiempoInicio = System.nanoTime();		
		Assert.assertArrayEquals(polinomio.getCoeficientes(), binomio.desarrolloDelBinomioRecursiva().getCoeficientes(), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarDesarrolloBinomioRecursivo: \t" + tiempoFin
				* nanoSeg);
	}

}
