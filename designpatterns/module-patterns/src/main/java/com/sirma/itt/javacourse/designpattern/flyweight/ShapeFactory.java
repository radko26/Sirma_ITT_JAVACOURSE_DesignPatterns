package com.sirma.itt.javacourse.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Saves instances of shapes for future use.
 * 
 * @author radoslav
 */
public enum ShapeFactory {
	INSTANCE;

	private Map<String, Shape> cache = new HashMap<String, Shape>();
	private boolean debugCreation;

	/**
	 * Operates with color object.Copies and gets them from HashMap if they have
	 * been already used or creates and save new entries if they have not.
	 * 
	 * @param color
	 *            The specific color.
	 * @return The object.
	 */
	public Shape getCircle(String color) {
		Circle circle = (Circle) cache.get(color);

		if (circle == null) {
			circle = new Circle();
			cache.put(color, circle);
			debugCreation = true;
		}
		debugCreation = false;
		return circle;
	}

	/**
	 * Gets the map.
	 * 
	 * @return The map.
	 */
	public Map<String, Shape> getMap() {
		return cache;
	}

	/**
	 * Gets boolean that shows if a new object has been created and saved in the
	 * hash map.
	 * 
	 * @return Debug information.
	 */
	public boolean getDebug() {
		return debugCreation;
	}

}
