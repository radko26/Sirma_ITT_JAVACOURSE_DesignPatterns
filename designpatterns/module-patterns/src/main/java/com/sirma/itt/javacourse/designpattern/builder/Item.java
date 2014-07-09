package com.sirma.itt.javacourse.designpattern.builder;

/**
 * Provides methods related with an item.
 * 
 * @author radoslav
 */
public interface Item {
	/**
	 * The name of the item
	 * 
	 * @return The name.
	 */
	public String name();

	/**
	 * How much it costs.
	 * 
	 * @return The price.
	 */
	public float price();
}