package com.sirma.itt.javacourse.designpattern.command;

/**
 * Subtracts numbers.
 * 
 * @author radoslav
 */
public class Subtraction implements Operation {

	private float[] numbers;

	/**
	 * Initialises the numbers.
	 * 
	 * @param numbers
	 */
	public Subtraction(float... numbers) {
		this.numbers = numbers;
	}

	@Override
	public float compute() {
		float minuend = numbers[0];
		float subtrahend = 0;
		for (int i = 1; i < numbers.length; i++) {
			subtrahend += numbers[i];
		}
		return minuend - subtrahend;
	}

}
