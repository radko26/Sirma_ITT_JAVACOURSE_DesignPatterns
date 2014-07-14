package com.sirma.itt.javacourse.designpattern.bridge;

/**
 * Avi player that opens .avi extensions.
 * 
 * @author radoslav
 */
public class Avi implements PlayerLoader {

	@Override
	public String open() {
		return "Avi";
	}

}
