package com.sirma.itt.javacourse.designpattern.adapter;

/**
 * Adapter which receives file formats and opens it with the right player.
 * 
 * @author radoslav
 */
public class VideoAdapter implements VideoPlayer {

	private AdvancedPlayer player;

	/**
	 * Checks which player should use to open the extention.
	 */
	public VideoAdapter(String format) {
		if (format.equalsIgnoreCase(".vlc")) {
			player = new VLCPlayer();
		}
		if (format.equalsIgnoreCase(".mpc")) {
			player = new MPCPlayer();
		}
	}

	@Override
	public String play(String format) {
		if (format.equalsIgnoreCase(".vlc")) {
			return player.playVLC();
		} else if (format.equalsIgnoreCase(".mpc")) {
			return player.playMPC();
		} else {
			throw new IllegalArgumentException("Not supported");
		}
	}
}
