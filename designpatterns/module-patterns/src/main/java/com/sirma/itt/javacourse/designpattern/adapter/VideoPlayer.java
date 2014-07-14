package com.sirma.itt.javacourse.designpattern.adapter;

/**
 * Interface which provides the basic option of every videoPlayer.
 * 
 * @author radoslav
 */
public interface VideoPlayer {
	/**
	 * Play the recording.
	 * 
	 * @param format
	 *            The file format.
	 * @return String with the player which plays it.
	 */
	public String play(String format);
}
