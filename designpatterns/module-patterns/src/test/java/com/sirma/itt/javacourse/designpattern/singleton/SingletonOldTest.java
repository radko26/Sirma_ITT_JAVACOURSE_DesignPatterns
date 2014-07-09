package com.sirma.itt.javacourse.designpattern.singleton;



import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test class for {@link Singleton}.
 * 
 * @author radoslav
 */
public class SingletonOldTest {
	/**
	 * Compares the returned value.
	 */
	@Test
	public void testGetNumber() {
		
			assertEquals(666,SingletonOld.getInstance().getNumber());
	}

}
