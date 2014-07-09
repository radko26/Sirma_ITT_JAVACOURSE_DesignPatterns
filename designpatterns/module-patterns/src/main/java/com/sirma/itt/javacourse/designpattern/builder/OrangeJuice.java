package com.sirma.itt.javacourse.designpattern.builder;

/**
 * Orange juice.This class provides with the name and price of the product.
 * 
 * @author radoslav
 */
public class OrangeJuice implements Item {

	@Override
	public String name() {
		return "Orange juice";
	}

	@Override
	public float price() {
		return 2.54f;
	}

}
