package com.sirma.itt.javacourse.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains the available stocks.
 * 
 * @author radoslav
 */
public class Available implements Actions {
	private List<Stock> availableStocks = new ArrayList<Stock>();

	@Override
	public void remove(Stock stock) {
		availableStocks.remove(stock);
	}

	@Override
	public void add(Stock stock) {
		availableStocks.add(stock);
	}

	/**
	 * Gets the list with available stocks.
	 * 
	 * @return The list.
	 */
	public List<Stock> getList() {
		return availableStocks;
	}
}
