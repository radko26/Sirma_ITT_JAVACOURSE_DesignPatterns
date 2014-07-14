package com.sirma.itt.javacourse.designpattern.flyweight;

/**
 * Circle
 * 
 * @author radoslav
 */
public class Circle implements Shape {
	private float radius;

	/**
	 * Sets the radius
	 * 
	 * @param d
	 *            The circle's radius.
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * Gets the radius.
	 * 
	 * @return The radius.
	 */
	public float getRadius() {
		return radius;
	}

	@Override
	public String draw() {
		return "Circle " + radius;
	}

}
