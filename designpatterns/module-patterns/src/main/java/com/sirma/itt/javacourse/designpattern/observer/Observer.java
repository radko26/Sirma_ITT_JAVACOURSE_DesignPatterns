package com.sirma.itt.javacourse.designpattern.observer;

/**
 * Declares the common of all listeners.
 * 
 * @author radoslav
 */
public abstract class Observer {

	protected Market market;

	/**
	 * Updates content.
	 */
	abstract void update(Stock stock);

}
