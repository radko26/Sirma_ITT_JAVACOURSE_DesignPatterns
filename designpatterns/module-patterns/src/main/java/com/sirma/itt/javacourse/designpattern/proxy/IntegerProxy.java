package com.sirma.itt.javacourse.designpattern.proxy;

/**
 * Proxy class which hides the real from the user.
 * 
 * @author radoslav
 */
public class IntegerProxy implements Integer {
	private IntegerClass realInteger;

	/**
	 * Sets which real integer the proxy should point.
	 * 
	 * @param realInteger
	 */
	public void setRealInteger(IntegerClass realInteger) {
		this.realInteger = realInteger;
	}

	@Override
	public int getValue() {
		return realInteger.getValue();
	}

}
