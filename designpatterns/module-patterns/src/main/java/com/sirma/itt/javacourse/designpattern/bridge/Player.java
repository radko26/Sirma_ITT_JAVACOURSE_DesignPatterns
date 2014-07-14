package com.sirma.itt.javacourse.designpattern.bridge;

/**
 * Abstract class that plays as a bridge between two interfaces.
 * 
 * @author radoslav
 */
public abstract class Player {
	protected PlayerLoader player;

	/**
	 * Initialises the player.
	 * 
	 * @param file
	 *            The extension of the file.
	 */
	protected Player(PlayerLoader player) {
		this.player = player;
	}

	/**
	 * Opens more specific video player.
	 * 
	 * @return The extension of the file.
	 */
	public abstract String open();
}
