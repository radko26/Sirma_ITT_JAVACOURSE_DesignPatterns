package com.sirma.itt.javacourse.designpattern.chain;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for {@link Approver}'s inheritants implementation.
 * 
 * @author radoslav
 */
public class ChainTest {

	/**
	 * Creates requests with various priority and checks who will handle them.
	 */
	@Test
	public void testProcessRequest() {
		Approver president = new President();
		Approver vicePresident = new VicePresident();
		Approver director = new Director();

		director.setSuccessor(vicePresident);
		vicePresident.setSuccessor(president);

		Request testRequestPrio1 = new Request(1);
		Request testRequestPrio2 = new Request(2);
		Request testRequestPrio3 = new Request(3);
		Request testRequestPrio4 = new Request(4);

		assertTrue(director.processRequest(testRequestPrio1).contentEquals(
				"Handled by the director"));
		assertTrue(director.processRequest(testRequestPrio2).contentEquals(
				"Handled by the vice"));
		assertTrue(director.processRequest(testRequestPrio3).contentEquals(
				"Handled by the president"));
		assertTrue(director.processRequest(testRequestPrio4).contentEquals(
				"The CEO is not here"));

	}

}
