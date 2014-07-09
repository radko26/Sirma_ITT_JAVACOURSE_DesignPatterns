package com.sirma.itt.javacourse.designpattern.abstractfactory;

/**
 * Makes different types of sandwiches.
 * 
 * @author radoslav
 */
public class SandwichChef extends Chef {

	@Override
	IceCream getIceCream(String type) {
		return null;
	}

	@Override
	public Sandwich getSandwich(String type) {
		if (type.equalsIgnoreCase("TUNA")) {
			return new TunaSandwich();
		} else if (type.equalsIgnoreCase("CHEESE")) {
			return new CheeseSandwich();
		} else {
			throw new IllegalArgumentException(
					"No other sandwiches are supported");
		}
	}

}
