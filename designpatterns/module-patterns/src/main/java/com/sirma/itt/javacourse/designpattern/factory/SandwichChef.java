package com.sirma.itt.javacourse.designpattern.factory;

/**
 * Constructs a new sandwich,which dependents on the given parameter.
 * 
 * @author radoslav
 */
public class SandwichChef {

	/**
	 * Makes a sandwich by your choice.
	 * 
	 * @param choice
	 *            The type of sandwich you prefer.
	 * @return The sandwich.
	 */
	public Sandwich getSandwich(String choice) {
		if (choice.equalsIgnoreCase("TUNA")) {
			return new TunaSandwich();
		} else if (choice.equalsIgnoreCase("CHEESE")) {
			return new CheeseSandwich();
		} else {
			throw new IllegalArgumentException(
					"No other sandwiches are supported");
		}
	}
}
