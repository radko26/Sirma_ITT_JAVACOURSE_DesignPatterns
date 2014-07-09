package com.sirma.itt.javacourse.designpattern.builder;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for {@link Meal}.
 * 
 * @author radoslav
 */
public class MealTest {

	private MealBilder order = new MealBilder();

	/**
	 * Creates a cheese sandwich meal and checks its content.
	 */
	@Test
	public void testPurachase() {
		assertTrue(order.purachaseCheeseMeal().getMeal().get(0) instanceof CheeseSandwich);
		assertTrue(order.purachaseCheeseMeal().getMeal().get(1) instanceof OrangeJuice);

		assertTrue(order.purachaseTunaMeal().getMeal().get(0) instanceof TunaSandwich);
		assertTrue(order.purachaseTunaMeal().getMeal().get(1) instanceof OrangeJuice);
	}

}
