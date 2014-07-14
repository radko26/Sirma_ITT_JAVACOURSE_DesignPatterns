package com.sirma.itt.javacourse.designpattern.factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link SandwichChef}.
 * 
 * @author radoslav
 */
public class SandwichChefTest {

	/**
	 * Creates some sandwiches and checks if they were created correctly.
	 */
	@Test
	public void testEat() {
		SandwichChef chef = new SandwichChef();
		Sandwich sandwich = chef.getSandwich("Cheese");
		assertTrue(sandwich.eat().contentEquals(
				"You are eating a cheese sandwich"));

		sandwich = chef.getSandwich("Tuna");
		assertTrue(sandwich.eat().contentEquals(
				"You are eating a tuna sandwich"));
	}

}
