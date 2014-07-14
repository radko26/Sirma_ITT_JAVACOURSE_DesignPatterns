package com.sirma.itt.javacourse.designpattern.adapter;

/**
 * Player specialised in opening .vlc files only.
 * 
 * @author radoslav
 */
public class VLCPlayer implements AdvancedPlayer {

	@Override
	public String playVLC() {
		return "VLCPlayer";
	}

	@Override
	public String playMPC() {
		return null;
	}

}
