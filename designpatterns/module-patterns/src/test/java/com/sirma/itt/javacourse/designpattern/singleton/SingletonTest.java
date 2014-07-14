package com.sirma.itt.javacourse.designpattern.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for {@link Singleton}.
 * 
 * @author radoslav
 */
public class SingletonTest {

	/**
	 * Compares the returned value.
	 */
	@Test
	public void testGetNumber() {
		assertEquals(666, Singleton.INSTANCE.getNumber());
	}

}
