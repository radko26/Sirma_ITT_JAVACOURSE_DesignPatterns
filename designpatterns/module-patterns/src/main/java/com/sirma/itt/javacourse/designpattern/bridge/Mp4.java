package com.sirma.itt.javacourse.designpattern.bridge;

/**
 * Mp4 player which opens files in mp4 format.
 * 
 * @author radoslav
 */
public class Mp4 implements PlayerLoader {

	@Override
	public String open() {
		return "Mp4";
	}

}
