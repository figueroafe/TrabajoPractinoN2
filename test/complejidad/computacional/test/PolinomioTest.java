package complejidad.computacional.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import complejidad.computacional.Polinomio;

public class PolinomioTest {

	Polinomio polinomio;
	double x = 10;
	double esperado = 4211;
	double nanoSeg = 10E-9;

	@Before
	public void setUp() {

		polinomio = new Polinomio("IN/polinomio.in");

	}

	@Test
	public void testEvaluarMSucesivas() {
		double tiempoInicio = System.nanoTime();
		Assert.assertEquals(esperado, polinomio.evaluarMSucesivas(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarMSucesivas: \t" + tiempoFin
				* nanoSeg);
	}

	@Test
	public void tesEvaluarRecursiva() {
		double tiempoInicio = System.nanoTime();
		Assert.assertEquals(esperado, polinomio.evaluarRecursiva(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarRecursiva: \t" + tiempoFin
				* nanoSeg);

	}

	@Test
	public void testEvaluarRecursivaPar() {
		double tiempoInicio = System.nanoTime();
		Assert.assertEquals(esperado, polinomio.evaluarRecursivaPar(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarRecursivaPar: \t"
				+ tiempoFin * nanoSeg);

	}

	@Test
	public void testEvaluarProgDinamica() {
		double tiempoInicio = System.nanoTime();
		Assert.assertEquals(esperado, polinomio.evaluarProgDinamica(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarProgDinamica: \t"
				+ tiempoFin * nanoSeg);

	}

	@Test
	public void testEvaluarMejorada() {
		double tiempoInicio = System.nanoTime();
		Assert.assertEquals(esperado, polinomio.evaluarMejorada(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarMejorada: \t" + tiempoFin
				* nanoSeg);
	}

	@Test
	public void testEvaluarPow() {
		double tiempoInicio = System.nanoTime();
		Assert.assertEquals(esperado, polinomio.evaluarPow(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarPow: \t\t" + tiempoFin
				* nanoSeg);

	}

	@Test
	public void testEvaluarHorne() {
		double tiempoInicio = System.nanoTime();
		Assert.assertEquals(esperado, polinomio.evaluarRecursiva(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarHorner: \t" + tiempoFin
				* nanoSeg);

	}

}
