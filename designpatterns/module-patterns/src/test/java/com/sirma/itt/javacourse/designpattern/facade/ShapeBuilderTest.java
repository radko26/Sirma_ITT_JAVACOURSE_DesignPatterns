package com.sirma.itt.javacourse.designpattern.facade;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link ShapeBuilder}.
 * 
 * @author radoslav
 */
public class ShapeBuilderTest {

	/**
	 * Draws objects and checks the output.
	 */
	@Test
	public void testDraw() {
		ShapeBuilder builder = new ShapeBuilder();
		assertTrue(builder.drawCircle().contentEquals("Circle"));
		assertTrue(builder.drawSquare().contentEquals("Square"));
	}

}
