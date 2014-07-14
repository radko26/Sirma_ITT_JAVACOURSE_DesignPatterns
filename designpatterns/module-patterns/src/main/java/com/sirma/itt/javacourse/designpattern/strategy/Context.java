package com.sirma.itt.javacourse.designpattern.strategy;

/**
 * Chooses which strategy to be used.
 * 
 * @author radoslav
 */
public class Context {

	private Strategy strategy;

	/**
	 * Initialises the chosen strategy.
	 * 
	 * @param strategy
	 *            The strategy.
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * Executes the strategy operations on the passed numbers.
	 * 
	 * @param numbers
	 *            The numbers.
	 * @return The output after the computations.
	 */
	public int execute(int... numbers) {
		return strategy.doOperation(numbers);
	}

}
