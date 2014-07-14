package com.sirma.itt.javacourse.designpattern.filter;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Test class for {@link AverageAgeCriteria}.
 * 
 * @author radoslav
 */
public class AverageAgeCriteriaTest {

	/**
	 * Compares the output with already predicted one.
	 */
	@Test
	public void testSift() {
		ArrayList<Person> people = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			people.add(new Person(i));
		}

		assertTrue(new AverageAgeCriteria().sift(people).get(0).getAge() == 5);
	}

}
