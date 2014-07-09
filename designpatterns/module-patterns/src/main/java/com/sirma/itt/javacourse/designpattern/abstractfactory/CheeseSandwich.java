package com.sirma.itt.javacourse.designpattern.abstractfactory;

/**
 * Type of sandwich made by two slices of bread and cheese in between.
 * 
 * @author radoslav
 */
public class CheeseSandwich implements Sandwich {

	@Override
	public String eat() {
		return ("You are eating a cheese sandwich.");
	}

}
