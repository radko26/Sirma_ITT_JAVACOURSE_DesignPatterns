package com.sirma.itt.javacourse.designpattern.builder;

/**
 * Type of sandwich.This class provides with information about its name and
 * size.
 * 
 * @author radoslav
 */
public class TunaSandwich implements Item {

	@Override
	public String name() {
		return "Tuna sandwich";
	}

	@Override
	public float price() {
		return 1.99f;
	}

}
