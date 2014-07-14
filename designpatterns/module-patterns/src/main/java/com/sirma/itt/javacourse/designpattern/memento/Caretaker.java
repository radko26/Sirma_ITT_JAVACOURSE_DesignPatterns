package com.sirma.itt.javacourse.designpattern.memento;

/**
 * Has responsibilities to preserve the memento object.
 * 
 * @author radoslav
 */
public class Caretaker {

	private Memento memento;

	/**
	 * Initialises the memento object which it will keep safe.
	 * 
	 * @param memento
	 *            The memento object.
	 */
	public Caretaker(Memento memento) {
		this.memento = memento;
	}

	/**
	 * Gets the object.
	 * 
	 * @return The preserved memento.
	 */
	public Memento getMemento() {
		return memento;
	}

}
