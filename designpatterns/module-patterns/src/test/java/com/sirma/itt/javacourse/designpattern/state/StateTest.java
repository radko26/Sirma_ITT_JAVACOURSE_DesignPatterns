package com.sirma.itt.javacourse.designpattern.state;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link State} subclasses and {@link Context}.
 * 
 * @author radoslav
 */
public class StateTest {

	/**
	 * Changes the behaviour and checks whether the context is in the correct
	 * state.
	 */
	@Test
	public void testDoAction() {
		Context context = new Context();
		State pause = new PauseState();
		State start = new StartState();

		pause.doAction(context);
		assertTrue(context.getState().getStateName().contentEquals("Pause"));
		start.doAction(context);
		assertTrue(context.getState().getStateName().contentEquals("Start"));
	}

}
