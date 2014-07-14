package com.sirma.itt.javacourse.designpattern.decorator;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test class for {@link Decorator}.
 * 
 * @author radoslav
 */
public class DecoratorTest {

	/**
	 * Add honey to the milk and checks if the new drink is Milk with honey.
	 */
	@Test
	public void testDecoration() {
		Drink milk = new Milk();
		assertTrue(milk.getName().contentEquals("Milk"));
		Decorator milkWithHoney = new AddHoney(milk);
		assertTrue(milkWithHoney.getName().contentEquals("Milk with honey"));
	}

}
