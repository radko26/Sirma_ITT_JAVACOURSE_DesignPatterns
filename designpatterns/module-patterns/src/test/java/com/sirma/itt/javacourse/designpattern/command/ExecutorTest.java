package com.sirma.itt.javacourse.designpattern.command;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link Executor}.
 * 
 * @author radoslav
 */
public class ExecutorTest {

	Executor calculator = new Executor();

	/**
	 * Takes orders and calculate them.
	 */
	@Test
	public void testCalculate() {
		calculator
				.takeOperation(new Addition(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		calculator.takeOperation(new Division(100, 5, 4, 5));
		calculator.takeOperation(new Subtraction(10, 5));
		calculator.takeOperation(new Power(2, 2, 2));
		calculator.takeOperation(new Multiplication(125, -1));
		float[] ans = calculator.calculate();
		assertTrue(55f == ans[0]);
		assertTrue(1f == ans[1]);
		assertTrue(5f == ans[2]);
		assertTrue(16f == ans[3]);
		assertTrue(-125f == ans[4]);

		for (int i = 0; i < 10000; i++) {
			calculator.takeOperation(new Addition(i, 1));
		}
		float[] answer = calculator.calculate();
		for (int i = 0; i < 10000; i++) {
			assertTrue(i + 1 == answer[i]);
		}

	}

}
