package com.sirma.itt.javacourse.designpattern.observer;

/**
 * Interface providing methods used for goods.
 * 
 * @author radoslav
 */
public interface Actions {
	/**
	 * Adds stock to the list.
	 * 
	 * @param stock
	 *            The stock.
	 */
	public void add(Stock stock);

	/**
	 * Removes stock from the list.
	 * 
	 * @param stock
	 *            The stock.
	 */
	public void remove(Stock stock);
}
