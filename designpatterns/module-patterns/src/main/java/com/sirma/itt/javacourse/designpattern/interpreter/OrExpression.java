package com.sirma.itt.javacourse.designpattern.interpreter;

/**
 * Unites two terminal expressions and returns if at least one of the rules has
 * been observed.
 * 
 * @author radoslav
 */
public class OrExpression implements Expression {
	Expression one;
	Expression two;

	/**
	 * Initialises the two expressions used to precess the data.
	 * 
	 * @param one
	 *            The first expression.
	 * @param two
	 *            The second expression.
	 */
	public OrExpression(Expression one, Expression two) {
		this.one = one;
		this.two = two;
	}

	/**
	 * Returns true if matches at least one of the rules. {@inheritDoc}
	 */
	@Override
	public boolean interpret(String context) {
		return one.interpret(context) || two.interpret(context);
	}
}
