package com.sirma.itt.javacourse.designpattern.strategy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link Context}.
 * 
 * @author radoslav
 */
public class ContextTest {

	/**
	 * Chooses to sum a sequence of numbers and checks if the output is correct.
	 */
	@Test
	public void testExecute() {
		Context context = new Context(new Addition());
		assertTrue(context.execute(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) == 55);
		assertTrue(context.execute(1, 2, 3) == 6);
		assertTrue(context.execute() == 0);
	}

}
