package br.com.afi.algoritmo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Teste para {@link PrimeiroCaracterQueNaoSeRepete}.
 * 
 * @author André de Fontana Ignacio
 * @version 1.0
 */
public class PrimeiroCaracterQueNaoSeRepeteTest {
	private PrimeiroCaracterQueNaoSeRepete algoritimo = new PrimeiroCaracterQueNaoSeRepete();

	@Test
	public void teste1(){
		final StringStream stream = new StringStream("aAbBABac");
		final Character c = algoritimo.executa(stream);
		Assert.assertEquals("b", c.toString());
	}
	
	@Test
	public void teste2(){
		final StringStream stream = new StringStream("Andre");
		final Character c = algoritimo.executa(stream);
		Assert.assertEquals("A", c.toString());
	}
	
	@Test
	public void teste3(){
		final StringStream stream = new StringStream("AAbbCCddEEe");
		final Character c = algoritimo.executa(stream);
		Assert.assertEquals("e", c.toString());
	}
	
	@Test
	public void teste4(){
		final StringStream stream = new StringStream("AAAcBBB");
		final Character c = algoritimo.executa(stream);
		Assert.assertEquals("c", c.toString());
	}
	
	@Test
	public void teste5(){
		final StringStream stream = new StringStream("AAAcBBBcY");
		final Character c = algoritimo.executa(stream);
		Assert.assertEquals("Y", c.toString());
	}
	
	@Test
	public void teste6(){
		final StringStream stream = new StringStream("AAAcBBBc");
		final Character c = algoritimo.executa(stream);
		Assert.assertNull(c);
	}
}
