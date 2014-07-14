package com.sirma.itt.javacourse.designpattern.bridge;

/**
 * Primary player which is used for opening the more specific players.
 * 
 * @author radoslav
 */
public class VideoPlayer extends Player {
	/**
	 * Loads the desired player.
	 * 
	 * @param player
	 *            The desired sub-player.
	 */
	protected VideoPlayer(PlayerLoader player) {
		super(player);
	}

	@Override
	public String open() {
		return player.open();
	}

}
