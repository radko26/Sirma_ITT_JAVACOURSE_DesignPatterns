package com.sirma.itt.javacourse.designpattern.state;

/**
 * Maintains an instance of a {@link State} subclass that defines the current
 * state.
 * 
 * @author radoslav
 */
public class Context {
	private State state = null;

	/**
	 * Sets the current state.
	 * 
	 * @param state
	 *            The state.
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * Gets the state.
	 * 
	 * @return The state.
	 */
	public State getState() {
		return state;
	}
}
