package com.sirma.itt.javacourse.designpattern.strategy;

/**
 * Implements algorithm that sum numbers using the {@link Strategy} interface.
 * 
 * @author radoslav
 */
public class Addition implements Strategy {
	@Override
	public int doOperation(int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}
