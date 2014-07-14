package com.sirma.itt.javacourse.designpattern.observer;

/**
 * Listen for actions and updates the lists with available and unavailable
 * stocks.
 * 
 * @author radoslav
 */
public class StockObserver extends Observer {

	/**
	 * Adds observer to a subject.
	 * 
	 * @param market
	 *            The subject in this case is the market.
	 * 
	 */
	public StockObserver(Market market) {
		this.market = market;
		this.market.attachObserver(this);
	}

	@Override
	void update(Stock stock) {
		if (market.getAction() == "buy") {
			market.getAvailableStocks().add(stock);
			market.getUnAvailableStocks().remove(stock);
		}
		if (market.getAction() == "sell") {
			market.getAvailableStocks().remove(stock);
			market.getUnAvailableStocks().add(stock);
		}
	}
}
