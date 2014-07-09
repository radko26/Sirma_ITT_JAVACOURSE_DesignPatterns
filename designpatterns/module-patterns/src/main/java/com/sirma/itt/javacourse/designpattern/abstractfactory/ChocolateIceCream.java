package com.sirma.itt.javacourse.designpattern.abstractfactory;

/**
 * Type of ice cream mixed with pieces of chocolate.
 * 
 * @author radoslav
 */
public class ChocolateIceCream implements IceCream {

	@Override
	public String lickUp() {
		return ("You are eating a chocolate ice cream.");
	}

}
