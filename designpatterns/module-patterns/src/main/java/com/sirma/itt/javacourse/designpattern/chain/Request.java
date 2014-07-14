package com.sirma.itt.javacourse.designpattern.chain;

/**
 * Class which creates an object with priority for processing.
 * 
 * @author radoslav
 */
public class Request {

	private int priority;

	/**
	 * Initialises the request's priority.
	 * 
	 * @param priority
	 *            The priority.
	 */
	public Request(int priority) {
		this.priority = priority;
	}

	/**
	 * Gets the priority level.
	 * 
	 * @return The priority.
	 */
	public int getPriority() {
		return priority;
	}

}
