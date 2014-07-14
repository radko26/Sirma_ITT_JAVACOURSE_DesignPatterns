package com.sirma.itt.javacourse.designpattern.command;

/**
 * Powers up a number.
 * 
 * @author radoslav
 */
public class Power implements Operation {

	private float[] numbers;

	/**
	 * Initialises the numbers.
	 * 
	 * @param numbers
	 *            The fist variable is the number and the others are the powers.
	 */
	public Power(float... numbers) {
		this.numbers = numbers;
	}

	@Override
	public float compute() {
		float number = numbers[0];
		int powers = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (i == 1) {
				powers = (int) numbers[i];
			} else {
				powers *= numbers[i];
			}
		}
		float result = 1;
		for (int i = 0; i < powers; i++) {
			result *= number;
		}
		return result;
	}

}
