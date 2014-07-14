package com.sirma.itt.javacourse.designpattern.iterator;

/**
 * Defines an interface for creating an Iterator object
 * 
 * @author radoslav
 */
public interface Container {
	/**
	 * Creates an Iterator object.
	 * 
	 * @return The iterator.
	 */
	public Iterator getIterator();
}
