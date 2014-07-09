package com.sirma.itt.javacourse.designpattern.builder;

/**
 * Type of sandwich with cheese between the slices bread. This class provides
 * information about the its name and its price.
 * 
 * @author radoslav
 */
public class CheeseSandwich implements Item {

	@Override
	public String name() {
		return "Cheese sandwich";
	}

	@Override
	public float price() {
		return 1.19f;
	}

}
