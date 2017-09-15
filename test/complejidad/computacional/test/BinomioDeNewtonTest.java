package complejidad.computacional.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import complejidad.computacional.BinomioDeNewton;

public class BinomioDeNewtonTest {

	BinomioDeNewton binomio;
	
	@Before
	public void setUp(){
		binomio = new BinomioDeNewton(2, 3, 2);
		
	}
	
	@Test
	public void verificoCoeficienteKIterativa(){
		Assert.assertEquals(0, binomio.coeficienteK(2),0);
		Assert.assertEquals(0, binomio.coeficienteK(3),0);
	}
	
	
	
	
	
	
}
