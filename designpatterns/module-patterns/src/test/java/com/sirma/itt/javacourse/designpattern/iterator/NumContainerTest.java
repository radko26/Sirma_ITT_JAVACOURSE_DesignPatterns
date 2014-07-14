package com.sirma.itt.javacourse.designpattern.iterator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link NumContainer}.
 * 
 * @author radoslav
 */
public class NumContainerTest {

	/**
	 * Inserts data into the {@link NumContainer} and via the iterator traverse
	 * its content.
	 */
	@Test
	public void testNext() {
		NumContainer container = new NumContainer(1, 2, 3, 4, 5);
		int[] testArray = new int[] { 1, 2, 3, 4, 5 };
		Iterator iter = container.getIterator();
		for (int i = 0; iter.hasNext(); i++) {
			assertTrue((int) iter.next() == testArray[i]);
		}
	}
}
