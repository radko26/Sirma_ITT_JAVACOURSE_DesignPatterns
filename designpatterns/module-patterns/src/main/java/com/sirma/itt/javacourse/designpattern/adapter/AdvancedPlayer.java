package com.sirma.itt.javacourse.designpattern.adapter;

/**
 * Unites the sub advanced players.
 * 
 * @author radoslav
 */
public interface AdvancedPlayer {
	/**
	 * Play the file with VLC player.
	 * 
	 * @return The name of the player.
	 */
	public String playVLC();

	/**
	 * Play the file with MPC player
	 * 
	 * @return The name of the player.
	 */
	public String playMPC();
}
