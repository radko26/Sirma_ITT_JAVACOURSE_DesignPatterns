package com.sirma.itt.javacourse.designpattern.command;

/**
 * Divide numbers.
 * 
 * @author radoslav
 */
public class Division implements Operation {

	private float[] numbers;

	/**
	 * Initialises the numbers.
	 * 
	 * @param numbers
	 */
	public Division(float... numbers) {
		this.numbers = numbers;
	}

	@Override
	public float compute() {
		float quotient = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			quotient /= numbers[i];
		}
		return quotient;
	}

}
