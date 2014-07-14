package com.sirma.itt.javacourse.designpattern.memento;

/**
 * Stores information about the Originator object.
 * 
 * @author radoslav
 */
public class Memento {

	private int state;

	/**
	 * Initialises the state.
	 * 
	 * @param state
	 *            The state.
	 */
	public Memento(int state) {
		this.state = state;
	}

	/**
	 * Gets the saved state.
	 * 
	 * @return The state.
	 */
	public int getState() {
		return state;
	}

}
