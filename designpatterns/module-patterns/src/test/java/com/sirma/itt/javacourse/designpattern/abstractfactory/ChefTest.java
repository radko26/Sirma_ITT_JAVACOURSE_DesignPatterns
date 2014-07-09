package com.sirma.itt.javacourse.designpattern.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for {@link Chef}.
 * 
 * @author radoslav
 */
public class ChefTest {
	/**
	 * Creates various types of food and compares the output.
	 * 
	 * @throws ClassNotFoundException
	 */
	@Test
	public void test() throws ClassNotFoundException {
		Chef chef = DishMenu.getChef("Sandwich");
		Sandwich sandwich = chef.getSandwich("Tuna");
		assertTrue(sandwich.eat().contentEquals(
				"You are eating a tuna sandwich."));

		sandwich = chef.getSandwich("Cheese");
		assertTrue(sandwich.eat().contentEquals(
				"You are eating a cheese sandwich."));

		chef = DishMenu.getChef("Icecream");
		IceCream icecream = chef.getIceCream("Chocolate");
		assertTrue(icecream.lickUp().contains(
				"You are eating a chocolate ice cream."));

		ChocolateIceCream ice = (ChocolateIceCream) chef
				.createByReflection(ChocolateIceCream.class.getName());
		assertTrue(ice.lickUp().contains(
				"You are eating a chocolate ice cream."));
	}

}
