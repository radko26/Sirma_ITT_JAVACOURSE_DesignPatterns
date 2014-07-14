package com.sirma.itt.javacourse.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The market is place where you can buy or sell things. It is observed with
 * {@link StockObserver} and whether an action occurs it is updated to the
 * appropriate list.
 * 
 * @author radoslav
 */
public class Market implements Actions {

	private List<Observer> observers = new ArrayList<Observer>();
	private String action;
	private Available availableStocks = new Available();
	private UnAvailable unAvailableStocks = new UnAvailable();

	/**
	 * Adds observer which will listen for changes in the market class.
	 * 
	 * @param observer
	 *            The observer.
	 */
	public void attachObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * Notify all observers for a change in regard to stocks.
	 * 
	 * @param stock
	 *            The stock.
	 * 
	 */
	private void notifyObservers(Stock stock) {
		for (Observer observe : observers) {
			observe.update(stock);
		}
	}

	@Override
	public void remove(Stock stock) {
		action = "sell";
		notifyObservers(stock);
	}

	@Override
	public void add(Stock stock) {
		action = "buy";
		notifyObservers(stock);
	}

	/**
	 * Gets the action.
	 * 
	 * @return The string representing the action.
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Gets list of available stocks.
	 * 
	 * @return The list.
	 */
	public Available getAvailableStocks() {
		return availableStocks;
	}

	/**
	 * Gets list of unavailable stocks.
	 * 
	 * @return The list.
	 */
	public UnAvailable getUnAvailableStocks() {
		return unAvailableStocks;
	}

}
