package com.sirma.itt.javacourse.designpattern.proxy;

/**
 * Factory that creates {@link IntegerProxy} instances.
 * 
 * @author radoslav
 */
public final class IntegerFactory {
	/**
	 * Disable instancing.
	 */
	private IntegerFactory() {
	}

	/**
	 * Creates new instance of {@link IntegerProxy}.
	 * 
	 * @return The new instance.
	 */
	public static IntegerProxy createInstance() {
		return new IntegerProxy();
	}
}
