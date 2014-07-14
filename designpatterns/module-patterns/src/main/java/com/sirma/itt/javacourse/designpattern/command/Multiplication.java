package com.sirma.itt.javacourse.designpattern.command;

/**
 * Multiplicates numbers.
 * 
 * @author radoslav
 */
public class Multiplication implements Operation {

	private float[] numbers;

	/**
	 * Multiplicates numbers.
	 * 
	 * @param numbers
	 *            The numbers.
	 */
	public Multiplication(float... numbers) {
		this.numbers = numbers;
	}

	@Override
	public float compute() {
		int product = 1;
		for (int i = 0; i < numbers.length; i++) {
			product *= numbers[i];
		}
		return product;
	}

}
