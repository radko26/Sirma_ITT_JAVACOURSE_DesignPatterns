package com.sirma.itt.javacourse.designpattern.proxy;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test class 
 * 
 * @author radoslav
 */
public class IntegerProxyTest {
	/**
	 * Compares the real integer class result with the proxy one.
	 */
	@Test
	public void testGetValue() {
		IntegerProxy proxy = IntegerFactory.createInstance(); 
		IntegerClass real = new IntegerClass();
		proxy.setRealInteger(real);
		
		assertTrue(proxy.getValue()==666);
	}

}
