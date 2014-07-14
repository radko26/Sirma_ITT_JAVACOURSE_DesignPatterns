package com.sirma.itt.javacourse.designpattern.strategy;

/**
 * Declares an interface common to all strategies.
 * 
 * @author radoslav
 */

public interface Strategy {

	/**
	 * Do operations with the passed numbers.
	 * 
	 * @param Numbers
	 *            .
	 */
	public int doOperation(int... numbers);
}