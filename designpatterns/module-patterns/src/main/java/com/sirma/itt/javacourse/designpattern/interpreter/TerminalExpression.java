package com.sirma.itt.javacourse.designpattern.interpreter;

/**
 * Single expression.
 * 
 * @author radoslav
 */
public class TerminalExpression implements Expression {
	private String expression;

	/**
	 * Initialises the private expression.
	 * 
	 * @param expression
	 *            The expression.
	 */
	public TerminalExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public boolean interpret(String context) {
		return context.contains(expression);
	}

}
