package com.sirma.itt.javacourse.designpattern.decorator;

/**
 * Class which recieves objects and add some additional characteristics.
 * 
 * @author radoslav
 */
public abstract class Decorator extends Drink {
	protected Drink decoratedDrink;

	/**
	 * Initialises the drink.
	 * 
	 * @param decoratedDrink
	 */
	public Decorator(Drink decoratedDrink) {
		this.decoratedDrink = decoratedDrink;
	}

	@Override
	public String getName() {
		return decoratedDrink.getName();
	}

}
