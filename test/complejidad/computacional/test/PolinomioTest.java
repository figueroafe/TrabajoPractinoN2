package complejidad.computacional.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import complejidad.computacional.Polinomio;

public class PolinomioTest {

	Polinomio polinomio;
	double x = 10;
	double esperado1 = 4211;

	double x2 = 1000;
	double esperado3 = 4.002001001E9;
	double esperado = 4.0020010040010116E30;

	double nanoSeg = 1E6;

	@Before
	public void setUp() {

//		polinomio = new Polinomio("IN/polinomio_grado_3.in");
//		polinomio = new Polinomio("IN/polinomio_grado_10.in");
//		polinomio = new Polinomio("IN/polinomio_grado_100.in");
//		polinomio = new Polinomio("IN/polinomio_grado_500.in");
		polinomio = new Polinomio("IN/polinomio_grado_1000.in");

	}

	@Test
	public void testEvaluarMSucesivas() {	
		double tiempoInicio = System.nanoTime();
		polinomio.evaluarMSucesivas(x);
//		Assert.assertEquals(esperado, polinomio.evaluarMSucesivas(x), 0);
		double tiempoFin = (System.nanoTime()- tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarMSucesivas: \t" + tiempoFin/nanoSeg);
	}

	@Test
	public void tesEvaluarRecursiva() {
		double tiempoInicio = System.nanoTime();
		polinomio.evaluarRecursiva(x);
//		Assert.assertEquals(esperado, polinomio.evaluarRecursiva(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarRecursiva: \t" + tiempoFin/nanoSeg);

	}

	@Test
	public void testEvaluarRecursivaPar() {
		double tiempoInicio = System.nanoTime();
		polinomio.evaluarRecursivaPar(x);
//		Assert.assertEquals(esperado, polinomio.evaluarRecursivaPar(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarRecursivaPar: \t"
				+ tiempoFin/nanoSeg);

	}

	@Test
	public void testEvaluarProgDinamica() {
		double tiempoInicio = System.nanoTime();
		polinomio.evaluarProgDinamica(x);
//		Assert.assertEquals(esperado, polinomio.evaluarProgDinamica(x),0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarProgDinamica: \t"
				+ tiempoFin/nanoSeg);

	}

	@Test
	public void testEvaluarMejorada() {
		double tiempoInicio = System.nanoTime();
		polinomio.evaluarMejorada(x);
		//Assert.assertEquals(esperado, polinomio.evaluarMejorada(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarMejorada: \t" + tiempoFin/nanoSeg);
	}

	@Test
	public void testEvaluarPow() {
		double tiempoInicio = System.nanoTime();
		polinomio.evaluarPow(x);
//		Assert.assertEquals(esperado, polinomio.evaluarPow(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarPow: \t\t" + tiempoFin/nanoSeg);

	}

	@Test
	public void testEvaluarHorne() {
		double tiempoInicio = System.nanoTime();
		polinomio.evaluarRecursiva(x);
//		Assert.assertEquals(esperado, polinomio.evaluarRecursiva(x), 0);
		double tiempoFin = (System.nanoTime() - tiempoInicio);
		System.out.println("Tiempo ejecucion evaluarHorner: \t" + tiempoFin/ nanoSeg);

	}

}
