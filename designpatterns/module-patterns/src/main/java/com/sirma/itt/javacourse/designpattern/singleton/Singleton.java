package com.sirma.itt.javacourse.designpattern.singleton;

/**
 * Basic singleton design pattern considered appropriate after Java 1.6
 * 
 * @author radoslav
 */

public enum Singleton {
	INSTANCE;
	/**
	 * Method for test purposes.
	 * 
	 * @return 666 because i like how it looks.
	 */
	public int getNumber() {
		return 666;
	}
}
