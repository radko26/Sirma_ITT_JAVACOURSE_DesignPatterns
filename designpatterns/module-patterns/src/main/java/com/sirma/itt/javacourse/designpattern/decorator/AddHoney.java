package com.sirma.itt.javacourse.designpattern.decorator;

/**
 * Milk which is sweeten with honey.
 * 
 * @author radoslav
 */
public class AddHoney extends Decorator {

	/**
	 * Initialises the name of the drink.
	 * 
	 * @param decoratedDrink
	 *            The milk before adding honey.
	 */
	public AddHoney(Drink decoratedDrink) {
		super(decoratedDrink);
		name = "honey";
	}

	@Override
	public String getName() {
		return decoratedDrink.getName() + " with " + name;
	}
}
