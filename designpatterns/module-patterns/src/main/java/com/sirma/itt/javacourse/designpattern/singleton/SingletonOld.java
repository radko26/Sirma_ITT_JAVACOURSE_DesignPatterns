package com.sirma.itt.javacourse.designpattern.singleton;

/**
 * The way of implementing singleton design pattern before JavaSE 1.6
 * 
 * @author radoslav
 */
public class SingletonOld {

	private static SingletonOld instance = new SingletonOld();

	/**
	 * Denies the creation of instances;
	 */
	private SingletonOld() {
	}

	/**
	 * Makes the only existing instance of the class visible without breaking
	 * the encapsulation.
	 * 
	 * @return The instance of {@link SingletonOld}
	 */
	public static SingletonOld getInstance() {
		return instance;
	}
	
	/**
	 * Method for test purposes.
	 * @return
	 * 		666 because i like how it looks.
	 */
	public int getNumber(){
		return 666;
	}

}
