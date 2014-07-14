package com.sirma.itt.javacourse.designpattern.command;

/**
 * Calculates the sum of numbers.
 * 
 * @author radoslav
 */
public class Addition implements Operation {

	private float[] numbers;

	/**
	 * Initialises the numbers.
	 * 
	 * @param numbers
	 *            The numbers.
	 */
	public Addition(float... numbers) {
		this.numbers = numbers;
	}

	@Override
	public float compute() {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}
