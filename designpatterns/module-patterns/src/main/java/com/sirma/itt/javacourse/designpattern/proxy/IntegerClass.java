package com.sirma.itt.javacourse.designpattern.proxy;

/**
 * The real Integer class.
 * 
 * @author radoslav
 */
public class IntegerClass implements Integer {

	@Override
	public int getValue() {
		return 666;
	}

}
