package com.sirma.itt.javacourse.designpattern.memento;

/**
 * Creates a {@link Memento} object containing a snapshot of its current
 * internal state. Uses it to recover its past state.
 * 
 * @author radoslav
 */
public class Originator {

	private int state;

	/**
	 * Initialises the initial state.
	 * 
	 * @param state
	 *            The state.
	 */
	public Originator(int state) {
		this.state = state;
	}

	/**
	 * Sets state to another value.
	 * 
	 * @param state
	 *            The new state.
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * Gets the state.
	 * 
	 * @return The state.
	 */
	public int getState() {
		return state;
	}

	/**
	 * Creates a snapshot of the current object.
	 * 
	 * @return Memento object holding the data.
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * Restores the state from the snapshot.
	 */
	public void restore(Memento backup) {
		state = backup.getState();
	}

}
