package com.sirma.itt.javacourse.designpattern.objectpool;

/**
 * My own implementation of holder which packs 3 variables in one object.
 * 
 * @author radoslav
 */
public class Triplet<F, S, T> {
	F first;
	S second;
	T third;

	/**
	 * Initialises variables.
	 * 
	 * @param first
	 *            The first variable in the triplet.
	 * @param second
	 *            The second variable in the triplet
	 * @param third
	 *            The third variable in the triplet.
	 */
	public Triplet(F first, S second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	/**
	 * Gets the first element of the triplet.
	 * 
	 * @return The first element.
	 */
	public F getFirst() {
		return first;
	}

	/**
	 * Gets the second element of the triplet.
	 * 
	 * @return The second element.
	 */
	public S getSecond() {
		return second;
	}

	/**
	 * Gets the second element of the triplet.
	 * 
	 * @return
	 */
	public T getThird() {
		return third;
	}
}
