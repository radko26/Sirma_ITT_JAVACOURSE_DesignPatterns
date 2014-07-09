package com.sirma.itt.javacourse.designpattern.abstractfactory;

/**
 * Makes a specific ice cream
 * 
 * @author radoslav
 */
public class IceCreamChef extends Chef {

	@Override
	IceCream getIceCream(String type) {
		if (type.equalsIgnoreCase("Chocolate")) {
			return new ChocolateIceCream();
		} else {
			throw new IllegalArgumentException(
					"No other types of ice cream are supported.");
		}
	}

	@Override
	Sandwich getSandwich(String type) {
		return null;
	}
}
