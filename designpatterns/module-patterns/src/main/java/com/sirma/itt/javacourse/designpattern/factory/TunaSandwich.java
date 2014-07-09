package com.sirma.itt.javacourse.designpattern.factory;

/**
 * Type of sandwich made by two slices of bread and tuna fish.
 * 
 * @author radoslav
 */
public class TunaSandwich implements Sandwich {

	@Override
	public String eat() {
		return ("You are eating a tuna sandwich");
	}

}
