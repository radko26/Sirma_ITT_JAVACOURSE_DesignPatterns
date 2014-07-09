package com.sirma.itt.javacourse.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Class which holds all other products.
 * 
 * @author radoslav
 */
public class Meal {
	private List<Item> meal = new ArrayList<>();

	/**
	 * Adds an item to the list.
	 * 
	 * @param product
	 *            The item.
	 */
	public void addItem(Item product) {
		meal.add(product);
	}

	/**
	 * Returns the list with items inside.
	 * 
	 * @return
	 */
	public List<Item> getMeal() {
		return meal;
	}
}
