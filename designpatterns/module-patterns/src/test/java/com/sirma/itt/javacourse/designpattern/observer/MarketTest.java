package com.sirma.itt.javacourse.designpattern.observer;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for {@link Market}.
 * 
 * @author radoslav
 */
public class MarketTest {

	/**
	 * Adds and deletes stocks and checks the result.
	 */
	@Test
	public void testActions() {
		Market market = new Market();

		new StockObserver(market);

		Stock[] stocks = new Stock[] { new Stock("kaisiq"),
				new Stock("praskova"), new Stock("dinq") };
		for (int i = 0; i < stocks.length; i++) {
			market.add(stocks[i]);
		}

		for (int i = 0; i < market.getAvailableStocks().getList().size(); i++) {
			assertTrue(market.getAvailableStocks().getList().get(i)
					.equals(stocks[i]));
			assertTrue(market.getUnAvailableStocks().getList().isEmpty());
		}

		for (int i = 0; i < stocks.length; i++) {
			market.remove(stocks[i]);
		}

		for (int i = 0; i < market.getAvailableStocks().getList().size(); i++) {
			assertTrue(market.getUnAvailableStocks().getList().get(i)
					.equals(stocks[i]));
			assertTrue(market.getAvailableStocks().getList().isEmpty());
		}
	}

}
