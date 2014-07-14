package com.sirma.itt.javacourse.designpattern.adapter;

/**
 * Player specialised in opening .mpc video files.
 * 
 * @author radoslav
 */
public class MPCPlayer implements AdvancedPlayer {

	@Override
	public String playVLC() {
		return null;
	}

	@Override
	public String playMPC() {
		return "MPCPlayer";
	}

}
