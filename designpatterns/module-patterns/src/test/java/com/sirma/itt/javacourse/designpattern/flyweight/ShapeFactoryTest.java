package com.sirma.itt.javacourse.designpattern.flyweight;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link ShapeFactory} and {@link Circle}.
 * 
 * @author radoslav
 */
public class ShapeFactoryTest {

	/**
	 * Tests with various colors and checks if only one instance has been
	 * created for each.
	 */
	@Test
	public void testGetCircle() {

		String[] colors = new String[] { "red", "green", "blue", "orange",
				"meganta", "brown", "white", "black" };

		for (int i = 0; i < 100; i++) {
			int randomIndex = (int) (Math.random() * (colors.length));
			Circle circle = (Circle) ShapeFactory.INSTANCE
					.getCircle(colors[randomIndex]);
			if (ShapeFactory.INSTANCE.getMap().containsKey(colors[randomIndex])) {
				assertTrue(!ShapeFactory.INSTANCE.getDebug());
			} else {
				assertTrue(ShapeFactory.INSTANCE.getDebug());
			}
			float circleRadius = (float) (Math.random() * 99 + 1);
			circle.setRadius(circleRadius);
			assertTrue(circle.draw().contentEquals("Circle " + circleRadius));
		}
	}

}
