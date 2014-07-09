package com.sirma.itt.javacourse.designpattern.abstractfactory;

/**
 * Provides the option to choose between eating a sandwich or an ice-cream.
 * 
 * @author radoslav
 */
public class DishMenu {
	/**
	 * Cooking is not easy task and only the right chef can make your desired
	 * food.
	 * 
	 * @param type
	 *            The type of food you want to receive.
	 * @return The right chef for having the job done.
	 * 
	 */
	public static Chef getChef(String type) {
		if (type.equalsIgnoreCase("SANDWICH")) {
			return new SandwichChef();
		} else if (type.equalsIgnoreCase("ICECREAM")) {
			return new IceCreamChef();
		} else {
			throw new IllegalArgumentException(
					"We do not have other professionals to cook you something else");
		}
	}

}
