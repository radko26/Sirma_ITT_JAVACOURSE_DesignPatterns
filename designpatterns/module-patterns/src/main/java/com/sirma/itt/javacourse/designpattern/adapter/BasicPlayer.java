package com.sirma.itt.javacourse.designpattern.adapter;

/**
 * Build in player that opens .avi video files only.For more specific video
 * formats it passes the file to {@link VideoAdapter} and it plays it with other
 * players.
 * 
 * @author radoslav
 */
public class BasicPlayer implements VideoPlayer {

	@Override
	public String play(String format) {
		if (format.equals(".avi")) {
			return "BasicPlayer";
		} else {
			return new VideoAdapter(format).play(format);
		}

	}

}
