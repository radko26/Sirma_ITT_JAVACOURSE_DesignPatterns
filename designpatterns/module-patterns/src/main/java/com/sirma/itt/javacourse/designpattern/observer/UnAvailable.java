package com.sirma.itt.javacourse.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * List of unavailable stocks.
 * 
 * @author radoslav
 */
public class UnAvailable implements Actions {

	private ArrayList<Stock> unAvailableStocks = new ArrayList<Stock>();

	@Override
	public void add(Stock stock) {
		unAvailableStocks.add(stock);

	}

	@Override
	public void remove(Stock stock) {
		unAvailableStocks.remove(stock);
	}

	/**
	 * Gets the list.
	 * 
	 * @return The list.
	 */
	public List<Stock> getList() {
		return unAvailableStocks;
	}

}
