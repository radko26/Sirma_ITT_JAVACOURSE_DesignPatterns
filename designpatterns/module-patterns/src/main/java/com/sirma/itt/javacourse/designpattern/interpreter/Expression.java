package com.sirma.itt.javacourse.designpattern.interpreter;

/**
 * Interface providing the expressions method for understanding and processing
 * data.
 * 
 * @author radoslav
 */
public interface Expression {

	/**
	 * Translates it in some way for future use.
	 */
	public boolean interpret(String context);

}
