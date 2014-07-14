package com.sirma.itt.javacourse.designpattern.observer;

/**
 * Basic unit for use in a shop.
 * 
 * @author radoslav
 */
public class Stock {
	private String name;

	/**
	 * Initialises new stock with its name.
	 * 
	 * @param name
	 *            The name.
	 */
	public Stock(String name) {
		this.name = name;
	}

	/**
	 * Gets the name of the stock.
	 * 
	 * @return The name.
	 */
	public String getName() {
		return name;
	}

}
