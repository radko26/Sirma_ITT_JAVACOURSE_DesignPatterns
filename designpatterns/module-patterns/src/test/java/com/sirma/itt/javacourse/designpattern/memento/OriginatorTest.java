package com.sirma.itt.javacourse.designpattern.memento;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link Originator}.
 * 
 * @author radoslav
 */
public class OriginatorTest {

	/**
	 * Saves the initial state of an object and restores it back to the
	 * originator. Checks if the data have been imported and extracted
	 * correctly.
	 */
	@Test
	public void testCreateMemento() {
		Originator object = new Originator(2);
		assertTrue(object.getState() == 2);
		Caretaker backupObjct = new Caretaker(object.createMemento());
		object.setState(5);
		assertTrue(object.getState() == 5);
		object.restore(backupObjct.getMemento());
		assertTrue(object.getState() == 2);
	}

}
