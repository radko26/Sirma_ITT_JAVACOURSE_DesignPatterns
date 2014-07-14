package com.sirma.itt.javacourse.designpattern.facade;

/**
 * Builds all kind of provided shapes
 * 
 * @author radoslav
 */
public class ShapeBuilder {
	private Square square = new Square();
	private Circle circle = new Circle();

	/**
	 * Invokes the square draw method.
	 * 
	 * @return String representing the square name.
	 */
	public String drawSquare() {
		return square.draw();
	}

	/**
	 * Invokes the circle draw method.
	 * 
	 * @return String representing the circle name.
	 */
	public String drawCircle() {
		return circle.draw();
	}

}
