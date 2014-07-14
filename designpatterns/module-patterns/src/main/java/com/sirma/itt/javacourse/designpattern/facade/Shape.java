package com.sirma.itt.javacourse.designpattern.facade;

/**
 * Interface providing general methods for working with shapes.
 * 
 * @author radoslav
 */
public interface Shape {
	/**
	 * Draw a shape.
	 * 
	 * @return The type of the shape.
	 */
	public abstract String draw();
}
