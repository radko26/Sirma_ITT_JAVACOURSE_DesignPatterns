package com.sirma.itt.javacourse.designpattern.interpreter;

/**
 * Unites two terminal expressions and returns if they both abide the context
 * rule.
 * 
 * @author radoslav
 */
public class AndExpression implements Expression {

	Expression one;
	Expression two;

	/**
	 * Initialises the expressions.
	 * 
	 * @param one
	 *            The first expression.
	 * @param two
	 *            The second expression.
	 */
	public AndExpression(Expression one, Expression two) {
		this.one = one;
		this.two = two;
	}

	/**
	 * Returns true only if both expressions satisfy the rule. {@inheritDoc}
	 */
	@Override
	public boolean interpret(String context) {
		return one.interpret(context) && two.interpret(context);
	}

}
