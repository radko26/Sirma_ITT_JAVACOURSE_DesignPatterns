package com.sirma.itt.javacourse.designpattern.bridge;

/**
 * Interface that provides the method for opening a player.
 * 
 * @author radoslav
 */
public interface PlayerLoader {
	/**
	 * Loads player that is able to play specific extensions.
	 * 
	 * @return The name of that video player.
	 */
	public String open();
}
