package com.sirma.itt.javacourse.designpattern.proxy;
/**
 * Factory that creates {@link IntegerProxy} instances.
 * 
 * @author radoslav
 */
public class IntegerFactory {
	/**
	 * Disable instancing
	 */
	private IntegerFactory(){	
	}
	
	public static IntegerProxy createInstance(){
		return new IntegerProxy();
	}
}
