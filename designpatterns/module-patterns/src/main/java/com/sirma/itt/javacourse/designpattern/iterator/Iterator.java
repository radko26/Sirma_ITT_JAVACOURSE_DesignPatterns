package com.sirma.itt.javacourse.designpattern.iterator;

/**
 * Defines an interface for accessing and traversing elements.
 * 
 * @author radoslav
 */
public interface Iterator {
	/**
	 * Checks whether the end of the container has been reached.
	 * 
	 * @return True if there are more elements and false if not.
	 */
	public boolean hasNext();

	/**
	 * Gets the next element.
	 * 
	 * @return The next element.
	 */
	public Object next();
}
